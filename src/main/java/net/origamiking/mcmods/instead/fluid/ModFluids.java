package net.origamiking.mcmods.instead.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.instead.Insteadmain;

public class ModFluids{
    public static FlowableFluid STILL_ACID;
    public static FlowableFluid FLOWING_ACID;
    public static Block ACID_BLOCK;
    public static Item ACID_BUCKET;
    public static void register() {
        STILL_ACID = Registry.register(Registries.FLUID, new Identifier(Insteadmain.MOD_ID, "acid"), new AcidFluid.Still());
        FLOWING_ACID = Registry.register(Registries.FLUID, new Identifier(Insteadmain.MOD_ID, "flowing_acid"), new AcidFluid.Flowing());
        ACID_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Insteadmain.MOD_ID, "acid_block"), new FluidBlock(ModFluids.STILL_ACID, FabricBlockSettings.copyOf(Blocks.LAVA)){ });
        ACID_BUCKET = Registry.register(Registries.ITEM, new Identifier(Insteadmain.MOD_ID, "acid_bucket"), new BucketItem(ModFluids.STILL_ACID, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }      
}
