package me.rabbitdegamer.coffee.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_espresso implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("espresso") && sender instanceof Player);
		Player s = (Player) sender;
		s.sendMessage(ChatColor.BLUE + "You drank an espresso!");
		s.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9000, 10));
		return true;
		
	}
	
}
