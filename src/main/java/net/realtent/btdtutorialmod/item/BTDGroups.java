package net.realtent.btdtutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.realtent.btdtutorialmod.BTDTutorialMod;

public class BTDGroups {
    public static final ItemGroup BTD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BTDTutorialMod.MOD_ID, "btd"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.btd"))
                    .icon(() -> new ItemStack(BTDItems.CASH)).entries((displayContext, entries) -> {
                        entries.add(BTDItems.CASH);
                        entries.add(BTDItems.MONKEY_MONEY);

                        entries.add(Items.IRON_SWORD);
                    }).build());
    public static void registerItemGroups(){
        BTDTutorialMod.LOGGER.info("Registering Item Groups for " + BTDTutorialMod.MOD_ID);
    }
}
