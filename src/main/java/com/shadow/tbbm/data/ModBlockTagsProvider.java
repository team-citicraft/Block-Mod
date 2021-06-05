package com.shadow.tbbm.data;

import com.shadow.tbbm.BlocksMod;
import com.shadow.tbbm.core.init.BlockInit;
import com.shadow.tbbm.core.init.TagsInit;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, BlocksMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void addTags() {
        //logs
        //blocks
        tag(TagsInit.Blocks.STORAGE_BLOCK_H_S_W).add(BlockInit.H_S_W.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(TagsInit.Blocks.STORAGE_BLOCK_H_S_W);
    }
}