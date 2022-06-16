package fr.furiogamer.writemods.Items;

import java.util.List;

import fr.furiogamer.writemods.Main;
import fr.furiogamer.writemods.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBottle extends Item implements IHasModel {
	
	private int waterGive;
	private float waterLiter;

	public ItemBottle(float waterLiter, int waterGive, String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.WRITE_TAB);
		this.setMaxStackSize(1);
		this.setMaxDamage((int)(waterLiter * 1000));
		this.waterGive = waterGive;
		this.waterLiter = waterLiter;
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0);
	}
	
	public EnumAction getItemUseAction(ItemStack itemstack) {
		return EnumAction.DRINK;
	}
	
	public int getMaxItemUseDuration(ItemStack itemstack) {
		return 60;
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		return onItemRightClick(stack, world, player);
	}


	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> list, ITooltipFlag bool) {
		list.add("§bBouteille de " + this.waterLiter + "L d'eau");
		float literLeft = this.waterLiter;
		list.add(literLeft + " L d'eau restant");
		super.addInformation(stack, worldIn, list, bool);
	}
}
