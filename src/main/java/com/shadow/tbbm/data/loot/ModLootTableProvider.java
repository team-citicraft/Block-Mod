package com.shadow.tbbm.data.loot;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;

import static com.shadow.tbbm.core.init.BlockInit.*;

public class ModLootTableProvider extends BlockLootTables {
    @Override
    protected void addTables() {
        dropSelf(H_S_W.get());
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> BlocksMod.MOD_ID.equals(block.getRegistryName().getNamespace()))
                .collect(Collectors.toSet());
    }
}
