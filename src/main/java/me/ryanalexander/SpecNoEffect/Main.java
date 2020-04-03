package me.ryanalexander.SpecNoEffect;

import me.ryanalexander.SpecNoEffect.Events.PlayerEvents;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        // Register Events

        (Bukkit.getServer().getPluginManager()).registerEvents(new PlayerEvents(),this);

    }

}
