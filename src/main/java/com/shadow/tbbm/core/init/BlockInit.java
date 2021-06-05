package com.shadow.tbbm.core.init;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            BlocksMod.MOD_ID);

    public static final RegistryObject<Block> H_S_W = BLOCKS
            .register("h_s_w",
                    () -> new Block(AbstractBlock.Properties.copy(Blocks.OAK_PLANKS)));
}
