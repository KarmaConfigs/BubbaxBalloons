package be.feeps.epicballoons.balloons;

import be.feeps.epicballoons.config.LangConfig;
import be.feeps.epicballoons.utils.ItemsUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Feeps on 16/08/2017
 */

public enum EpicHeads2 {
    Bee(       10, LangConfig.Msg.InventoryAnimalBee.toString(),       "bee", new ItemStack(ItemsUtils.getCustomSkull("NTlhYzE2ZjI5NmI0NjFkMDVlYTA3ODVkNDc3MDMzZTUyNzM1OGI0ZjMwYzI2NmFhMDJmMDIwMTU3ZmZjYTczNiJ9fX0="))),
    AngryBee( 11, LangConfig.Msg.InventoryAnimalBeeAngry.toString(), "angrybee", new ItemStack(ItemsUtils.getCustomSkull("ZDg5MTZlYTFmZmIzOWYxM2RiYmY0ZTYyNDQ5ZGQyY2JkNWQyODEyZjQxNGU5NzYwOGFmMDYwOWUxMzlkNjExNSJ9fX0="))),
    Monkey(      12, LangConfig.Msg.InventoryAnimalMonkey.toString(),      "monkey", new ItemStack(ItemsUtils.getCustomSkull("N2MzMmQ5Mzc3ZGVhMTllZDgzOTgyYzlhNzMwMWMxMmM0MjE2NjNhYzEwOGE1N2Y0ZWQwMzQ1OWNiNjg4NGEzYyJ9fX0="))),
    KingKong(      13, LangConfig.Msg.InventoryAnimalKingKong.toString(),      "kingkong", new ItemStack(ItemsUtils.getCustomSkull("MjU0ZmE1MTQzYTM1M2MyOWIyNTYyZjA4YmM4Y2JmYzBhYTNiN2JjYTYxZDEwYzI0MGQ5Yzg2YjA1ZDJlN2QyNiJ9fX0="))),
    CuteDog(       14, LangConfig.Msg.InventoryAnimalDog.toString(),       "cutedog", new ItemStack(ItemsUtils.getCustomSkull("NTViZTY0NDQxNmYwMjgyMmQ5ODgzNjk3NWVmZjk0MGMwZTE3ZmQ1YzJkNDllNDAyZmVmOTAwZTBmNWM4Zjg3OSJ9fX0="))),
    SovietDog(         15, LangConfig.Msg.InventoryAnimalDogSoviet.toString(),         "sovietdog", new ItemStack(ItemsUtils.getCustomSkull("ODAyMGUyNGFmNDJmNzM5MGY3MzkwY2EwZTkzYzRlNTMwMzhlODBmNTVkZjQ1N2U5ZjQ3MzcyZWMxM2JhMGM2MCJ9fX0="))),
    Dog(      16, LangConfig.Msg.InventoryAnimalDogNormal.toString(),      "dog", new ItemStack(ItemsUtils.getCustomSkull("Yjg2NTZjM2NjMjc0MTY1N2NlMjMyODU0YzUyMGJiZGZlZDdhZTIyMzJhOGIwNzNhY2FkMzU5N2Y0MDk4ZDgxZCJ9fX0="))),
    Creeper(     19, LangConfig.Msg.InventoryMobCreeper.toString(),      "creeper", ItemsUtils.getCustomSkull("ZWFiMzUwZGRiNjMwMzljYWY3ZGY2Njg4MmM2ZmI5ZDM1ZDU2NWRkYjI2YzZjMjFlOWY2YmI3NjIyZjQwODdiMSJ9fX0=")),
    SrCreeper(      20, LangConfig.Msg.InventoryMobCreeperSenior.toString(),      "srcreeper", ItemsUtils.getCustomSkull("YTE0ZGIwNWEzODVjNmJiMDQ3MGJkNTllY2M0ZTE0MjU2MzI4YTJhZWYwMGVjODI5YjMxMDg1NTI4NDZlNThhNyJ9fX0=")),
    Ghast(         21, LangConfig.Msg.InventoryMobGhast.toString(),         "ghast", ItemsUtils.getCustomSkull("NzhmNzdlZWVlZjZmZmIyZjY4MThlNTc2OTg3OTRhZTAzNTFhYjMyYmEyMzRkNjIxYzIyZmU0Y2U4ZTE1OTlkMiJ9fX0=")),
    Guardian(    22, LangConfig.Msg.InventoryMobGuardian.toString(),    "guardian", ItemsUtils.getCustomSkull("NDk1MjkwZTA5MGMyMzg4MzJiZDc4NjBmYzAzMzk0OGM0ZDAzMTM1MzUzM2FjOGY2NzA5ODgyM2I3ZjY2N2YxYyJ9fX0=")),
    Spider(  23, LangConfig.Msg.InventoryMobSpider.toString(),  "spider", ItemsUtils.getCustomSkull("Yzg3YTk2YThjMjNiODNiMzJhNzNkZjA1MWY2Yjg0YzJlZjI0ZDI1YmE0MTkwZGJlNzRmMTExMzg2MjliNWFlZiJ9fX0=")),
    CaveSpidoer(    24, LangConfig.Msg.InventoryMobSpiderCave.toString(),    "cavespider", ItemsUtils.getCustomSkull("NjA0ZDVmY2IyODlmZTY1YjY3ODY2ODJlMWM3MzZjM2Y3YjE2ZjM5ZDk0MGUzZDJmNDFjZjAwNDA3MDRjNjI4MiJ9fX0=")),
    EnderDragon(25, LangConfig.Msg.InventoryMobEnderDragon.toString(),"enddragon", ItemsUtils.getCustomSkull("ZTc3ZTZmZDNiOTMxNzE5ZDQ0ZWYwZjU3MThhMGZlMzQ2NDg2YmQzZTVlOTgwMGRmYmZjMjQ4YThjZjE0MDBiZSJ9fX0=")),
    PopCorns(       28, LangConfig.Msg.InventoryFoodPopCorns.toString(),       "popcorn", ItemsUtils.getCustomSkull("MTI3YTY4YzczNTY3NGYzY2JkNzE2NWQyMWNjZjYxY2MxN2Y0MDk1ZDhjNWU1M2Y3NmEzYTQ1MDZlYzk0NGEyYSJ9fX0=")),
    Pasta(29, LangConfig.Msg.InventoryFoodPasta.toString(),"pasta", ItemsUtils.getCustomSkull("ZjIzZGZkNGNlNTc3ODY5MTQ5NjhhMmIzYmE4MjE3M2JhN2M2Y2I4YmMwODQ0MmQ0MTMwY2IwOWM0YTAwMDk4MCJ9fX0=")),
    Cake(30, LangConfig.Msg.InventoryFoodCake.toString(),"cake", ItemsUtils.getCustomSkull("ZjY4N2FkNGE5ZWE4ZjJmZDY2M2MwOTdmZDkyMDU3NDljYzE2ZjE0YWMxMjg1NWZhNmZiNjkyOGZiZTkyODRhMyJ9fX0=")),
    Hamburguer(    31, LangConfig.Msg.InventoryFoodHamburguer.toString(),    "hamburguer", ItemsUtils.getCustomSkull("ZjdiOWYwOGFkYTRlOGJhNTg2YTA0ZWQyZTllMjVmZThiOWQ1NjhhNjY1MjQzZjljNjAzNzk5YTdjODk2NzM2In19fQ==")),
    Muffin(   32, LangConfig.Msg.InventoryFoodMuffin.toString(),   "muffin", ItemsUtils.getCustomSkull("MzllNWQ2YmZjNmRjOWFiMjQyMTE4Nzk5ZmFiODk5YTc4NWQxZWE2MjZhODQyMzJmOGE2NDZmZTlhNDA3ZTZkIn19fQ==")),
    Flan(    33, LangConfig.Msg.InventoryFoodFlan.toString(),    "flan", ItemsUtils.getCustomSkull("YTA5YWIxZWM2MzkyNGU4MzAxMGJhN2ZkNzQ0ZjAxYzc5MGFhOGI4Y2FmMDZjNzA3MzY1YjVmYmJmN2U2ZTk5ZiJ9fX0=")),
    Taco(  34, LangConfig.Msg.InventoryFoodTaco.toString(),  "taco", ItemsUtils.getCustomSkull("NGM4YjJlMTM0N2I3YWZiYmI2NDFjNTkwYjM2OWM2NWEyMmQxYThjZGMxZTBlZTQ0YzM2MzE4NTgwNWRiNGNlMCJ9fX0="));
    private int slot;
    private String name;
    private String permission;
    private ItemStack item;

    EpicHeads2(int slot, String name, String permission, ItemStack item){
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
