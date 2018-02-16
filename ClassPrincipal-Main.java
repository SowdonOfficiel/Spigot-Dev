import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.sowdon.ytb.commands.CommandTest;
import fr.sowdon.ytb.listeners.PlayerJoin;
import fr.sowdon.ytb.listeners.PlayerQuit;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		System.out.println("ok");
		
		getCommand("test").setExecutor(new CommandTest());
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerJoin(), this);
		pm.registerEvents(new PlayerQuit(), this);
		
		
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("nop");
		
		super.onDisable();
	}

}
