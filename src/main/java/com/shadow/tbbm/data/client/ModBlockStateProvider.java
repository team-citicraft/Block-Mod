//Credits realyusufismail
package com.shadow.tbbm.data.client;


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
      //put the block you want like this and after do the same for moditemsateProvider were i will sya were
    }
}
