package dev.mruniverse.bsfo;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandListener implements Listener {

    private final String commandBlocked;

    public CommandListener(){
        commandBlocked = ChatColor.translateAlternateColorCodes('&',"&8[&6&lLatin&e&lPlay&8] &7Este comando esta&c desactivado&7.");
    }

    @EventHandler (priority = EventPriority.HIGHEST,ignoreCancelled = true)
    public void onCommand(PlayerCommandPreprocessEvent event) {
        String cmd = event.getMessage();

        if(!cmd.startsWith("/")) return;

        String[] args = cmd.split(" ");

        if(!args[0].contains("staff")) return;
        if(args.length >= 2){
            event.setCancelled(true);
            event.getPlayer().sendMessage(commandBlocked);
        }
    }

}
