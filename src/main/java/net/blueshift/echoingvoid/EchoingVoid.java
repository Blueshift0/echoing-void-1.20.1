package net.blueshift.echoingvoid;

import net.blueshift.echoingvoid.block.ModBlocks;
import net.blueshift.echoingvoid.item.ModItemGroups;
import net.blueshift.echoingvoid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoingVoid implements ModInitializer {
	public static final String MOD_ID = "echoingvoid";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}