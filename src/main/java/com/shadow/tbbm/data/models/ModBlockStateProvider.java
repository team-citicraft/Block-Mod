package com.shadow.tbbm.data.models;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BlocksMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        //use it for all same side shape. Rundata after finish
        //example simpleBlock(BLACK_DIAMOND_ORE.get());
    }
}
