package net.voidcraft;

/**
 * Created by Intent on 7/27/2017.
 */
public class Reference {

    public static final String MODID = "voidcraft";
    public static final String VERSION = "1.0";
    public static final String NAME = "Voidcraft";
    public static final String ACCEPTEDVERSIONS = "[1.10.2]";

    public static final String CLIENTPROXYCLASS = "net.voidcraft.proxy.ClientProxy";
    public static final String SERVERPROXYCLASS = "net.voidcraft.proxy.ServerProxy";
    public static final String UPDATEJSON = "https://raw.githubusercontent.com/intentionally/voidcraft/master/update.json";

    public enum VoidcraftItems {
        WAND("wand", "ItemWand");

        private String unlocalizedName;
        private String registryName;

        VoidcraftItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }
}
