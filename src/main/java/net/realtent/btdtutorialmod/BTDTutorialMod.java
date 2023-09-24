package net.realtent.btdtutorialmod;

import net.fabricmc.api.ModInitializer;

import net.realtent.btdtutorialmod.block.BTDBlocks;
import net.realtent.btdtutorialmod.item.BTDGroups;
import net.realtent.btdtutorialmod.item.BTDGroups;
import net.realtent.btdtutorialmod.item.BTDItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BTDTutorialMod implements ModInitializer {
	public static final String MOD_ID = "btdtutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BTDGroups.registerItemGroups();

		BTDItems.registerModItems();
		BTDBlocks.registerModBlocks();
	}
}