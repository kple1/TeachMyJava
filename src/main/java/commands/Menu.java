package commands;

import com.leeple.network.Main;
import inventory.Gui;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Menu implements CommandExecutor, Listener {

    private Main plugin;

    public Menu(Main plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            Gui inv = new Gui();
            inv.open(player);
        }
        sender.sendMessage("메뉴 오픈");
        return false;
    }
}
