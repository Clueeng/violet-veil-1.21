package wtf.flaily.violet.core.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import wtf.flaily.violet.VioletVeil;
import wtf.flaily.violet.core.block.VioletBlocks;

public class VioletItemGroups {
    public static final ItemGroup VIOLET_VEILS_ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP, Identifier.of(VioletVeil.MOD_ID, "violet_veil_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(VioletItems.AMETHYST_INGOT))
                    .displayName(Text.translatable("itemgroup.violetveil.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(VioletItems.AMETHYST_INGOT);
                        entries.add(VioletItems.VIOLITE);
                        entries.add(VioletBlocks.AMETHYST_BRICK);
                        entries.add(VioletBlocks.PURE_AMETHYST_BLOCK);
                        entries.add(VioletBlocks.AMETHYST_ORE);

                    }).build()
    );

    public static void registerItemGroups() {

    }

}
