package com.shadow.tbbm.init;

import com.shadow.tbbm.BlocksMod;
import com.shadow.tbbm.blockfeatures.RotBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            BlocksMod.MOD_ID);

    public static final RegistryObject<RotBlock> H_S_W = BLOCKS.register("h_s_w", () -> new RotBlock(AbstractBlock.Properties.from(Blocks.OAK_PLANKS)));
}
