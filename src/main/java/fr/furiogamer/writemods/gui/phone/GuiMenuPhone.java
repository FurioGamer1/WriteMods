package fr.furiogamer.writemods.gui.phone;

import fr.furiogamer.writemods.gui.phone.maps.GuiMaps;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiMenuPhone extends GuiScreen {
	
	private final ResourceLocation background = new ResourceLocation("writemods:textures/gui/phone/background.jpeg");
	
	private final int xSize = 115;
	private final int ySize = 220;
	
	private int guiLeft;
	private int guiTop;
	
	private Minecraft minecraft;
	
	public GuiMenuPhone(Minecraft mc) {
		minecraft = mc;
	}
	
	public void initGui() {
		guiLeft = (this.width - this.xSize) / 2;
		guiTop = (this.height - this.ySize) / 2;
		
		//buttonList.add(new GuiButton(50, 45, 50, 150, 20, "Hello World"));
		buttonList.add(new GuiPhoneButton(50, guiLeft + 5, guiTop + 5));
		buttonList.add(new GuiMapsButton(51, guiLeft + 33, guiTop + 5));
		buttonList.add(new GuiPaypalButton(52, guiLeft + 60, guiTop + 5));
		buttonList.add(new GuiSpotifyButton(53, guiLeft + 85, guiTop + 5));
				
	}
	
	public void actionPerformed(GuiButton button) {
		if(button.id == 50) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiAppelSos(Minecraft.getMinecraft()));
		}
		if(button.id == 51) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiMaps(Minecraft.getMinecraft()));
		}
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		
		drawBackgroundImage();
		super.drawScreen(mouseX, mouseY, partialTicks);
	}
	
	public void drawBackgroundImage() {
		GlStateManager.pushMatrix();
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(background);
		this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		GlStateManager.popMatrix();
	}
	
	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

}
