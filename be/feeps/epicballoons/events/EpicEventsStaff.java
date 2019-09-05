package be.feeps.epicballoons.events;

import be.feeps.epicballoons.balloons.EpicBalloonsStaff;
import be.feeps.epicballoons.inventories.EpicInventoryStaff;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Feeps on 16/08/2017
 */

public class EpicEventsStaff implements Listener{

    private ArmorStand armorStand;

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        if(EpicBalloonsStaff.epicBalloonsMapStaff.containsKey(player))
            EpicBalloonsStaff.epicBalloonsMapStaff.get(player).remove();
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        if (event.getInventory() == null) return;
        if (event.getCurrentItem() == null) return;
        if (!(event.getWhoClicked() instanceof Player)) return;
        Player player = (Player) event.getWhoClicked();
        if(!EpicInventoryStaff.epicInventoryMapStaff.containsKey(player)) return;
        if(!event.getInventory().getName().equals(EpicInventoryStaff.epicInventoryMapStaff.get(player).getInventory().getName())) return;
        if (event.getCurrentItem().getType() == Material.AIR) return;

        EpicInventoryStaff.epicInventoryMapStaff.get(player).onClick(event);
    }
}
