package fr.furiogamer.writemods.gui.ingame;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;

public class Events {

    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent event) {
        if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
            Minecraft mc = Minecraft.getMinecraft();

            if (!mc.player.capabilities.isCreativeMode) {
                int posX = 249;
                int posY = 207;

                mc.renderEngine.bindTexture(new ResourceLocation("writemods:textures/gui/full.png"));
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX, posY, 0, 0, 30, 30, 8, 8, 30, 30);

                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 8, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 16, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 24, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 32, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 40, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 48, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 56, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 64, posY, 0, 0, 30, 30, 8, 8, 30, 30);
                mc.ingameGUI.drawScaledCustomSizeModalRect(posX + 72, posY, 0, 0, 30, 30, 8, 8, 30, 30);
            }
        }
    }
}
