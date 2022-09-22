package com.leeple.network.event;

import com.leeple.network.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitMessage implements Listener {

    @EventHandler
    public void Join(PlayerJoinEvent e) {
        Player p = e.getPlayer(); // 플레이어 정보를 가져옴

        if (!p.hasPlayedBefore()) { // ! <- not문 반대의 의미를 가지게 만듬.

            e.setJoinMessage(ColorUtils.chat("&f[&aNEWBIE&f] &f%player%님이 &3서버에 처음 접속하셨습니다.")
                    .replace("%player%", p.getPlayer().getName()));

            /*
             replace는 다시 채우다라는 뜻을 가지고있다.
             %player%를 p.getDisplayeName()으로 바꾼다.
             */

        } else {
            e.setJoinMessage(ColorUtils.chat("&f[&a+&f] &f%player%님이 서버에 접속하셨습니다.")
                    .replace("%player%", p.getPlayer().getName()));

        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();

        e.setQuitMessage(ColorUtils.chat("&f[&c-&f] &f%player%님이 서버에서 나가셨습니다.")
                .replace("%player%", p.getPlayer().getName()));

    }


}
