package wtf.flaily.violet.core.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wtf.flaily.violet.VioletVeil;

/**
 * @author flaily
 * @version 1.0.0
 * @implNote This class will register every item
 **/
public class VioletItems {
    public static final Item VIOLITE = registerItem("violite", new Item(new Item.Settings()
            .maxCount(16)
    ));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot", new Item(new Item.Settings()));
    public static final Item AMETHYST_NUGGET = registerItem("amethyst_nugget", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(VioletVeil.MOD_ID, name), item);
    }

    public static void registerItems() {
        VioletVeil.LOGGER.info("Registering every item for " + VioletVeil.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(VIOLITE);
            fabricItemGroupEntries.add(AMETHYST_INGOT);
            fabricItemGroupEntries.add(AMETHYST_NUGGET);
        });
    }

}
