package net.seba.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup; //poner o dejarlo como comentario dependiendo del group
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
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
    /*El en el caso 1 se agrega un item "raw_tanzanite" al grupo de MISC (miscelaneos)
    En el caso 2 se agrega un item al grupo creado por mi en ModItemGroup
    */
    //No uppercase
    //1)
    //public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //2)
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    public static final Item TANZANITE = registerItem("tanzanite", new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE)));

    //objeto nuevo
    public static final Item BLACK_AMONGUS = registerItem("black_amongus",new Item(new FabricItemSettings().group(ModItemGroup.AMONG_US)));

    public static final Item YELLOW_AMONGUS = registerItem("yellow_amongus",new Item (new FabricItemSettings().group(ModItemGroup.AMONG_US)));

    //ModItemGroup.AMONG_US
    public static final Item AMONG_US = registerItem("among_us",new Item(new FabricItemSettings().group(ModItemGroup.AMONG_US)));
}
