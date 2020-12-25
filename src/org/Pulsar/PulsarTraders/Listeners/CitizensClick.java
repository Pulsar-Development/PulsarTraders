package org.Pulsar.PulsarTraders.Listeners;

import org.Pulsar.PulsarTraders.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.metadata.FixedMetadataValue;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import net.citizensnpcs.api.npc.NPC;

public class CitizensClick implements Listener {

	private Main main;

	public CitizensClick(Main main) {
		this.main = main;
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onClick(NPCRightClickEvent e) {
		if (isPulsarNPC(e.getNPC())) {
			e.getClicker().setMetadata("ptraders-page", new FixedMetadataValue(main, (byte) 1));
		}
	}

	private boolean isPulsarNPC(NPC npc) {
		// check if npc is pulsar one
		return false;
	}

}
