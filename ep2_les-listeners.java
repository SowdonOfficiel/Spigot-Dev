# Class PlayerJoin


public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		
		Player p = event.getPlayer();
		
		event.setJoinMessage(p.getName() + " à rejoint le server !");
		
		p.sendMessage("Coucou, bienvenue sur le server !");
		
		p.getInventory().clear();
		p.getInventory().addItem(new ItemStack(Material.COMPASS));
		
		
	}

}


# Class PlayerQuit


public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		
		e.setQuitMessage(null);
	}

}
