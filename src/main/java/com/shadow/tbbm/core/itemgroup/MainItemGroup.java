package com.shadow.tbbm.core.itemgroup;

import com.shadow.tbbm.core.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MainItemGroup extends ItemGroup {

    public static final MainItemGroup MAIN = new MainItemGroup(ItemGroup.TABS.length, "main");

    public MainItemGroup(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.H_S_W.get());
    }
}
