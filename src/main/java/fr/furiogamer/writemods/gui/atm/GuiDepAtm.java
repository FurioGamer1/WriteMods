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

public class GuiDepAtm extends GuiScreen {

    private final ResourceLocation background = new ResourceLocation("writemods:textures/gui/atm/background.png");

    private final int xSize = 315;
    private final int ySize = 202;

    private int guiLeft;
    private int guiTop;

    private Minecraft minecraft;

    public GuiDepAtm(Minecraft mc) {
        minecraft = mc;
    }

    public void initGui() {
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) /2;

        buttonList.add(new GuiAtmButton(1005, guiLeft + 1, guiTop + 1, ""));
        buttonList.add(new GuiBoxButton(1003, guiLeft + 66, guiTop + 12, ""));
        buttonList.add(new GuiRetourButton(1015, guiLeft + 294, guiTop + 181, ""));
        //Button
        buttonList.add(new GuiUnButton(1006, guiLeft + 90, guiTop + 130, ""));
        buttonList.add(new GuiDeuxButton(1007, guiLeft + 119, guiTop + 130, ""));
        buttonList.add(new GuiCinqButton(1008, guiLeft + 148, guiTop + 130, ""));
        //Button
        buttonList.add(new GuiDixButton(1009, guiLeft + 90, guiTop + 154, ""));
        buttonList.add(new GuiVinghtButton(1010, guiLeft + 119, guiTop + 154, ""));
        buttonList.add(new GuiCinquanteButton(1011, guiLeft + 148, guiTop + 154, ""));
        //Button
        buttonList.add(new GuiCentButton(1012, guiLeft + 90, guiTop + 178, ""));
        buttonList.add(new GuiDeuxCentButton(1013, guiLeft + 119, guiTop + 178, ""));
        buttonList.add(new GuiCinqCentButton(1014, guiLeft + 148, guiTop + 178, ""));

    }

    @SideOnly(Side.CLIENT)
    public void actionPerformed(GuiButton button) {
        if(button.id == 1015) {
            Minecraft.getMinecraft().displayGuiScreen(new GuiMenuAtm(Minecraft.getMinecraft()));
        }
        if(button.id == 1006) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 1");
        }
        if(button.id == 1007) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 2");
        }
        if(button.id == 1008) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 5");
        }
        if(button.id == 1009) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 10");
        }
        if(button.id == 1010) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 20");
        }
        if(button.id == 1011) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 50");
        }
        if(button.id == 1012) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 100");
        }
        if(button.id == 1013) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 200");
        }
        if(button.id == 1014) {
            Minecraft.getMinecraft().player.sendChatMessage("/money_dep " + mc.player + " 500");
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
