package be.feeps.epicballoons.balloons;

import be.feeps.epicballoons.config.LangConfig;
import be.feeps.epicballoons.utils.ItemsUtils;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Feeps on 16/08/2017
 */

public enum EpicHeadsStaff {
    GlobalServer(10, ChatColor.translateAlternateColorCodes('&', "&dFounder &cGlobalServer"),"GlobalServer", new ItemStack(ItemsUtils.getCustomSkull("NGYxZmMyNzgwYmI4MjM0NGY0ZjNiODNhZGU3MjgzN2JlYmEzYmMwMDQ4Zjg0MjAwMDZlN2E2MDEzNzJlYjJhZSJ9fX0="))),
    iDemonz97( 11, ChatColor.translateAlternateColorCodes('&', "&dFounder &ciDemonz"), "iDemonz97", new ItemStack(ItemsUtils.getCustomSkull("NDMyMTQzNGM1NjkyYWJhMDFjZmRkZDc2MjQ3ZDViOThhN2M2MDQzYjZhNzJiMmIwZTQwNTY4NTQ1ZWE2MmY5ZSJ9fX0="))),
    KarmatiKuade(12, ChatColor.translateAlternateColorCodes('&', "&dConfig &bKarmatiKuade"),"KarmatiKuade", new ItemStack(ItemsUtils.getCustomSkull("MzRlOGIwMTljOWY0NGQ1MTc4NmIxMjcyYmY3MTIxOWUzNzYxZjdhYjA2YWRiNGM5NGE4NDYwMDk4YjNjN2MzMCJ9fX0="))),
    Extasiss(13, ChatColor.translateAlternateColorCodes('&', "&dCoord &4Extasiss"),"ExtasisS", new ItemStack(ItemsUtils.getCustomSkull("NDgyMTU0MTQ4YWZkMzcyYjFiMzQwYmZmNjhmY2IwN2U0MjM4ODcyZGZhMTZkZDQ4M2NjZjZiMWQ3OWMxOThkZiJ9fX0="))),
    xXAguila101Xx( 14, ChatColor.translateAlternateColorCodes('&', "&dCoord &4xXAguila101Xx"), "xXAguila101Xx", new ItemStack(ItemsUtils.getCustomSkull("Mjc3MGI2ZjcxYjk4ZmQyMmJkNDFjOGQxODY0ZGYzOTQ3NTMzNDYyNmQ0OTcyYzk2MDZiZDRjMWI4OWVhOWU5NyJ9fX0="))),
    NT_Ivan( 15, ChatColor.translateAlternateColorCodes('&', "&dCoord &4Indio"), "NT_iVAN13", new ItemStack(ItemsUtils.getCustomSkull("YTVlZjVjNTc2ZjNmOGVkNmUzNzMxNjNkNzE4MmQ3MGEyNTJiMDcwOTg0NTYyMWJmMjk0MzczOWVkYzRjYWQ1MyJ9fX0="))),
    Green( 16, ChatColor.translateAlternateColorCodes('&', "&dAdmin &aGreen"), "GreenGhost72", new ItemStack(ItemsUtils.getCustomSkull("N2EyYWU2ZDM2MjI1YjAzYmZiZDllZTcxYmI1ZjQzNTMwMTU5MjYwZTdhNjZhYTdkODQ1NzlhYTQ2YzM2OTI3ZiJ9fX0=")));

    private int slot;
    private String name;
    private String permission;
    private ItemStack item;

    EpicHeadsStaff(int slot, String name, String permission, ItemStack item){
        this.item = item;
        this.name = name;
        this.permission = permission;
        this.slot = slot;
    }

    public ItemStack getItem() {
        return this.item;
    }

    public String getName() {
        return this.name;
    }

    public String getPermission() {
        return "epicballoons." + this.permission;
    }

    public int getSlot() {
        return this.slot;
    }
}
