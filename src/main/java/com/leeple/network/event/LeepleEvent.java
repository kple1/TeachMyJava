package com.leeple.network.event;

import com.leeple.network.utils.ColorUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class LeepleEvent implements Listener {

    public static final ItemStack dia = new ItemStack(Material.DIAMOND, 1);

    @EventHandler
    public void breakStone(BlockBreakEvent e) {
        Material brBlock = e.getBlock().getBlockData().getMaterial();
        if(brBlock == Material.COBBLESTONE || brBlock == Material.STONE){
            if(Math.floor(Math.random() * 100)< 1){
                Player p = e.getPlayer();
                p.getInventory().addItem(ItemManager.dia);
                p.sendMessage(ColorUtils.chat( "&f[ &aEVENT &f] &e이플서버 1주년&f기운이 맴도는 다이아를 얻으셨습니다!"));
            }
        }
    }
}