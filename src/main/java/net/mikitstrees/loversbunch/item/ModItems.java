package net.mikitstrees.loversbunch.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mikitstrees.loversbunch.LoversBunch;
import net.mikitstrees.loversbunch.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LoversBunch.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LoversBunch.LOGGER.info("Registering Mod Items for " + LoversBunch.MOD_ID);
    }
}