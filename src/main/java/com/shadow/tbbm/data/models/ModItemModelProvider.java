package com.shadow.tbbm.data.models;

import com.shadow.tbbm.BlocksMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

//Rundata when adding a new model
public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BlocksMod.MOD_ID, existingFileHelper);
    }


    @Override
    protected void registerModels() {
        //uses for this blocks and items.
        //example
        //withExistingParent("black_diamond_block", modLoc("block/black_diamond_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemhandHeld = getExistingFile(mcLoc("item/handheld"));

        //items
        //example
        builder(itemGenerated, "panel");
        builder(itemGenerated, "saw");
        //tools
        //example tool(itemhandHeld, "axe");
    }
    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder tool(ModelFile itemhandHeld, String name) {
        return getBuilder(name).parent(itemhandHeld).texture("layer0", "item/" + name);
    }
}
