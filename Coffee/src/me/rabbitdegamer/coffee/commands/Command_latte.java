package me.rabbitdegamer.coffee.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class Command_latte implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("latte") && sender instanceof Player);
		Player s = (Player) sender;
		s.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10000, 6));
		s.sendMessage(ChatColor.BLUE + "You drank a latte!");
		return true;
		
	}
	
}
