package com.shadow.tbbm;

import com.shadow.tbbm.core.init.BlockInit;
import com.shadow.tbbm.core.init.ItemInit;
import com.shadow.tbbm.core.itemgroup.MainItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Testing the WebHook

@Mod("tbbm")
@Mod.EventBusSubscriber(modid = BlocksMod.MOD_ID,  bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlocksMod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tbbm";

    public BlocksMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(MainItemGroup.MAIN))
                    .setRegistryName(block.getRegistryName()));

        });
    }
    private static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> create(IForgeRegistry<T> registry) {
        return DeferredRegister.create(registry, MOD_ID);
    }



}
