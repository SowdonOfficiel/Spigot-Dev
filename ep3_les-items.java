package fr.sowdon.ytb.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		
		Player p = event.getPlayer();
		
		event.setJoinMessage(p.getName() + " à rejoint le server !");
		
		p.sendMessage("Coucou, bienvenue sur le server !");
		
		p.getInventory().clear();
		//p.getInventory().addItem(new ItemStack(Material.COMPASS));
		
		
		ItemStack ccompass = new ItemStack(Material.COMPASS, 1);
		ItemMeta mcompass = ccompass.getItemMeta();
		mcompass.setDisplayName("§7Menu des jeux !");
		ccompass.setItemMeta(mcompass);
		
		p.getInventory().setItem(4, ccompass);
		
		
		ItemStack csword = new ItemStack(Material.DIAMOND_SWORD, 10);
		ItemMeta msword = csword.getItemMeta();
		msword.setDisplayName("§cSuper épée");
		msword.addEnchant(Enchantment.DAMAGE_ALL, 5000, true);
		msword.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		msword.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		csword.setItemMeta(msword);
		
		p.getInventory().setItem(0, csword);
		
		
		p.updateInventory(); // Version 1.8
		
		
		
	}

}
