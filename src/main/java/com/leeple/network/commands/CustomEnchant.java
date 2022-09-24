package com.leeple.network.commands;

import com.leeple.network.Main;
import com.leeple.network.event.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class CustomEnchant implements CommandExecutor, Listener {

    private Main plugin;

    public CustomEnchant(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            switch (args.length) {
                case 0:
                    sender.sendMessage("다이아가 지급되었습니다");
                    player.getInventory().addItem(ItemManager.dia);
                    break;
                case 1:
                    if(args[0].equalsIgnoreCase("enchant")) {
                        player.getInventory().addItem(ItemManager.enchantDia);
                        sender.sendMessage("인챈트 다이아가 지급되었습니다.");
                        break;
                    } else {
                        try {
                            int amount = Integer.parseInt(args[0]);
                            ItemStack dia = new ItemStack(ItemManager.dia);
                            dia.setAmount(amount);
                            player.getInventory().addItem(dia);
                            break;
                        } catch (NumberFormatException e) {
                            player.sendMessage("명령어가 올바르지 않습니다.");
                            return false;
                        } catch (Exception e) {
                            player.sendMessage("명령어가 올바르지 않습니다.");
                            return false;
                        }
                    }
                case 2:
                    try {
                        int amount = Integer.parseInt(args[1]);
                        ItemStack dia = new ItemStack(ItemManager.enchantDia);
                        dia.setAmount(amount);
                        player.getInventory().addItem(dia);
                        break;
                    } catch(NumberFormatException e) {
                        player.sendMessage("명령어가 올바르지 않습니다.");
                        return false;
                    } catch(Exception e){
                        player.sendMessage("명령어가 올바르지 않습니다.");
                        return false;
                    }
            }
        } else {
            sender.sendMessage("잘못된 접근 방식입니다.");
        }
        return false;
    }
}
