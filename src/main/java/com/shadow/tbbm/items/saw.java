package com.shadow.tbbm.items;

import com.shadow.tbbm.core.itemgroup.MainItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class saw extends Item {
    public saw() {
        super(new Item.Properties().tab(MainItemGroup.MAIN).stacksTo(1));
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }


    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }
}
