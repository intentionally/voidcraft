package net.voidcraft;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.voidcraft.proxy.CommonProxy;

/**
 * Created by Intent on 8/1/17.
 */

@Mod(modid = Voidcraft.modId, name = Voidcraft.name, version = "1.0")
public class Voidcraft {

    public static final String modId = "voidcraft";
    public static final String name = "Voidcraft";

    @SidedProxy(serverSide = "net.voidcraft.proxy.CommonProxy", clientSide = "net.voidcraft.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Voidcraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " entering preinit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(name + " entering init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(name + " entering postinit");
    }

}
