package net.seba.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.seba.tutorialmod.TutorialMod;

public class ModItems {
    public static void registerModItems(){
        TutorialMod.LOGGER.debug("Registering Mod items for : "+ TutorialMod.MOD_ID);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(TutorialMod.MOD_ID,name),item);
    }
    //No uppercase
    //public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));


}
