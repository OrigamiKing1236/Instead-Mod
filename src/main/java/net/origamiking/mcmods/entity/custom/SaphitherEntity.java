package net.origamiking.mcmods.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.FlyingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

import java.util.EnumSet;

public class SaphitherEntity extends FlyingEntity implements GeoAnimatable {
    
    private AnimatableInstanceCache factory = new AnimatableInstanceCache(this) {
        @Override
        public <T extends GeoAnimatable> AnimatableManager<T> getManagerForId(long l) {
            return null;
        }
    };

    public SaphitherEntity(EntityType<? extends FlyingEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 7.0D)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0f)
            .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(5, new FlyRandomlyGoal(this));
        //this.goalSelector.add(1, new MeleeAttackGoal(this, 1.2D, false));

        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return null;
    }

    @Override
    public double getTick(Object o) {
        return 0;
    }

    static class FlyRandomlyGoal extends Goal {
        public final SaphitherEntity saphitherEntity;

        public FlyRandomlyGoal(SaphitherEntity saphitherEntity) {
            this.saphitherEntity = saphitherEntity;
            this.setControls(EnumSet.of(Control.MOVE));
        }

        @Override
        public boolean canStart() {
            double f;
            double e;
            MoveControl moveControl = this.saphitherEntity.getMoveControl();
            if (!moveControl.isMoving()) {
                return true;
            }
            double d = moveControl.getTargetX() - this.saphitherEntity.getX();
            double g = d * d + (e = moveControl.getTargetY() - this.saphitherEntity.getY()) * e + (f = moveControl.getTargetZ() - this.saphitherEntity.getZ()) * f;
            return g < 1.0 || g > 3600.0;
        }

        @Override
        public boolean shouldContinue() {
            return false;
        }

        @Override
        public void start() {
            Random random = this.saphitherEntity.getRandom();
            double d = this.saphitherEntity.getX() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double e = this.saphitherEntity.getY() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double f = this.saphitherEntity.getZ() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.saphitherEntity.getMoveControl().moveTo(d, e, f, 1.0);
        }
    }

    private <E extends GeoAnimatable> PlayState predicate(AnimationState<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(RawAnimation.begin().thenPlay("animation.saphither.move"));
            return PlayState.CONTINUE;
        }


        event.getController().setAnimation(RawAnimation.begin().thenPlay("animation.saphither.idle"));
        return PlayState.CONTINUE;
    }


    public void registerControllers(AnimatableManager animationData) {
        animationData.addController(new AnimationController<GeoAnimatable>(this, "controller",
         0, this::predicate));
    }

    public AnimatableInstanceCache getFactory() {
        return factory;
    }
    @Override
    public boolean handleFallDamage(float fallDistance, float damageMultiplier, DamageSource damageSource) {
        return false;
    }

    @Override
    protected void fall(double heightDifference, boolean onGround, BlockState state, BlockPos landedPosition) {
    }

    @Override
    public void travel(Vec3d movementInput) {
        if (this.canMoveVoluntarily() || this.isLogicalSideForUpdatingMovement()) {
            if (this.isTouchingWater()) {
                this.updateVelocity(0.02f, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(0.8f));
            } else if (this.isInLava()) {
                this.updateVelocity(0.02f, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(0.5));
            } else {
                float f = 0.91f;
                if (this.onGround) {
                    f = this.world.getBlockState(new BlockPos(this.getX(), this.getY() - 1.0, this.getZ())).getBlock().getSlipperiness() * 0.91f;
                }
                float g = 0.16277137f / (f * f * f);
                f = 0.91f;
                if (this.onGround) {
                    f = this.world.getBlockState(new BlockPos(this.getX(), this.getY() - 1.0, this.getZ())).getBlock().getSlipperiness() * 0.91f;
                }
                this.updateVelocity(this.onGround ? 0.1f * g : 0.02f, movementInput);
                this.move(MovementType.SELF, this.getVelocity());
                this.setVelocity(this.getVelocity().multiply(f));
            }
        }
        this.updateLimbs(this, false);
    }

    @Override
    public boolean isClimbing() {
        return false;
    }
}

