package net.mikitstrees.loversbunch.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mikitstrees.loversbunch.LoversBunch;
import net.mikitstrees.loversbunch.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LOVERS_BUNCH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LoversBunch.MOD_ID, "lovers_bunch_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.BUTTERCUP)) //group icon
                    .displayName(Text.translatable("itemGroup.loversbunch.lovers_bunch_items"))
                    .entries((displayContext, entries) -> { //group entries into this group, yoinks it from ModBlocks
                        entries.add(ModBlocks.BUTTERCUP);
                    }).build());

    public static void registerItemGroups() {
        LoversBunch.LOGGER.info("Registering Item Groups for " + LoversBunch.MOD_ID);
    }
}
