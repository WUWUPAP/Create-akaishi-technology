package com.wuwu.cat.itme;

import com.wuwu.cat.Creatakaishitechnology;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CATitems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Creatakaishitechnology.MODID);
    public static final DeferredItem<Item> CAT_CORE =
            ITEMS.register("cat_core",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> AKAISHI =
            ITEMS.register("akaishi",()->new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
