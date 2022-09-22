package com.leeple.network;

import com.leeple.network.event.ItemManager;
import com.leeple.network.event.JoinQuitMessage;
import com.leeple.network.event.LeepleEvent;
import com.leeple.network.utils.ColorUtils;
import commands.Menu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

    private final static Logger Log = Bukkit.getLogger(); // 버킷에 LOG 띄울 때

    public void onEnable() { // 플러그인이 켜졌을 때

        Log.info(ColorUtils.chat("&eLeeple Network &7Plugin &aenable"));

        Bukkit.getPluginManager().registerEvents(new LeepleEvent(), this);
        Bukkit.getPluginManager().registerEvents(new JoinQuitMessage(), this); // 플러그인 가져올때 [Class]
        Bukkit.getPluginManager().registerEvents(new ItemManager(), this);
        Bukkit.getPluginManager().registerEvents(new Menu(), this);
        Objects.requireNonNull(getServer().getPluginCommand("menu")).setExecutor(new Menu());
    }




    public void onDisable() { // 플러그인이 꺼졌을 때

        Log.info(ColorUtils.chat("Leeple Network Plugin disable"));

    }

}
