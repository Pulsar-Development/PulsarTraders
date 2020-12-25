package org.Pulsar.PulsarTraders.Listeners;

import org.Pulsar.PulsarTraders.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public class InvHandler implements Listener {

	private Main main;

	public InvHandler(Main main) {
		this.main = main;
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onClose(InventoryCloseEvent e) {
		if (isPulsarInventory(e.getInventory())) {
			e.getPlayer().removeMetadata("ptraders-page", main);
		}
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (isPulsarInventory(e.getInventory())) {
			// inv click handle
		}
	}

	private boolean isPulsarInventory(Inventory inventory) {
		if (inventory != null) {
			// check inv
		}
		return false;
	}

}
