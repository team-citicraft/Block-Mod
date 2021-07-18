package com.shadow.tbbm.data.models;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.shadow.tbbm.core.init.BlockInit.*;

//Rundata when adding a new model
public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BlocksMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        //use it for all same side shape. Rundata after finish
        //example simpleBlock(BLACK_DIAMOND_ORE.get());
        hswBlock();
    }
    @Override
    public void horizontalBlock(Block block, ModelFile model) {
        super.horizontalBlock(block, model);
        this.simpleBlockItem(block, model);
    }
    public void hswBlock() {
        ResourceLocation name = H_S_W.get().getRegistryName();
        assert name != null;
        BlockModelBuilder builder = this.models().withExistingParent(name.getPath(), "block/orientable");
        builder.texture("top", modLoc("block/side/s_w_t"));
        builder.texture("front", modLoc("block/side/h_s_w_s"));
        builder.texture("side", modLoc("block/side/h_s_w_s"));

        this.simpleBlockItem(H_S_W.get(), builder);
    }
}
