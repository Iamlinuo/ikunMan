package li_nuo.ikunman.PlayerJoinService;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;

//玩家加入服务器
public class playerJoinService implements Listener {
    @EventHandler(priority = EventPriority.NORMAL)
    public void on_playerJoinService(PlayerJoinEvent playerJoinEvent) {

        //参与事件的玩家
        Player player = playerJoinEvent.getPlayer();

        //获取玩家昵称
        String GameUser = player.getName();

        //语句拼接
        String WelcomeTo_playerJoin = ChatColor.GOLD + "厉害捏!";
        WelcomeTo_playerJoin += ChatColor.DARK_GREEN + "玩家\t";
        WelcomeTo_playerJoin += ChatColor.DARK_GREEN + GameUser;
        WelcomeTo_playerJoin += ChatColor.DARK_GREEN + "\t加入了服务器\n";
        WelcomeTo_playerJoin += "@" + player.getName() + "靓仔,打球吗?";

        //将信息发送给当前在线的玩家
        playerJoinEvent.setJoinMessage(WelcomeTo_playerJoin);
    }
}
