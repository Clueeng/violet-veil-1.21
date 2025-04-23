package wtf.flaily.violet;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wtf.flaily.violet.core.block.VioletBlocks;
import wtf.flaily.violet.core.item.VioletItemGroups;
import wtf.flaily.violet.core.item.VioletItems;

public class VioletVeil implements ModInitializer {
	public static final String MOD_ID = "violetveil";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("VioletVeil is starting up");
		VioletItemGroups.registerItemGroups();
		VioletItems.registerItems();
		VioletBlocks.registerBlocks();
	}
}