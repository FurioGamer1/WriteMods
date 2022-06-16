package fr.furiogamer.writemods.gui.phone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

import java.awt.*;

import static org.lwjgl.opengl.GL11.glScalef;

public class GuiAppelSos extends GuiScreen {
    private final ResourceLocation background = new ResourceLocation("writemods:textures/gui/phone/appel_sos.png");

    private final int xSize = 115;
    private final int ySize = 220;

    private int guiLeft;
    private int guiTop;

    private Minecraft minecraft;

    public GuiAppelSos(Minecraft mc) {
        minecraft = mc;
    }

    public void initGui() {
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) / 2;

        // Button

        buttonList.add(new GuiContours(72, guiLeft + 5, guiTop + 18));
        buttonList.add(new GuiPoliceIconButton(70, guiLeft + 9, guiTop + 20));
        buttonList.add(new GuiContours(73, guiLeft + 5, guiTop + 45));
        buttonList.add(new GuiPompierIconButton(71, guiLeft + 11, guiTop + 47));
        buttonList.add(new GuiBackButton(74, guiLeft + 5, guiTop + 195));
        buttonList.add(new GuiContours(75, guiLeft + 5, guiTop + 72));
        buttonList.add(new GuiSamuButton(76, guiLeft + 11, guiTop + 74));

    }

    public void actionPerformed(GuiButton button) {
        if(button.id == 74) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiMenuPhone(Minecraft.getMinecraft()));
        }
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        drawBackgroundImage();
        super.drawScreen(mouseX, mouseY, partialTicks);
        drawTextePolice();
        drawTextePompier();
        drawTexteSamu();
    }

    public void drawBackgroundImage() {
        GlStateManager.pushMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        Minecraft.getMinecraft().getTextureManager().bindTexture(background);

        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GlStateManager.popMatrix();
    }

    public void drawTextePolice() {
        this.drawCenteredString(fontRenderer, "Police", guiLeft + 50, guiTop + 26, Color.WHITE.getRGB());
    }
    public void drawTextePompier() {
        this.drawCenteredString(fontRenderer, "Pompier", guiLeft + 54, guiTop + 53, Color.WHITE.getRGB());
    }
    public void drawTexteSamu() {
        this.drawCenteredString(fontRenderer, "Samu", guiLeft + 48, guiTop + 80, Color.WHITE.getRGB());
    }

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
