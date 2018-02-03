package me.rabbitdegamer.coffee.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_mocha implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("mocha") && sender instanceof Player);
		Player s = (Player) sender;
		s.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 10));
		s.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000, 10));
		s.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 5, 50));
		s.sendMessage(ChatColor.BLUE + "You drank mocha and shocked for a while!");
		return true;
		
	}
	
}
