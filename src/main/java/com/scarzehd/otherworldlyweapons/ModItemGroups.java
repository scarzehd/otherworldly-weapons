package com.scarzehd.otherworldlyweapons;

import com.scarzehd.otherworldlyweapons.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VOID_ITEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(OtherworldlyWeapons.MOD_ID, "void_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.VOIDSHELL_INGOT))
            .displayName(Text.translatable("itemGroup.otherworldly-weapons.void_items"))
            .entries((context, entries) -> {
                entries.add(ModItems.VOIDGEL_ORB);
                entries.add(ModItems.VOIDSHELL_INGOT);
                entries.add(ModItems.CRUCIBLE);
                entries.add(ModItems.ORTHOS_PRIME);
                entries.add(ModItems.SHIELD_BELT);
                entries.add(ModItems.TRUE_KNIFE);
            }).build());

    public static void registerItemGroups() {
        OtherworldlyWeapons.LOGGER.info("Registering Item Groups");
    }
}