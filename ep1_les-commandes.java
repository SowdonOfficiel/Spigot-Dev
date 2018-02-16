public class CommandTest implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("test")){
			if(sender instanceof Player){
				Player p = (Player) sender;
				
				if(args.length == 0){
					p.sendMessage("§2Bravo §c" + p.getName());
					return true;
				}
				
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("youtube")){
						p.sendMessage("§2Bravo §c" + p.getName() + " §7tu as réussi ta vie !");
					}
				}
				
			}
		}
		
		return false;
	}

}
