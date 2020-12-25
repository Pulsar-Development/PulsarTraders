package org.Pulsar.PulsarTraders.Commands;

import org.Pulsar.PulsarTraders.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Manager implements CommandExecutor {
	
	private Main main;
	
	public Manager(Main main) {
		this.main = main;
		main.getCommand("pulsartraders").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		return false;
	}

}
