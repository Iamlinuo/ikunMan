package li_nuo.ikunman.PlayerAttackAnimal;

import org.bukkit.Bukkit;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

// 玩家攻击生物鸡
public class playerAttackChicken implements Listener {
    @EventHandler
    public void on_playerAttackChicken(EntityDamageByEntityEvent event) {

//
        Entity entity = event.getDamager();
        if (entity instanceof Player) {
            if (event.getEntity() instanceof Chicken) {
                Bukkit.broadcastMessage("生物鸡:哎呦,你~干~嘛~~~!");
            }
        }
    }
}
