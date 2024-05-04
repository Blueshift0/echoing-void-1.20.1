package net.blueshift.echoingvoid.item;

import net.blueshift.echoingvoid.EchoingVoid;
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
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                    }).build());
    public static void registerItemGroups() {
        EchoingVoid.LOGGER.info("Registering Item Group for" + EchoingVoid.MOD_ID);
    }

}

