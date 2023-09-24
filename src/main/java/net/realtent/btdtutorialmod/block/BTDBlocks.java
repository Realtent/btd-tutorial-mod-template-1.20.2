package net.realtent.btdtutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.realtent.btdtutorialmod.BTDTutorialMod;

public class BTDBlocks {
    public static final Block CASH_CRATE = registerBlock("cash_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BTDTutorialMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BTDTutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void  registerModBlocks(){
        BTDTutorialMod.LOGGER.info("Registering BTD Blocks for " + BTDTutorialMod.MOD_ID);
    }
}
