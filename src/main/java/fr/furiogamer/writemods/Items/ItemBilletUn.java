package fr.furiogamer.writemods.Items;

import fr.furiogamer.writemods.Main;
import fr.furiogamer.writemods.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBilletUn extends Item implements IHasModel {
    
    public ItemBilletUn(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.WRITE_TAB);
        ItemInit.ITEMS.add(this);
    }


    @Override
    public void registerModel() {
        Main.proxy.registerItemRenderer(this, 0);
    }
}
