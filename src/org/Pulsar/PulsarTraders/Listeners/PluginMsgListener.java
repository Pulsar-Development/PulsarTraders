package org.Pulsar.PulsarTraders.Listeners;

import org.Pulsar.PulsarTraders.Main;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class PluginMsgListener implements PluginMessageListener {
	
	private Main main;
	
	public PluginMsgListener(Main main) {
		this.main = main;
		main.getServer().getMessenger().registerIncomingPluginChannel(main, "pulsar:system", this);
	}

	@Override
	public void onPluginMessageReceived(String channel, Player p, byte[] message) {
		
	}

}
