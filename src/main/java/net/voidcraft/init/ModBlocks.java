package net.voidcraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.voidcraft.blocks.BlockCheese;

/**
 * Created by Intent on 7/28/17.
 */
public class ModBlocks {

    public static Block cheese;

    public static void init() {
        cheese = new BlockCheese();

    }

    public static void register() {
        GameRegistry.register(cheese);

    }

    public static void registerRenders() {
        registerRender(cheese);
    }

    private static void registerRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }
}
