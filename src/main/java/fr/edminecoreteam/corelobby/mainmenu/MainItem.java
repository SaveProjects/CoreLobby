package fr.edminecoreteam.corelobby.mainmenu;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.edminecoreteam.corelobby.profile.settings.SettingInfo;
import fr.edminecoreteam.corelobby.utils.SkullNBT;

public class MainItem implements Listener
{
    private static ItemStack getSkull(String url) { return SkullNBT.getSkull(url); }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();
        ItemStack it = e.getCurrentItem();
        if (it == null) {  return; }
        if (it.getType() == Material.SKULL_ITEM)
        {
            if(it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMenu Principal §7• Clique"))
            {
                e.setCancelled(true);
                p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
                MainGui.gui(p);
            }
            if(it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMain Menu §7• Click"))
            {
                e.setCancelled(true);
                p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
                MainGui.gui(p);
            }
            if(it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMenú principal §7• Clic"))
            {
                e.setCancelled(true);
                p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
                MainGui.gui(p);
            }
            if(it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lHauptmenü §7• Sklick"))
            {
                e.setCancelled(true);
                p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
                MainGui.gui(p);
            }
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {

        Player p = e.getPlayer();
        Action a = e.getAction();
        ItemStack it = e.getItem();
        if (it == null) { return; }

        if (it.getType() == Material.SKULL_ITEM
                && it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMenu Principal §7• Clique")
                && (a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK || a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK))
        {
            e.setCancelled(true);
            p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
            MainGui.gui(p);
        }
        if (it.getType() == Material.SKULL_ITEM
                && it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMain Menu §7• Click")
                && (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK || a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK))
        {
            e.setCancelled(true);
            p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
            MainGui.gui(p);
        }
        if (it.getType() == Material.SKULL_ITEM
                && it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lMenú principal §7• Clic")
                && (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK || a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK))
        {
            e.setCancelled(true);
            p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
            MainGui.gui(p);
        }
        if (it.getType() == Material.SKULL_ITEM
                && it.getItemMeta().getDisplayName().equalsIgnoreCase("§b§lHauptmenü §7• Sklick")
                && (a == Action.RIGHT_CLICK_AIR || a == Action.RIGHT_CLICK_BLOCK || a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK))
        {
            e.setCancelled(true);
            p.playSound(p.getLocation(), Sound.CLICK, 0.5f, 0.5f);
            MainGui.gui(p);
        }
    }

    @EventHandler
    private void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();
        SettingInfo settingInfo = new SettingInfo(p);

        if (settingInfo.getLang() == 0)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMenu Principal §7• Clique");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 1)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMain Menu §7• Click");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 2)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMenú principal §7• Clic");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 3)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lHauptmenü §7• Sklick");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
    }

    public static void giveItem(Player p)
    {
        SettingInfo settingInfo = new SettingInfo(p);

        if (settingInfo.getLang() == 0)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMenu Principal §7• Clique");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 1)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMain Menu §7• Click");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 2)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lMenú principal §7• Clic");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
        if (settingInfo.getLang() == 3)
        {
            ItemStack profil = getSkull("http://textures.minecraft.net/texture/879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85");
            SkullMeta profilM = (SkullMeta)profil.getItemMeta();
            profilM.setDisplayName("§b§lHauptmenü §7• Sklick");
            profil.setItemMeta((ItemMeta)profilM);
            p.getInventory().setItem(0, profil);
        }
    }

}