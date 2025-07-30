package fun.magmarealms.magmaCore.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class trade implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory menu = Bukkit.createInventory(player, 9, ChatColor.RED + "Magma TRADE");

            ItemStack accept = createItem(Material.GREEN_STAINED_GLASS_PANE, ChatColor.GREEN + "ACCEPT");
            ItemStack deny = createItem(Material.RED_STAINED_GLASS_PANE, ChatColor.RED + "DENY");
            ItemStack none = createItem(Material.GRAY_STAINED_GLASS_PANE, " ");

            menu.setItem(0,accept);
            menu.setItem(1,none);
            menu.setItem(2,none);
            menu.setItem(4,none);
            menu.setItem(6,none);
            menu.setItem(7,none);
            menu.setItem(8,deny);

            player.openInventory(menu);
        }

        return true;
    }

    private ItemStack createItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            item.setItemMeta(meta);
        }
        return item;
    }

}
