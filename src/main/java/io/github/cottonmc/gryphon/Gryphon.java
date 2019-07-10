package io.github.cottonmc.gryphon;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class Gryphon implements ModInitializer {

	@Override
	public void onInitialize() {
		System.out.println("Gryphon engaged!");
		//TODO: make a recursive file-copy system for exporting configs

		final FabricLoader loader = FabricLoader.getInstance();
		final Path export = loader.getModContainer("gryphon")
				.orElseThrow(IllegalStateException::new).getPath("config");
		final Path configs = loader.getConfigDirectory().toPath();

//		try (Stream<Path> stream = Files.walk(export)) {
//			stream.forEachOrdered(sourcePath -> {
//
//				try {
//					Files.copy(
//							/*Source Path*/
//							sourcePath,
//							/*Destination Path */
							//throws because source and dest path are different path types
//							export.resolve(configs.relativize(sourcePath)));
//				} catch (Exception e) {
//					System.out.println("Config not exported: " + e);
//					e.printStackTrace();
//				}
//			});
//		} catch (IOException e) {
//			System.out.println("Config not exported: " + e);
//			e.printStackTrace();
//		}

	}
}
