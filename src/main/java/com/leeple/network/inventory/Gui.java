package com.leeple.network.inventory;

import com.leeple.network.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Gui implements Listener {
    private final Inventory inv;
    private Main plugin;

    public Gui(Main plugin) {
        this.plugin = plugin;
    }

    private void initItemSetting() {
        inv.setItem(0, new ItemStack(Material.COAL_BLOCK));
        inv.setItem(1, new ItemStack(Material.IRON_BLOCK));
        inv.setItem(2, new ItemStack(Material.GOLD_BLOCK));
        inv.setItem(3, new ItemStack(Material.LAPIS_BLOCK));
        inv.setItem(4, new ItemStack(Material.EMERALD_BLOCK));
        inv.setItem(5, new ItemStack(Material.DIAMOND_BLOCK));
        inv.setItem(6, new ItemStack(Material.NETHERITE_BLOCK));
        inv.setItem(7, new ItemStack(Material.OBSIDIAN));
        inv.setItem(8, new ItemStack(Material.BEDROCK));
        }

    public Gui() {
        this.inv = Bukkit.createInventory(null,54,"메뉴");
        initItemSetting();
    }

    public void open(Player player){
        player.openInventory(inv);
    }
}
