package be.feeps.epicballoons.inventories;

import be.feeps.epicballoons.balloons.EpicBalloons;
import be.feeps.epicballoons.balloons.EpicHeads;
import be.feeps.epicballoons.config.LangConfig;
import be.feeps.epicballoons.utils.ItemsUtils;
import net.minecraft.server.v1_8_R1.Item;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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

public class EpicInventory {
    public static Map<Player, EpicInventory> epicInventoryMap = new HashMap<>();
    private Inventory inventory;
    private Player player;

    public EpicInventory(Player player){
        this.player = player;
        this.inventory = Bukkit.createInventory(null, 45, LangConfig.Msg.InventoryName.toString());
        epicInventoryMap.put(this.player, this);
    }

    private void create(){
        for(EpicHeads heads : EpicHeads.values()){
            if(this.player.hasPermission(heads.getPermission())){
                this.setItem(heads.getItem(), heads.getSlot(), heads.getName(), Collections.singletonList(LangConfig.Msg.InventoryLoreHasPermission.toString()));
            }else {
                this.setItem(heads.getItem(), heads.getSlot(), heads.getName(), Collections.singletonList(LangConfig.Msg.InventoryLoreNoPermission.toString()));
            }

        }
        if(EpicBalloons.epicBalloonsMap.containsKey(this.player)) {
            this.setItem(new ItemStack(ItemsUtils.getCustomSkull("ZmU2NGVkNzljYTE4ZmIzNjE5YmE1YjUyN2ViY2U4ZjhiZTFlZmI3YmQxOWZmM2FjNTAxYjVhMWIyYjU5YTZkZCJ9fX0=")), 40, LangConfig.Msg.InventoryItemRemoveBalloon.toString(), Collections.singletonList(LangConfig.Msg.InventoryRemoveDesc.toString()));
        }
        this.setItem(new ItemStack(ItemsUtils.getCustomSkull("ZDM0ZWYwNjM4NTM3MjIyYjIwZjQ4MDY5NGRhZGMwZjg1ZmJlMDc1OWQ1ODFhYTdmY2RmMmU0MzEzOTM3NzE1OCJ9fX0=")), 36, LangConfig.Msg.InventoryItemNextMenu.toString(), Collections.singletonList(LangConfig.Msg.InventoryNextDesc.toString()));
        this.setItem(new ItemStack(ItemsUtils.getCustomSkull("NjQ3Y2YwZjNiOWVjOWRmMjQ4NWE5Y2Q0Nzk1YjYwYTM5MWM4ZTZlYmFjOTYzNTRkZTA2ZTMzNTdhOWE4ODYwNyJ9fX0=")), 44, LangConfig.Msg.InventoryItemCloseMenu.toString(), Collections.singletonList(LangConfig.Msg.InventoryCloseDesc.toString()));
    }

    public void onClick(InventoryClickEvent event) {
        ItemStack item = event.getCurrentItem();
        if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryLoreHasPermission.toString())) {
            if (EpicBalloons.epicBalloonsMap.containsKey(this.player)) {
                EpicBalloons.epicBalloonsMap.get(this.player).setItem(item);
            } else {
                new EpicBalloons(this.player, item).spawn();
            }
            this.player.closeInventory();
        } else {
            if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryLoreNoPermission.toString())) {
                this.player.closeInventory();
                this.player.sendMessage(LangConfig.Msg.MessagesNoPermission.toPrefix());
            } else {
                if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryNextDesc.toString())) {
                    this.player.closeInventory();
                    new EpicInventory2(player).openInv();
                } else {
                    if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryRemoveDesc.toString())) {
                        if (EpicBalloons.epicBalloonsMap.containsKey(this.player)) {
                            EpicBalloons.epicBalloonsMap.get(this.player).remove();
                            this.player.closeInventory();
                        }
                    } else {
                        if (item.getItemMeta().getLore().get(0).equalsIgnoreCase(LangConfig.Msg.InventoryCloseDesc.toString())) {
                            this.player.closeInventory();
                        }
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
        epicInventoryMap.remove(this.player, this);
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
