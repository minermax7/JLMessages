package net.minermax7.jlmessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
	}
	public void onDisable() {}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		
		Bukkit.broadcast("", "");
		
        e.setJoinMessage(ChatColor.DARK_GREEN + "[" + 
        				 ChatColor.GREEN + "+" + 
        				 ChatColor.DARK_GREEN + "]" + 
        				 ChatColor.GREEN + " " + 
        				 p.getName());
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent e)
	{
		Player p = e.getPlayer();
		
		Bukkit.broadcast("", "");
		
		e.setQuitMessage(ChatColor.DARK_RED + "[" + 
				 ChatColor.RED + "-" + 
				 ChatColor.DARK_RED + "]" + 
				 ChatColor.RED + " " + 
				 p.getName());
	}
	
}
