package com.leeple.network.event;


import com.leeple.network.utils.ColorUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemManager implements Listener {
    public static ItemStack enchantDia;

    private static ItemStack builditem(Material type, int amount, String displayName, String... lore) {
        ItemStack stack = new ItemStack(type, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        stack.setItemMeta(meta);
        return stack;
    }

    public static final ItemStack dia = builditem(Material.DIAMOND, 1, ChatColor.WHITE +"[ EVENT ] 이벤트 다이아",ChatColor.GREEN +"이플서버 1주년기념 다이아이다");
}



