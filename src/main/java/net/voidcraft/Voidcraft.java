package net.voidcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.voidcraft.init.ModItems;
import net.voidcraft.proxy.CommonProxy;

@Mod(modid = Reference.MODID, version = Reference.VERSION, updateJSON = Reference.UPDATEJSON)
public class Voidcraft {

    @Mod.Instance
    public static Voidcraft instance;

    @SidedProxy(clientSide = Reference.CLIENTPROXYCLASS, serverSide = Reference.SERVERPROXYCLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(Reference.NAME + " preinitialization");
        ModItems.init();
        ModItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println(Reference.NAME + " initialization");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.NAME + " postinitialization");

    }
}
