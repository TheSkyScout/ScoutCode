//ur package

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LineBuilder {

    private Inventory inv;
    private Material mat;
    private String name;

    public LineBuilder(Inventory inv) {
        this.inv = inv;
    }
    public LineBuilder add(Material mat, String name) {
        this.mat = mat;
        this.name = name;
        return this;
    }
    
    //set the start and the end slot of the line
    public LineBuilder build(int begin, int end) {
        end++;
        for(int i=begin;i<end;i++) {
            ItemStack is = new ItemStack(mat);
            ItemMeta im = is.getItemMeta();
            im.setDisplayName(name);
            is.setItemMeta(im);
            inv.setItem(i, is);
        }
        return this;
    }
}
