package fr.furiogamer.writemods.Items;

import fr.furiogamer.writemods.Main;
import fr.furiogamer.writemods.gui.phone.GuiMenuPhone;
import fr.furiogamer.writemods.util.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemPhone extends Item implements IHasModel {
	
	public ItemPhone(String name) {
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
	@SideOnly(Side.CLIENT)
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {

		if(!worldIn.isRemote) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiMenuPhone(Minecraft.getMinecraft()));
		}

		return super.onItemRightClick(worldIn, player, hand);
		
	}

}