package me.rabbitdegamer.coffee;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import me.rabbitdegamer.coffee.commands.Command_cappuccino;
import me.rabbitdegamer.coffee.commands.Command_espresso;
import me.rabbitdegamer.coffee.commands.Command_getcoffeebrewer;
import me.rabbitdegamer.coffee.commands.Command_latte;
import me.rabbitdegamer.coffee.commands.Command_mocha;

public class CoffeeMain extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("Coffee has been enabled");
		this.getCommand("espresso").setExecutor(new Command_espresso());
		this.getCommand("cappuccino").setExecutor(new Command_cappuccino());
		this.getCommand("latte").setExecutor(new Command_latte());
		this.getCommand("mocha").setExecutor(new Command_mocha());
		this.getCommand("getcoffeebrewer").setExecutor(new Command_getcoffeebrewer());
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Coffee is disabled");
	
	}
	@EventHandler
	public void playerJoin(PlayerJoinEvent e) {
		Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Welcome to RabbitFreedom! -CoffeeWelcomer plugin made by RabbitDeGamer");

	}
	
}
