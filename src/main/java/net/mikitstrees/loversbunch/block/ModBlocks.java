package net.mikitstrees.loversbunch.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikitstrees.loversbunch.LoversBunch;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.OOZING, 4, Block.Settings.copy(Blocks.ALLIUM)));
    public static final Block POTTED_BUTTERCUP = registerBlockWithoutBlockItem("potted_buttercup",
            new FlowerPotBlock(BUTTERCUP, Block.Settings.copy(Blocks.POTTED_ALLIUM)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(LoversBunch.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LoversBunch.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LoversBunch.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LoversBunch.LOGGER.info("Registering Mod Blocks for " + LoversBunch.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }
}