package dev.mruniverse.bsfo;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlockStaffForOthers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CommandListener(),this);
    }
}
