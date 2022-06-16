package fr.furiogamer.writemods.proxy;

import fr.furiogamer.writemods.gui.atm.GuiMenuAtm;
import fr.furiogamer.writemods.gui.ingame.Events;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy {

	private static KeyBinding atmGui;

	public ClientProxy() {
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.register(new Events());
		FMLCommonHandler.instance().bus().register(this);

		// KeyBinding

		atmGui = new KeyBinding("Ouvrir l'atm", Keyboard.KEY_APOSTROPHE, "key.categories.gameplay");
		ClientRegistry.registerKeyBinding(atmGui);

		// Fin
	}

	@SubscribeEvent
	public void onEvent(InputEvent.KeyInputEvent event) {
		if(atmGui.isPressed()) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiMenuAtm(Minecraft.getMinecraft()));
		}
	}

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		super.preInit();
	}
	
	@Override
	public void registerEntityRenderers() {
		// TODO Auto-generated method stub
		super.registerEntityRenderers();
	}
	
	@Override
	public void registerItemRenderer(Item item, int meta) {

		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	@Override
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {
		// TODO Auto-generated method stub
		super.registerVariantRenderer(item, meta, filename, id);
	}
}
