package fr.furiogamer.writemods.gui.phone;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiSpotifyButton extends GuiButton {
    private final ResourceLocation logo = new ResourceLocation("writemods:textures/gui/phone/spotify.png");

    public GuiSpotifyButton(int buttonID, int xPos, int yPos) {
        super(buttonID, xPos, yPos, 20, 20, "");
    }

    public void onActionPerformed() {

    }

    /**
     * Draws this button to the screen.
     */
    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (this.visible) {
            mc.getTextureManager().bindTexture(logo);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean flag = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            int i = 0;

            if (flag) {
                i += this.height;
            }

            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Gui.drawScaledCustomSizeModalRect(this.x, this.y, 0, 0, 230, 230, 20, 20, 230, 230);
        }
    }
}
