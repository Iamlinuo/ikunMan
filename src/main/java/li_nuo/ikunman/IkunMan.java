package li_nuo.ikunman;

import li_nuo.ikunman.PlayerAttackAnimal.playerAttackChicken;
import li_nuo.ikunman.PlayerJoinService.playerJoinService;
import li_nuo.ikunman.PlayerLeaveService.playerLeaveService;
import li_nuo.ikunman.PlayerMove.playerMove;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class IkunMan extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = this.getLogger();
        String serviceStart = "插件启动成功";
        logger.info(serviceStart);

        //功能插件
        this.getServer().getPluginManager().registerEvents(new playerAttackChicken(), this);

        this.getServer().getPluginManager().registerEvents(new playerJoinService(),this);

        this.getServer().getPluginManager().registerEvents(new playerLeaveService(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger logger = this.getLogger();
        String serviceStop = "插件卸载成功";
        logger.info(serviceStop);

    }
}
