package fun.magmarealms.magmaCore;

import fun.magmarealms.magmaCore.events.TradeHandler;
import org.bukkit.event.inventory.TradeSelectEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MagmaCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Commands
        getCommand("pl").setExecutor(new fun.magmarealms.magmaCore.commands.pluginsEcho());
        getCommand("plugins").setExecutor(new fun.magmarealms.magmaCore.commands.pluginsEcho());
        getCommand("trade").setExecutor(new fun.magmarealms.magmaCore.commands.trade());

        // Events
        getServer().getPluginManager().registerEvents(new TradeHandler(), this);

        getLogger().info("Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin has been disabled!");
    }
}
