package net.realtent.btdtutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.realtent.btdtutorialmod.BTDTutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;

public class BTDItems {
    public static final Item MONKEY_MONEY = registerItem("monkey_money", new Item(new FabricItemSettings()));
    public static final Item CASH = registerItem("cash", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(MONKEY_MONEY);
        entries.add(CASH);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(BTDTutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        BTDTutorialMod.LOGGER.info("Registering BTD Items for " + BTDTutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(BTDItems::addItemsToIngredientItemGroup);
    }
}
