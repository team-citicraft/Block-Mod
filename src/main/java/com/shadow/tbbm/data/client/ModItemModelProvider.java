package com.shadow.tbbm.data.client;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BlocksMod.MOD_ID, existingFileHelper);
    }



    @Override
    protected void registerModels() {
        //here you will do the models for the blocks and items.
        withExistingParent("h_s_w", modLoc("block/h_s_w"));//the first one will be the name of the file.
        //the second will be location. For vanila datagenertor the location have to be block not blocks its stupid.
        //Same applies to items

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated")); //for normal items
        ModelFile itemhandHeld = getExistingFile(mcLoc("item/handheld")); //for handheld items such as a swords

        //items
        builder(itemGenerated, "panel");
        builder(itemGenerated, "saw");


        //tools
        //example from my mod for a tool
        // tool(itemhandHeld, "heatblast_sword");
    }
        private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
            return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
        }
        private ItemModelBuilder tool(ModelFile itemhandHeld, String name) {
            return getBuilder(name).parent(itemhandHeld).texture("layer0",  "item/" + name);
        }



}
