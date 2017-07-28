package net.voidcraft.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.voidcraft.Reference;
import net.voidcraft.items.ItemWand;

/**
 * Created by Intent on 7/27/2017.
 */
public class ModItems {

    public static Item wand;

    public static void init() {
        wand = new ItemWand();
    }

    public static void register() {
        GameRegistry.register(wand);
    }

    public static void registerRenders() {
        registerRender(wand);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }
}
