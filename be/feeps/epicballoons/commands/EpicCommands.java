package be.feeps.epicballoons.commands;

import be.feeps.epicballoons.balloons.EpicBalloons;
import be.feeps.epicballoons.balloons.EpicBalloonsStaff;
import be.feeps.epicballoons.config.LangConfig;
import be.feeps.epicballoons.inventories.EpicInventory;
import be.feeps.epicballoons.inventories.EpicInventoryStaff;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Feeps on 16/08/2017
 */

public class EpicCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {

            if (strings.length == 0) {

                new EpicInventory((Player) sender).openInv();
                return true;
            } else {
                if (strings[0].equalsIgnoreCase("remove") || strings[0].equalsIgnoreCase("reset"))
                {
                    if (EpicBalloons.epicBalloonsMap.containsKey(sender)) {
                        EpicBalloons.epicBalloonsMap.get(sender).remove();

                    } else {
                        if (EpicBalloonsStaff.epicBalloonsMapStaff.containsKey(sender)) {
                            EpicBalloonsStaff.epicBalloonsMapStaff.get(sender).remove();
                        } else {
                            ((Player) sender).getPlayer().sendMessage(LangConfig.Msg.MessagesNotUsingBalloon.toPrefix());
                        }
                    }
                } else {
                    if (strings[0].equalsIgnoreCase("staff"))
                    {
                        if (((Player) sender).getPlayer().hasPermission("epicballoons.staff"));
                        {
                            new EpicInventoryStaff((Player) sender).openInv();
                        }
                    } else {

                        new EpicInventory((Player) sender).openInv();
                        return true;
                    }
                }
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(LangConfig.Msg.MessagesFromConsole.toPrefix());
        }
        return true;
    }
}
