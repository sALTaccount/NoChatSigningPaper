package com.salt.papernochatsigning;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        JavaPlugin plugin = JavaPlugin.getProvidingPlugin(ChatListener.class);
        plugin.getLogger().info("Removing chat signing from message: " + event.getMessage());
        String originalMessage = event.getMessage();
        // Add a space to the end of the message
        // Messages are crypographically signed by the server, so modifying the message server side
        // will break the signing and cause the messages to be unreportable
        String modifiedMessage = originalMessage + " ";
        // Set the modified message back to the event
        event.setMessage(modifiedMessage);
    }
}
