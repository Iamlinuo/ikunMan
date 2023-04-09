package li_nuo.ikunman;

//Author:steam-404
//Author:Iamlinuo

import li_nuo.ikunman.PlayerAttackAnimal.playerAttackChicken;
import li_nuo.ikunman.PlayerJoinService.playerJoinService;
import li_nuo.ikunman.PlayerLeaveService.playerLeaveService;
import li_nuo.ikunman.PlayerRespawn.playerRespawn;
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

        //玩家攻击生物鸡
        this.getServer().getPluginManager().registerEvents(new playerAttackChicken(), this);
        //玩家加入服务器
        this.getServer().getPluginManager().registerEvents(new playerJoinService(), this);
        //玩家离开服务器
        this.getServer().getPluginManager().registerEvents(new playerLeaveService(), this);
        //玩家重生
        this.getServer().getPluginManager().registerEvents(new playerRespawn(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Logger logger = this.getLogger();
        String serviceStop = "插件卸载成功";
        logger.info(serviceStop);

    }
}
