package fun.magmarealms.magmaCore.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class TradeHandler implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {

        final String TRADE_MENU = ChatColor.RED + "Magma TRADE";

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(TRADE_MENU)) {
            switch (e.getCurrentItem().getType()) {
                case RED_STAINED_GLASS_PANE:
                    player.sendMessage(ChatColor.RED + "You have cancelled the trade.");
                    player.closeInventory();
                    break;
                case GREEN_STAINED_GLASS_PANE:
                    player.sendMessage(ChatColor.GREEN + "TRADE done.");
                    player.closeInventory();
                    break;
                case GRAY_STAINED_GLASS_PANE:
                    player.closeInventory();
                    break;
                default:
                    break;
            }
        }
    }

}
