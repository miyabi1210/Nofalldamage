package falldamage.plugin;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.entity.EntityDamageEvent.DamageCause;
import cn.nukkit.plugin.PluginBase;

public class falldamage extends PluginBase implements Listener {
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getLogger().info("§a起動しました　§bby miyabi1210");

	}
	@EventHandler
	public void onEntityDamageEvent(EntityDamageEvent event) {
		if(event.getCause() == DamageCause.FALL) {
			event.setCancelled();
		}
	}

}





