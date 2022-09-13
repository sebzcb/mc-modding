package net.seba.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.seba.tutorialmod.TutorialMod;
import net.seba.tutorialmod.item.ModItemGroup;

public class ModBlocks {
    //fourth step
    /*
    FabricBlockSettings.of(). -> experimentar
    strenght -> fuerza

    */
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),ModItemGroup.TANZANITE);
    //agregar segundo block
    /*OreBlock -> da experiencia cuando se mina
    UniformIntProvider.create(3,7) -> cantidad de experiencia que se dara
    strenght -> duracion del bloque al ser picado
    ore->  mineral
    * */
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3,7)),ModItemGroup.TANZANITE);
    //bloque de lata de cocacola
    public static final Block COCA_COLA_BLOCK = registerBlock("coca_cola_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(0.3f).requiresTool()),ModItemGroup.TANZANITE);
    //third step
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name,block,tab);
        return Registry.register(Registry.BLOCK,new Identifier(TutorialMod.MOD_ID,name),block);
    }
    //second step
    private static Item registerBlockItem(String name, Block block,ItemGroup tab ){
        return Registry.register(Registry.ITEM,new Identifier(TutorialMod.MOD_ID,name),
                new BlockItem(block,new FabricItemSettings().group(tab)));
    }

    //first step
    public static void registerModBlocks(){
        TutorialMod.LOGGER.debug("Registering ModBlock for tutorial "+ TutorialMod.MOD_ID);
    }
}
