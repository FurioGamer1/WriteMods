package fr.furiogamer.writemods.util;

import fr.furiogamer.writemods.Items.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class WriteTab extends CreativeTabs {
	
	public WriteTab(String label) {
		super(label);
		this.setBackgroundImageName(label + ".png");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.CARTE_ID);
	}

}
