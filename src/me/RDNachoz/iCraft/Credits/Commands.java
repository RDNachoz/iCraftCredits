package me.RDNachoz.iCraft.Credits;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	public Main plugin;
	public Commands(Main main) {
		this.plugin = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = null;
		if(label.equalsIgnoreCase("icraft") || label.equalsIgnoreCase("ic")){
			if (!(sender instanceof Player)){
				if (args.length == 0 || args[0].equalsIgnoreCase("help")){
					sender.sendMessage(ChatColor.DARK_AQUA + "/icraft cr buy <Amount over 250>" + ChatColor.RED + "- Allows You To Purchase Credits With REAL Money");
					sender.sendMessage(ChatColor.DARK_AQUA + "/icraft cr" + ChatColor.RED + "- Check Your Current Credits!");
					sender.sendMessage(ChatColor.DARK_AQUA + "/icraft cr donate <Name> <Amount>" + ChatColor.RED + "Donate Some Of Your Credits to A Player!");
					sender.sendMessage(ChatColor.DARK_AQUA + "/icraft cr give <Name> <Amount>" + ChatColor.RED + "- Give a Player Some Credits!");
				}
			}
		}
		return true;
	}
}
