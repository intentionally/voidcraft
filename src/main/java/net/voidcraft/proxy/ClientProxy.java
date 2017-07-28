package net.voidcraft.proxy;

import net.voidcraft.init.ModBlocks;
import net.voidcraft.init.ModItems;

/**
 * Created by Intent on 7/27/2017.
 */
public class ClientProxy implements CommonProxy {
    @Override
    public void init() {

        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
