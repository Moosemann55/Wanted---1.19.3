package net.conurian.wanted;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wanted implements ModInitializer {
	public static final String MOD_ID = "wanted";
	public static final Logger LOGGER = LoggerFactory.getLogger("wanted");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}