package li_nuo.ikunman.PlayerLeaveService;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

//玩家离开服务器
public class playerLeaveService implements Listener {
    @EventHandler
    public void on_playerLeaveService(PlayerQuitEvent playerQuitEvent) {
        //参与事件的玩家
        Player player = playerQuitEvent.getPlayer();

        //获取玩家昵称
        String GameUser = player.getName();

        //语句拼接
        String PlayerLeave = ChatColor.GOLD + "厉害捏!";
        PlayerLeave += ChatColor.DARK_GREEN + "小黑子\t";
        PlayerLeave += ChatColor.DARK_GREEN + GameUser;
        PlayerLeave += ChatColor.DARK_GREEN + "\t离开了服务器";

        //将信息发送给当前在线的玩家
        playerQuitEvent.setQuitMessage(PlayerLeave);
    }
}
