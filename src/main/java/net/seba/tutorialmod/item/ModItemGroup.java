package net.seba.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.seba.tutorialmod.TutorialMod;
/*Aqui se crea un grupo de items (nueva columna dentro del inventario)*/
public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID,"tanzanite"),()-> new ItemStack(ModItems.TANZANITE));
    //Cree el grupo de items llamado among_us
    public static final ItemGroup AMONG_US = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID,"among_us"),()-> new ItemStack(ModItems.AMONG_US));
}
