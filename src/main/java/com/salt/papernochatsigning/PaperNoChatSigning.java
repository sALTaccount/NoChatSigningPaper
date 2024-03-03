package com.salt.papernochatsigning;

import org.bukkit.plugin.java.JavaPlugin;

public final class PaperNoChatSigning extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getLogger().info("Chat Signing has been disabled! Message reports are now disabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}