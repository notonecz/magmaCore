package fun.magmarealms.magmaCore;

import org.bukkit.plugin.java.JavaPlugin;

public final class MagmaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("pl").setExecutor(new fun.magmarealms.magmaCore.commands.pluginsEcho());
        getCommand("plugins").setExecutor(new fun.magmarealms.magmaCore.commands.pluginsEcho());
        getLogger().info("Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin has been disabled!");
    }
}
