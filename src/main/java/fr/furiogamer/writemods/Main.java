package fr.furiogamer.writemods;

import fr.furiogamer.writemods.command.CommandJobs;
import fr.furiogamer.writemods.util.RegistryHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.lwjgl.opengl.Display;

import fr.furiogamer.writemods.proxy.CommonProxy;
import fr.furiogamer.writemods.util.WriteTab;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs WRITE_TAB = new WriteTab("write");
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static org.apache.logging.log4j.Logger logger;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {

		if(e.getSide().isClient()) {
			Display.setTitle("WriteYourRp V1");
			Display.setResizable(true);
		}

		logger = e.getModLog();
		proxy.preInit();
	}

	@EventHandler
	public static void init(FMLInitializationEvent e) {
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandJobs());
	}
}
