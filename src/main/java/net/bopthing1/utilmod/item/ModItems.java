package net.bopthing1.utilmod.item;

import net.bopthing1.utilmod.UtilMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UtilMod.MOD_ID);

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

//    public static final RegistryObject<Item> RANDOM_POWERS = ITEMS.register("random_powers", () -> new Item(
//            new Item.Properties()
//                    .stacksTo(64)
//
//    ));
}
