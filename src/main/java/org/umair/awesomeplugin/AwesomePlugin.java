package org.umair.awesomeplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AwesomePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("AwesomePlugin is enabled :(");
    }

    @Override
    public void onDisable() {
        System.out.println("AwesomePlugin is disabled :(");
    }
}