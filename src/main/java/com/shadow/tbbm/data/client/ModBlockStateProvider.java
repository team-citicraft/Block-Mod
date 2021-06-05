//Credits RealYusufIsmail(Github)
package com.shadow.tbbm.data.client;


import com.shadow.tbbm.BlocksMod;
import com.shadow.tbbm.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BlocksMod.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
      //put the block you want like this and after do the same for ModItemModelProvider were i will say were

        //for a block with the same side. Note this is from my mod
        // simpleBlock(BlockInit.BLACK_DIAMOND_BLOCK.get());
        //for the axis you dont need to do anything ModItemModelProvider

        //does work Have to Run data
        horizontalBlock(BlockInit.H_S_W.get(), modLoc("block/side/h_s_w_s"), modLoc("block/side/s_w_t"), modLoc("block/side/s_w_t"));

            //horizontalFaceBlock(BlockInit.H_S_W.get(), , 180);

    }
}
