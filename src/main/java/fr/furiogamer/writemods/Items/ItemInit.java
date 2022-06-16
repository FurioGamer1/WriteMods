package fr.furiogamer.writemods.Items;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class ItemInit {
	
	public static List<Item> ITEMS = new ArrayList<Item>();

	public static final Item CARTE_ID = new ItemCarteId("carte_id");
	public static final Item BOTTLE = new ItemBottle(2.0F, 100, "water_bottle");
	public static final Item BOTTLE_ALCHIMISTE = new ItemBottleAlchimiste("bottle_alchi");
	public static final Item PHONE = new ItemPhone("phone");
	public static final Item CLEF = new ItemClef("clef");
	public static final Item PERMISC = new ItemPermisC("permisc");
	public static final Item COK1 = new ItemCok2("cok1");
	public static final Item COK2 = new ItemCok3("cok2");
	public static final Item COK3 = new ItemCok("cok3");

	//Money
	public static final Item CINQ = new ItemBilletCinq("billet_5");
	public static final Item DIX = new ItemBilletDix("billet_10");
	public static final Item VINGHT = new ItemBilletVinght("billet_20");
	public static final Item CINQUANTE = new ItemBilletCinquante("billet_50");
	public static final Item CENT = new ItemBilletCent("billet_100");
	public static final Item DEUXCENT = new ItemBilletDeuxCent("billet_200");
	public static final Item CINQCENT = new ItemBilletCinqCent("billet_500");
	public static final Item UN = new ItemBilletUn("billet_1");
	public static final Item DEUX = new ItemBilletDeux("billet_2");

}
