package org.dimdev.jeid.mixin.init;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.List;


public class JEIDMixinLoader implements ILateMixinLoader {
    public List<String> getMixinConfigs() {
        List<String> configs = new ArrayList<String>();

        if (Loader.isModLoaded("abyssalcraft")) {
            configs.add("mixins.jeid.abyssalcraft.json");
        }
        if (Loader.isModLoaded("advancedrocketry")) {
            configs.add("mixins.jeid.advancedrocketry.json");
        }
        if (Loader.isModLoaded("bewitchment")) {
            configs.add("mixins.jeid.bewitchment.json");
        }
        if (Loader.isModLoaded("biomesoplenty")) {
            configs.add("mixins.jeid.biomesoplenty.json");
        }
        if (Loader.isModLoaded("biometweaker")) {
            configs.add("mixins.jeid.biometweaker.json");
        }
        if (Loader.isModLoaded("bookeshelf")) {
            configs.add("mixins.jeid.bookshelf.json");
        }
        if (Loader.isModLoaded("compactmachines")) {
            configs.add("mixins.jeid.compactmachines.json");
        }
        if (Loader.isModLoaded("creepingnether")) {
            configs.add("mixins.jeid.creepingnether.json");
        }
        if (Loader.isModLoaded("cubicchunks")) {
            configs.add("mixins.jeid.cubicchunks.json");
        }
        if (Loader.isModLoaded("cyclopscore")) {
            configs.add("mixins.jeid.cyclopscore.json");
        }
        if (Loader.isModLoaded("extrautils2")) {
            configs.add("mixins.jeid.extrautils2.json");
        }
        if (Loader.isModLoaded("gaiadimension")) {
            configs.add("mixins.jeid.gaiadimension.json");
        }
        if (Loader.isModLoaded("geographicraft")) {
            configs.add("mixins.jeid.geographicraft.json");
        }
        if (Loader.isModLoaded("hammercore")) {
            configs.add("mixins.jeid.hammercore.json");
        }
        if (Loader.isModLoaded("journeymap")) {
            configs.add("mixins.jeid.journeymap.json");
        }
        if (Loader.isModLoaded("mystcraft")) {
            configs.add("mixins.jeid.mystcraft.json");
        }
        if (Loader.isModLoaded("thaumcraft")) {
            configs.add("mixins.jeid.thaumcraft.json");
        }
        if (Loader.isModLoaded("thebetweenlands")) {
            configs.add("mixins.jeid.thebetweenlands.json");
        }
        if (Loader.isModLoaded("tofucraft")) {
            configs.add("mixins.jeid.tofucraft.json");
        }
        if (Loader.isModLoaded("tropicraft")) {
            configs.add("mixins.jeid.tropicraft.json");
        }
        if (Loader.isModLoaded("twilightforest")) {
            configs.add("mixins.jeid.twilightforest.json");
        }
        if (Loader.isModLoaded("worldedit")) {
            configs.add("mixins.jeid.worldedit.json");
        }

        return configs;
    }
}
