package de.theskyscout.challlenge.builder;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.lang.reflect.Field;
import java.util.UUID;

public class CustomHeadBuilder {


    public static ItemStack createSkull(String url, String name) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        if(url.isEmpty()) return head;
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", url));

        try {
            Field profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        head.setItemMeta(headMeta);
        return head;
    }

    public enum  Heads{
        //Add Ur Heads
        WOOD_ARROW_RIGHT("MTliZjMyOTJlMTI2YTEwNWI1NGViYTcxM2FhMWIxNTJkNTQxYTFkODkzODgyOWM1NjM2NGQxNzhlZDIyYmYifX19", "wood_arrow_right"),
        WOOD_ARROW_LEFT("YmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ==", "wood_arrow_left"),
        HEAD_CHEST_PLAYER("ZTc4Mzc2OGMzZmQxN2ZjN2U0ZTc0YTlhMDlmMmYxMDY4ODkwNzFjZTQ3MGVhNjA5Y2FmMGRhN2JkMGNkOTkyYiJ9fX0=", "head_chest_player");


        private String idTag;
        private ItemStack item;
        private String prefix = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv";
        private Heads(String texture, String id) {
            item = createSkull(prefix + texture, id);
            idTag = id;

        }
        public ItemStack getItemStack() {
        return item;
        }

        public String getName() {
            return idTag;
        }
    }
    
    //get ur Head
    public static ItemStack getHead(String id, String displayname) {
        for(Heads heads : Heads.values()) {
            if(heads.getName().equals(id)) {
                ItemStack item = heads.getItemStack();
                ItemMeta meta = item.getItemMeta();
                meta.setDisplayName(displayname);
                item.setItemMeta(meta);
                return item;
            }
        }
        return null;
    }


}
