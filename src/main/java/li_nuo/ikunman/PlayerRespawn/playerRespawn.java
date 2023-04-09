package li_nuo.ikunman.PlayerRespawn;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

// 玩家重生事件
public class playerRespawn implements Listener {
    @EventHandler
    public void on_playerRebirth(PlayerRespawnEvent playerRespawnEvent) {
        String player = playerRespawnEvent.getPlayer().getName();
        Bukkit.broadcastMessage("玩家" + player + "当场歇逼...");
    }
}
