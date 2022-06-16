package fr.furiogamer.writemods.gui.phone.maps;

import fr.furiogamer.writemods.gui.atm.GuiDepAtm;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiMaps extends GuiScreen {
    private final ResourceLocation background = new ResourceLocation("writemods:textures/gui/atm/background_menu.png");

    private final int xSize = 315;
    private final int ySize = 202;

    private int guiLeft;
    private int guiTop;

    private Minecraft minecraft;

    public GuiMaps(Minecraft mc) {

        minecraft = mc;
    }

    public void initGui() {
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) / 2;

        //buttonList.add(new GuiButtonDep(50, guiLeft + 44, guiTop + 100));
        //buttonList.add(new GuiButtonRet(51, guiLeft + 171, guiTop + 100));

        buttonList.add(new GuiContoursMaps(72, guiLeft + 5, guiTop + 5));
        buttonList.add(new GuiMairieButton(100, guiLeft + 5, guiTop + 5));

        //buttonList.add(new GuiButtonDep(25, 0, 0));

    }

    public void actionPerformed(GuiButton button) {
        if(button.id == 50) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiDepAtm(Minecraft.getMinecraft()));
        }
        if(button.id == 51) {
            Minecraft.getMinecraft().player.sendChatMessage("/help 1");
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
