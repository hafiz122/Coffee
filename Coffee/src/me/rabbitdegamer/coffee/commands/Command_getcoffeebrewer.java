package me.rabbitdegamer.coffee.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_getcoffeebrewer implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getcoffeebrewer") && sender instanceof Player);
		
		Player s = (Player) sender;
		
		ItemStack coffeeBrewer = new ItemStack(Material.BREWING_STAND, 1);
		
		ItemMeta coffeeBrewerMeta = coffeeBrewer.getItemMeta();
		coffeeBrewerMeta.setDisplayName(ChatColor.BLUE + "Coffee Brewer");
		coffeeBrewer.setItemMeta(coffeeBrewerMeta);
		
		s.getInventory().addItem(coffeeBrewer);
		
		return true;
	}
	
}
