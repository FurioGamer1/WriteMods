package fr.furiogamer.writemods.Blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ROAD1 = new BlockRoad("block_road", Material.ROCK);
	public static final Block PIETON = new BlockPieton("block_pieton", Material.ROCK);
	public static final Block ROAD2 = new BlockRoad2("block_road2", Material.ROCK);
	public static final Block ROAD3 = new BlockRoad3("block_road3", Material.ROCK);
	public static final Block ROAD4 = new BlockRoad4("block_road4", Material.ROCK);
	public static final Block ENSEIGNE_GD = new BlockEnseigneGD("block_enseigne_gd", Material.ROCK);
	public static final Block ENSEIGNE_PN = new BlockEnseignePN("block_enseigne_pn", Material.ROCK);
	public static final Block PAINTING1 = new BlockPaintingEpic("block_painting1", Material.ROCK);
	public static final Block PAINTING2 = new BlockPaintingEpic("block_painting2", Material.ROCK);
	public static final Block PAINTING3 = new BlockPaintingLegendaire("block_painting3", Material.ROCK);
	public static final Block PAINTING4 = new BlockPaintingLegendaire("block_painting4", Material.ROCK);
	public static final Block PAINTING5 = new BlockPaintingRare("block_painting5", Material.ROCK);
	public static final Block PAINTING6 = new BlockPaintingRare("block_painting6", Material.ROCK);
	public static final Block ROAD5 = new BlockRoad4("block_road5", Material.ROCK);
	public static final Block ROAD6 = new BlockRoad4("block_road6", Material.ROCK);
	public static final Block ROAD7 = new BlockRoad4("block_road7", Material.ROCK);
	public static final Block ROAD8 = new BlockRoad4("block_road8", Material.ROCK);
	public static final Block ROAD9 = new BlockRoad4("block_road9", Material.ROCK);

	public static final Block ATM = new BlockAtm("atm", Material.ROCK);
	public static final Block GOLD_INGOT = new BlockGoldIngot("gold_ingot", Material.ROCK);

}
