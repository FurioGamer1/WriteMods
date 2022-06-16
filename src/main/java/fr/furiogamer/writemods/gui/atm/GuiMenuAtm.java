package fr.furiogamer.writemods.gui.atm;

import fr.furiogamer.writemods.gui.atm.button.*;
import fr.furiogamer.writemods.gui.phone.GuiMenuPhone;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiMenuAtm extends GuiScreen {

    private final ResourceLocation background = new ResourceLocation("writemods:textures/gui/atm/background.png");

    private final int xSize = 315;
    private final int ySize = 202;

    private int guiLeft;
    private int guiTop;

    private Minecraft minecraft;

    public GuiMenuAtm(Minecraft mc) {
        minecraft = mc;
    }

    public void initGui() {
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) /2;

        buttonList.add(new GuiDepButton(1000, guiLeft + 58, guiTop + 154, ""));
        buttonList.add(new GuiRetButton(1001, guiLeft + 149, guiTop + 154, ""));
        buttonList.add(new GuiAtmButton(1002, guiLeft + 1, guiTop + 1, ""));
        buttonList.add(new GuiBoxButton(1003, guiLeft + 58, guiTop + 24, ""));
        buttonList.add(new GuiCardButton(1004, guiLeft + 237, guiTop + 172, ""));

    }

    @SideOnly(Side.CLIENT)
    public void actionPerformed(GuiButton button) {

        if(button.id == 1000) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiDepAtm(Minecraft.getMinecraft()));
        }
        if(button.id == 1001) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiRetAtm(Minecraft.getMinecraft()));
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawBackgroundImage();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    public void drawBackgroundImage() {
        GlStateManager.pushMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        minecraft.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GlStateManager.popMatrix();
    }

    public boolean doesGuiPauseGame() {
        return false;
    }
}
