package wtf.flaily.violet.core.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import wtf.flaily.violet.VioletVeil;

public class VioletBlocks {

    public static final Block AMETHYST_BRICK = registerBlock("amethyst_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(2f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            ));
    public static final Block AMETHYST_ORE = registerBlock("amethyst_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .strength(3f, 6.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GILDED_BLACKSTONE)
            ));
    public static final Block PURE_AMETHYST_BLOCK = registerBlock("pure_amethyst_block",
            new Block(AbstractBlock.Settings.create()
                            .strength(4.5f, 6.0f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.GILDED_BLACKSTONE)
            ));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VioletVeil.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(VioletVeil.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks() {
        VioletVeil.LOGGER.info("Registering blocks for " + VioletVeil.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(VioletBlocks.AMETHYST_BRICK);
            fabricItemGroupEntries.add(VioletBlocks.AMETHYST_ORE);
            fabricItemGroupEntries.add(VioletBlocks.PURE_AMETHYST_BLOCK);
        });
    }

}
