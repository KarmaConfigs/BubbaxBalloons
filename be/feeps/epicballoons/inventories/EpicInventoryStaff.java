package be.feeps.epicballoons.inventories;

import be.feeps.epicballoons.balloons.EpicBalloonsStaff;
import be.feeps.epicballoons.balloons.EpicHeadsStaff;
import be.feeps.epicballoons.config.LangConfig;
import be.feeps.epicballoons.utils.ItemsUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

/**
 * Created by Feeps on 16/08/2017
 */

public class EpicInventoryStaff {
    public static Map<Player, EpicInventoryStaff> epicInventoryMapStaff = new HashMap<>();
    private Inventory inventory;
    private Player player;
    private ArmorStand armorStand;

    public EpicInventoryStaff(Player player){
        this.player = player;
        this.inventory = Bukkit.createInventory(null, 45, ChatColor.translateAlternateColorCodes('&', "&6&lStaff"));
        epicInventoryMapStaff.put(this.player, this);
    }

    private void create(){
        for(EpicHeadsStaff heads : EpicHeadsStaff.values()){
            if(this.player.hasPermission(heads.getPermission())){
                this.setItem(heads.getItem(), heads.getSlot(), heads.getName(), Collections.singletonList(LangConfig.Msg.InventoryLoreHasPermission.toString()));
            }else {
                this.setItem(heads.getItem(), heads.getSlot(), heads.getName(), Collections.singletonList(LangConfig.Msg.InventoryLoreNoPermission.toString()));
            }

        }
        if(EpicBalloonsStaff.epicBalloonsMapStaff.containsKey(this.player)) {
            this.setItem(new ItemStack(ItemsUtils.getCustomSkull("ZmU2NGVkNzljYTE4ZmIzNjE5YmE1YjUyN2ViY2U4ZjhiZTFlZmI3YmQxOWZmM2FjNTAxYjVhMWIyYjU5YTZkZCJ9fX0=")), 40, LangConfig.Msg.InventoryItemRemoveBalloon.toString(), Collections.singletonList(LangConfig.Msg.InventoryRemoveDesc.toString()));
        }
    }

    public void onClick(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();
        if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryLoreHasPermission.toString())) {
            if (EpicBalloonsStaff.epicBalloonsMapStaff.containsKey(this.player)) {
                EpicBalloonsStaff.epicBalloonsMapStaff.get(this.player).setItem(item);
            } else {
                new EpicBalloonsStaff(this.player, item).spawn();
            }
            this.player.closeInventory();
        } else {
            if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryLoreNoPermission.toString())) {
                this.player.closeInventory();
                this.player.sendMessage(LangConfig.Msg.MessagesNoPermission.toPrefix());
            } else {
                if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryRemoveDesc.toString())) {
                    if (EpicBalloonsStaff.epicBalloonsMapStaff.containsKey(this.player)) {
                        EpicBalloonsStaff.epicBalloonsMapStaff.get(this.player).remove();
                        this.player.closeInventory();
                    }
                }
            }
        }
        event.setCancelled(true);
    }

    private void setItem(ItemStack item, int slot, String name, List<String> lore) {
        ItemMeta im = item.getItemMeta();
        im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES,
                ItemFlag.HIDE_DESTROYS,
                ItemFlag.HIDE_ENCHANTS,
                ItemFlag.HIDE_PLACED_ON,
                ItemFlag.HIDE_POTION_EFFECTS,
                ItemFlag.HIDE_UNBREAKABLE);
        if (name != null) {
            im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        }
        if (lore != null) {
            List<String> converted = new ArrayList<>();
            for (String string : lore) {
                converted.add(ChatColor.translateAlternateColorCodes('&', string));
            }
            im.setLore(converted);
        }
        item.setItemMeta(im);
        this.inventory.setItem(slot, item);
    }

    public void openInv(){
        this.player.openInventory(this.inventory);
        this.create();
    }

    public void closeInv(){
        epicInventoryMapStaff.remove(this.player, this);
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
