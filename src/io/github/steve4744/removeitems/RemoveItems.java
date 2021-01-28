package io.github.steve4744.removeitems;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RemoveItems extends JavaPlugin implements Listener {

	public void onEnable(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(this, this);
	}

	public void onDisable() {
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		player.getInventory().clear();
	}
}
