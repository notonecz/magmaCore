package fun.magmarealms.magmaCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.jetbrains.annotations.NotNull;

public class pluginsEcho implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender.isOp() || sender.hasPermission("MagmaCore.plugins")) {
            Bukkit.dispatchCommand(sender, "bukkit:pl");
            return true;
        }
        else {
            sender.sendMessage(
                    ChatColor.RESET + "Plugins (3): " +
                            ChatColor.GREEN + "Not" +
                            ChatColor.RESET + ", " +
                            ChatColor.GREEN + "your" +
                            ChatColor.RESET + ", " +
                            ChatColor.GREEN + "business"
            );
            return true;
        }
    }
}