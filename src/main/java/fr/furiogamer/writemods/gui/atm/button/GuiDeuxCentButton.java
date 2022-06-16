package fr.furiogamer.writemods.gui.atm.button;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiDeuxCentButton extends GuiButton {
    private final ResourceLocation logo = new ResourceLocation("writemods:textures/gui/atm/200.png");

    public GuiDeuxCentButton(int buttonID, int xPos, int yPos, String text)
    {
        super(buttonID, xPos, yPos, 24, 19, "");
    }

    public void onActionPerformed() {

    }

    /**
     * Draws this button to the screen.
     */
    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(logo);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean flag = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
            int i = 0;

            if (flag)
            {
                i += this.height;
            }

            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            Gui.drawScaledCustomSizeModalRect(this.x, this.y, 0, 0, 217, 162, 24, 19, 217, 162);
        }
    }
}
