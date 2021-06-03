package com.shadow.tbbm.init;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlocksMod.MOD_ID);

    public static final RegistryObject<Item> PANEL = ITEMS.register("panel",
            () -> new Item(new Item.Properties().group(BlocksMod.TAB)));
}
