package net.blueshift.echoingvoid.item;

import net.blueshift.echoingvoid.EchoingVoid;
import net.blueshift.echoingvoid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ECHOING_VOID_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EchoingVoid.MOD_ID, "echoing_void"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.echoing_void"))
                    .icon(() -> new ItemStack(ModItems.TITANIUM_INGOT)).entries((displayContext, entries) -> {
                        // Titanium Stuff
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);

                    }).build());
    public static void registerItemGroups() {
        EchoingVoid.LOGGER.info("Registering Item Group for" + EchoingVoid.MOD_ID);
    }

}

