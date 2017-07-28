package net.voidcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.voidcraft.Reference;

/**
 * Created by Intent on 7/28/17.
 */
public class BlockCheese extends Block {

    public BlockCheese() {
        super(Material.CAKE);
        setUnlocalizedName(Reference.VoidcraftBlocks.CHEESE.getUnlocalizedName());
        setRegistryName(Reference.VoidcraftBlocks.CHEESE.getRegistryName());
    }
}
