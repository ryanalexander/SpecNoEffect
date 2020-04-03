package me.ryanalexander.SpecNoEffect.Events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.Potion;

public class PlayerEvents implements Listener {

    @EventHandler
    public void PlayerMove(PlayerMoveEvent e){
        // Check player is in Spectator
        if(e.getPlayer().getGameMode() == GameMode.SPECTATOR)
            e.getPlayer().getActivePotionEffects().clear();
    }

}
