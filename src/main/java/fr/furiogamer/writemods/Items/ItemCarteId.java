package fr.furiogamer.writemods.Items;

import fr.furiogamer.writemods.Main;
import fr.furiogamer.writemods.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemCarteId extends Item implements IHasModel {
		
	public ItemCarteId(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.WRITE_TAB);
		this.setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {
		
		return super.onItemRightClick(worldIn, player, hand);
		
	}

}
