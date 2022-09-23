package com.leeple.network;

import com.leeple.network.event.ItemManager;
import com.leeple.network.event.JoinQuitMessage;
import com.leeple.network.event.LeepleEvent;
import com.leeple.network.utils.ColorUtils;
import commands.CustomEnchant;
import commands.Menu;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class Main extends JavaPlugin {

    private final static Logger Log = Bukkit.getLogger(); // 버킷에 LOG 띄울 때
    public static Main plugin;

    public void onEnable() {

        Log.info(ColorUtils.chat("Leeple Network Plugin enable"));

        Bukkit.getPluginManager().registerEvents(new LeepleEvent(), this);
        Bukkit.getPluginManager().registerEvents(new JoinQuitMessage(), this);
        Bukkit.getPluginManager().registerEvents(new ItemManager(), this);
        Bukkit.getPluginManager().registerEvents(new Menu(this), this);
        Bukkit.getPluginManager().registerEvents(new CustomEnchant(this), this);
        Objects.requireNonNull(getServer().getPluginCommand("menu")).setExecutor(new Menu(this));
        Objects.requireNonNull(getServer().getPluginCommand("Give")).setExecutor(new CustomEnchant(this));
    }




    public void onDisable() {

        Log.info(ColorUtils.chat("Leeple Network Plugin disable"));

    }

}
