package fr.furiogamer.writemods.Items;

import fr.furiogamer.writemods.Main;
import fr.furiogamer.writemods.util.IHasModel;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBilletCinq extends Item implements IHasModel {

	public ItemBilletCinq(String name) {
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