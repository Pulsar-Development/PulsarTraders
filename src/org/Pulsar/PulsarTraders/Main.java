package org.Pulsar.PulsarTraders;

import org.Pulsar.PulsarTraders.Commands.Manager;
import org.Pulsar.PulsarTraders.Listeners.CitizensClick;
import org.Pulsar.PulsarTraders.Listeners.InvHandler;
import org.Pulsar.PulsarTraders.Listeners.PluginMsgListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		send("&aPlugin enabled!");
		new CitizensClick(this);
		new InvHandler(this);
		new Manager(this);
		getServer().getMessenger().registerOutgoingPluginChannel(this, "pulsar:system");
		new PluginMsgListener(this);
	}
	
	public void onDisable() {
		send("&cPlugin disabled!");
	}
	
	public void send(String s) {
		getServer().getConsoleSender().sendMessage("[PulsarTraders] " + ChatColor.translateAlternateColorCodes('&', s));
	}

}
