package net.lizistired.starter;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Heelys implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String namespace = "heelys";
	public static final Logger LOGGER = LoggerFactory.getLogger(namespace);
	public static final ItemGroup EXAMPLE_MOD_GROUP = FabricItemGroupBuilder.create(
					new Identifier(namespace, "example_mod_group"))
			.icon(() -> new ItemStack(RegisterItems.CUSTOM_MATERIAL)) // This uses the model of the new material you created as an icon, but you can reference to whatever you like
			.build();


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		RegisterItems.register();
		LOGGER.info("Hello Fabric world!");
	}
}
