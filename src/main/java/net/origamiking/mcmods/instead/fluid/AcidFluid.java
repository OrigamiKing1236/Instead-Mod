package net.origamiking.mcmods.instead.fluid;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.*;

public abstract class AcidFluid extends FlowableFluid {
    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        final BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }
    @Override
    protected int getFlowSpeed(WorldView state) {
        return 4;
    }
    @Override
    protected int getLevelDecreasePerBlock(WorldView state) {
        return 1;
    }
    @Override
    public boolean matchesType(Fluid fluid) {
        return fluid == getStill() || fluid == getFlowing();
    }
    @Override
    public int getLevel(FluidState state) {
        return 0;
    }
    @Override
    public int getTickRate(WorldView var1) {
        return 10;
    }
    @Override
    protected float getBlastResistance() {
        return 100f;
    }
    @Override
    protected boolean canBeReplacedWith(FluidState var1, BlockView var2, BlockPos var3, Fluid var4, Direction var5) {
        return false;
    }
    @Override
    public Fluid getStill() {
        return ModFluids.STILL_ACID;
    }
    @Override
    public Fluid getFlowing() {
        return ModFluids.FLOWING_ACID;
    }
    @Override
    public Item getBucketItem() {
        return ModFluids.ACID_BUCKET;
    }
    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModFluids.ACID_BLOCK.getDefaultState().with(Properties.LEVEL_15, getBlockStateLevel(state));
    }
    @Override
    public boolean isStill(FluidState state) {
        return false;
    }
    public static class Flowing extends AcidFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
    }

        @Override
        protected boolean isInfinite(World world) {
            return true;
        }

        @Override
        public int getLevel(FluidState state) {
           return state.get(LEVEL);
    }
        @Override
        public boolean isStill(FluidState state) {
            return false;
        }
}
    public static class Still extends AcidFluid {
        @Override
        protected boolean isInfinite(World world) {
            return true;
        }
        @Override
        public int getLevel(FluidState state) {
            return 8;
        }
        @Override 
        public boolean isStill(FluidState state) {
            return true;
        }
        @Override
        public void onRandomTick(World world, BlockPos pos, FluidState state, Random random) {
            if (!world.getGameRules().getBoolean(GameRules.DO_FIRE_TICK)) {
                return;
            }
            int i = random.nextInt(3);
            if (i > 0) {
                BlockPos blockPos = pos;
                for (int j = 0; j < i; ++j) {
                    if (!world.canSetBlock(blockPos = blockPos.add(random.nextInt(3) - 1, 1, random.nextInt(3) - 1))) {
                        return;
                    }
                    BlockState blockState = world.getBlockState(blockPos);
                    if (blockState.isAir()) {
                        if (!this.canLightFire(world, blockPos)) continue;
                        world.setBlockState(blockPos, AbstractFireBlock.getState(world, blockPos));
                        return;
                    }
                    if (!blockState.getMaterial().blocksMovement()) continue;
                    return;
                }
            } else {
                for (int k = 0; k < 3; ++k) {
                    BlockPos blockPos2 = pos.add(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (!world.canSetBlock(blockPos2)) {
                        return;
                    }
                    if (!world.isAir(blockPos2.up()) || !this.hasBurnableBlock(world, blockPos2)) continue;
                    world.setBlockState(blockPos2.up(), AbstractFireBlock.getState(world, blockPos2));
                }
            }
        }
        private boolean canLightFire(World world, BlockPos blockPos) {
            return false;
        }
        private boolean hasBurnableBlock(World world, BlockPos blockPos2) {
            return false;
        }
      }
    }