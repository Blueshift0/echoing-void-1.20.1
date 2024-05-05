package net.blueshift.echoingvoid.block;

import net.blueshift.echoingvoid.EchoingVoid;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.spongepowered.tools.obfuscation.interfaces.IReferenceManager;

public class ModBlocks {
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
    new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.WHITE_GRAY).sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.WHITE_GRAY)));

    public static final Block TITANIUM_ORE = registerBlock("TITANIUM_ORE",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EchoingVoid.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EchoingVoid.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        EchoingVoid.LOGGER.info("Registering ModBlocks for" + EchoingVoid.MOD_ID);
    }
}
