package net.mikitstrees.loversbunch;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.mikitstrees.loversbunch.block.ModBlocks;
import net.mikitstrees.loversbunch.component.ModDataComponentTypes;
import net.mikitstrees.loversbunch.entity.ModEntities;
import net.mikitstrees.loversbunch.item.ModItemGroups;
import net.mikitstrees.loversbunch.item.ModItems;
import net.mikitstrees.loversbunch.sound.ModSounds;
import net.mikitstrees.loversbunch.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class LoversBunch implements ModInitializer {
	public static final String MOD_ID = "loversbunch";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

//		ModWorldGeneration.generateModWorldGeneration();

		ModSounds.registerSounds();

		ModDataComponentTypes.registerDataComponentTypes();
	}
}