package com.shadow.tbbm.data;

import com.shadow.tbbm.BlocksMod;
import com.shadow.tbbm.core.init.ItemInit;
import com.shadow.tbbm.core.init.TagsInit;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, BlocksMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        //blocks
        copy(TagsInit.Blocks.STORAGE_BLOCK_H_S_W, TagsInit.Items.STORAGE_BLOCK_H_S_W);

        //ingots
        tag(TagsInit.Items.INGOTS_PANEL).add(ItemInit.PANEL.get());
        tag(TagsInit.Items.INGOTS_SAW).add(ItemInit.SAW.get());



    }
}