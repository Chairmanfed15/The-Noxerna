package net.chairmanfed.noxerna.item.equipment.tools;

import net.chairmanfed.noxerna.item.equipment.NoxernaNeoItemAbilities;
import net.chairmanfed.noxerna.registry.NoxernaTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.ItemAbility;

public class PickadzeItem extends DiggerItem {
    public PickadzeItem(Tier tier, Item.Properties properties) {
        super(tier, NoxernaTags.BlockTags.MINEABLE_WITH_PICKADZE, properties);
    }
    @Override
    public boolean canPerformAction(ItemStack stack, ItemAbility itemAbility){
        return NoxernaNeoItemAbilities.DEFAULT_PICKADZE_ACTIONS.contains(itemAbility);
    }

    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        if (player != null && this.calculateHitResult(player).getType() == HitResult.Type.BLOCK) {
            player.startUsingItem(pContext.getHand());
        }

        return InteractionResult.CONSUME;
    }
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BRUSH;
    }

    public int getUseDuration(ItemStack pStack, LivingEntity pEntity) {
        return 200;
    }
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        if (pRemainingUseDuration >= 0 && pLivingEntity instanceof Player player) {
            HitResult hitresult = this.calculateHitResult(player);
            if (hitresult instanceof BlockHitResult blockhitresult) {
                if (hitresult.getType() == HitResult.Type.BLOCK) {
                    int i = this.getUseDuration(pStack, pLivingEntity) - pRemainingUseDuration + 1;
                    boolean flag = i % 10 == 5;
                    if (flag) {
                        BlockPos blockpos = blockhitresult.getBlockPos();
                        BlockState blockstate = pLevel.getBlockState(blockpos);
                        HumanoidArm humanoidarm = pLivingEntity.getUsedItemHand() == InteractionHand.MAIN_HAND ? player.getMainArm() : player.getMainArm().getOpposite();
                        if (blockstate.shouldSpawnTerrainParticles() && blockstate.getRenderShape() != RenderShape.INVISIBLE) {
                            this.spawnDustParticles(pLevel, blockhitresult, blockstate, pLivingEntity.getViewVector(0.0F), humanoidarm);
                        }

                        Block var15 = blockstate.getBlock();
                        SoundEvent soundevent;
                        if (var15 instanceof BrushableBlock) {
                            BrushableBlock brushableblock = (BrushableBlock)var15;
                            soundevent = brushableblock.getBrushSound();
                        } else {
                            soundevent = SoundEvents.BRUSH_GENERIC;
                        }

                        pLevel.playSound(player, blockpos, soundevent, SoundSource.BLOCKS);
                        if (!pLevel.isClientSide()) {
                            BlockEntity var18 = pLevel.getBlockEntity(blockpos);
                            if (var18 instanceof BrushableBlockEntity) {
                                BrushableBlockEntity brushableblockentity = (BrushableBlockEntity)var18;
                                boolean flag1 = brushableblockentity.brush(pLevel.getGameTime(), player, blockhitresult.getDirection());
                                if (flag1) {
                                    EquipmentSlot equipmentslot = pStack.equals(player.getItemBySlot(EquipmentSlot.OFFHAND)) ? EquipmentSlot.OFFHAND : EquipmentSlot.MAINHAND;
                                    pStack.hurtAndBreak(1, pLivingEntity, equipmentslot);
                                }
                            }
                        }
                    }

                    return;
                }
            }

            pLivingEntity.releaseUsingItem();
        } else {
            pLivingEntity.releaseUsingItem();
        }

    }
    private HitResult calculateHitResult(Player pPlayer) {
        return ProjectileUtil.getHitResultOnViewVector(pPlayer, (p_281111_) -> {
            return !p_281111_.isSpectator() && p_281111_.isPickable();
        }, pPlayer.blockInteractionRange());
    }
    private void spawnDustParticles(Level pLevel, BlockHitResult pHitResult, BlockState pState, Vec3 pPos, HumanoidArm pArm) {
        double d0 = 3.0;
        int i = pArm == HumanoidArm.RIGHT ? 1 : -1;
        int j = pLevel.getRandom().nextInt(7, 12);
        BlockParticleOption blockparticleoption = new BlockParticleOption(ParticleTypes.BLOCK, pState);
        Direction direction = pHitResult.getDirection();
        PickadzeItem.DustParticlesDelta brushitem$dustparticlesdelta = PickadzeItem.DustParticlesDelta.fromDirection(pPos, direction);
        Vec3 vec3 = pHitResult.getLocation();

        for(int k = 0; k < j; ++k) {
            pLevel.addParticle(blockparticleoption, vec3.x - (double)(direction == Direction.WEST ? 1.0E-6F : 0.0F), vec3.y, vec3.z - (double)(direction == Direction.NORTH ? 1.0E-6F : 0.0F), brushitem$dustparticlesdelta.xd() * (double)i * 3.0 * pLevel.getRandom().nextDouble(), 0.0, brushitem$dustparticlesdelta.zd() * (double)i * 3.0 * pLevel.getRandom().nextDouble());
        }

    }
    static record DustParticlesDelta(double xd, double yd, double zd) {
        private static final double ALONG_SIDE_DELTA = 1.0;
        private static final double OUT_FROM_SIDE_DELTA = 0.1;

        DustParticlesDelta(double xd, double yd, double zd) {
            this.xd = xd;
            this.yd = yd;
            this.zd = zd;
        }

        public static PickadzeItem.DustParticlesDelta fromDirection(Vec3 pPos, Direction pDirection) {
            double d0 = 0.0;
            PickadzeItem.DustParticlesDelta var10000;
            switch (pDirection) {
                case DOWN:
                case UP:
                    var10000 = new PickadzeItem.DustParticlesDelta(pPos.z(), 0.0, -pPos.x());
                    break;
                case NORTH:
                    var10000 = new PickadzeItem.DustParticlesDelta(1.0, 0.0, -0.1);
                    break;
                case SOUTH:
                    var10000 = new PickadzeItem.DustParticlesDelta(-1.0, 0.0, 0.1);
                    break;
                case WEST:
                    var10000 = new PickadzeItem.DustParticlesDelta(-0.1, 0.0, -1.0);
                    break;
                case EAST:
                    var10000 = new PickadzeItem.DustParticlesDelta(0.1, 0.0, 1.0);
                    break;
                default:
                    throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
        }

        public double xd() {
            return this.xd;
        }

        public double yd() {
            return this.yd;
        }

        public double zd() {
            return this.zd;
        }
    }
}
