package com.shadow.tbbm.core.init;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class TagsInit {
    public static final class Blocks {
        //ores
        //example form my mod
        //public static final ITag.INamedTag<Block> ORES_BLACK_DIAMOND = BlockTags.bind("forge:ores/black_diamond");


        //blocks

        public static final ITag.INamedTag<Block> STORAGE_BLOCK_H_S_W = BlockTags.bind("forge:log/h_s_w");



        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(BlocksMod.MOD_ID, path).toString());
        }
    }
    public static final class Items {

        //blocks
        public static final ITag.INamedTag<Item> STORAGE_BLOCK_H_S_W = ItemTags.bind("forge:storage_block/h_s_w");


        //items
        public static final ITag.INamedTag<Item> INGOTS_PANEL = ItemTags.bind("forge:ingots/panel");
        public static final ITag.INamedTag<Item> INGOTS_SAW = ItemTags.bind("forge:ingots/saw");



        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(BlocksMod.MOD_ID, path).toString());
        }
    }
}
