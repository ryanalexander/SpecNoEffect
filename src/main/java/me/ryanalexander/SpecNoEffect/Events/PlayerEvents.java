package me.ryanalexander.SpecNoEffect.Events;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;

public class PlayerEvents implements Listener {

    @EventHandler
    public void PlayerMove(PlayerMoveEvent e){
        // Check player is in Spectator
        if(e.getPlayer().getGameMode() == GameMode.SPECTATOR)
            for (PotionEffect effect : e.getPlayer().getActivePotionEffects())
                e.getPlayer().removePotionEffect(effect.getType());
    }

}
