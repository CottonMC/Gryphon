package io.github.cottonmc.gryphon;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Gryphon implements ModInitializer {

	@Override
	public void onInitialize() {
		System.out.println("Gryphon engaged!");
		//TODO: system to copy over config/external datapacks goes here

		final Path configs = FabricLoader.getInstance().getConfigDirectory().toPath();
		try (final InputStream export = Gryphon.class.getResourceAsStream("config")) {
			Files.copy(export, configs);
		} catch (final IOException e) {
			throw new RuntimeException("Extracting from 'config' to " + configs, e);
		}

	}
}
