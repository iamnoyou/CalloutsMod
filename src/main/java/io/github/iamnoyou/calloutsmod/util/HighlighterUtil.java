package io.github.iamnoyou.calloutsmod.util;

import cc.polyfrost.oneconfig.config.core.OneColor;
import io.github.iamnoyou.calloutsmod.config.CalloutsConfig;
import io.github.iamnoyou.calloutsmod.hud.RegionHighlighterHUD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

/**
 * Taken and adapted from Hytils Reborn under GNU General Public License v3.0
 * <a href="https://github.com/Polyfrost/Hytils-Reborn/blob/master/LICENSE">...</a>
 */
public class HighlighterUtil {

  @SubscribeEvent
  public void onWorldChange(WorldEvent.Unload event) {
    if (CalloutsConfig.autoResetRegions) {
      CalloutsConfig.regionStart = "";
      CalloutsConfig.regionEnd = "";
    }
  }

  @SubscribeEvent
  public void onWorldRendered(RenderWorldLastEvent event) {
    if (!CalloutsConfig.regionHighlighter) {
      return;
    }
    if (!RegionHighlighterHUD.status) {
      return;
    }
    if (CalloutsConfig.regionStart.isEmpty() || CalloutsConfig.regionEnd.isEmpty()) {
      return;
    }

    drawBoundingBox(event);
  }

  public static void drawBoundingBox(RenderWorldLastEvent event) {
    Entity viewer = Minecraft.getMinecraft().getRenderViewEntity();
    double viewerX = viewer.lastTickPosX + (viewer.posX - viewer.lastTickPosX) * event.partialTicks;
    double viewerY = viewer.lastTickPosY + (viewer.posY - viewer.lastTickPosY) * event.partialTicks;
    double viewerZ = viewer.lastTickPosZ + (viewer.posZ - viewer.lastTickPosZ) * event.partialTicks;

    String start = CalloutsConfig.regionStart;
    String end = CalloutsConfig.regionEnd;

    String[] startCoords = start.split(",\\s*");
    String[] endCoords = end.split(",\\s*");

    double x1 = Double.parseDouble(startCoords[0]) - viewerX;
    double y1 = Double.parseDouble(startCoords[1]) - viewerY;
    double z1 = Double.parseDouble(startCoords[2]) - viewerZ;

    double x2 = Double.parseDouble(endCoords[0]) - viewerX;
    double y2 = Double.parseDouble(endCoords[1]) - viewerY;
    double z2 = Double.parseDouble(endCoords[2]) - viewerZ;

    GlStateManager.disableCull();
    drawFilledBoundingBox(new AxisAlignedBB(x1, y1, z1, x2, y2, z2), CalloutsConfig.highlighterColor);
    GlStateManager.enableCull();
  }

  /**
   * Taken from NotEnoughUpdates under Creative Commons Attribution-NonCommercial 3.0
   * <a href="https://github.com/Moulberry/NotEnoughUpdates/blob/master/LICENSE">...</a>
   *
   * @author Moulberry
   */
  private static void drawFilledBoundingBox(AxisAlignedBB aabb, OneColor c) {
    GlStateManager.enableBlend();
    GlStateManager.disableLighting();
    GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
    GlStateManager.disableTexture2D();

    Tessellator tessellator = Tessellator.getInstance();
    WorldRenderer worldrenderer = tessellator.getWorldRenderer();

    GlStateManager.color(c.getRed() / 255f, c.getGreen() / 255f, c.getBlue() / 255f, c.getAlpha() / 255f * (float) 0.8);

    //vertical
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.maxZ).endVertex();
    tessellator.draw();
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.minZ).endVertex();
    tessellator.draw();

    GlStateManager.color(c.getRed() / 255f * 0.8f, c.getGreen() / 255f * 0.8f, c.getBlue() / 255f * 0.8f, c.getAlpha() / 255f * (float) 0.8);

    //x
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.minZ).endVertex();
    tessellator.draw();
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.maxZ).endVertex();
    tessellator.draw();

    GlStateManager.color(c.getRed() / 255f * 0.9f, c.getGreen() / 255f * 0.9f, c.getBlue() / 255f * 0.9f, c.getAlpha() / 255f * (float) 0.8);
    //z
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.minZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.minZ).endVertex();
    tessellator.draw();
    worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
    worldrenderer.pos(aabb.minX, aabb.minY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.minY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.maxX, aabb.maxY, aabb.maxZ).endVertex();
    worldrenderer.pos(aabb.minX, aabb.maxY, aabb.maxZ).endVertex();
    tessellator.draw();
    GlStateManager.enableTexture2D();
    GlStateManager.disableBlend();
  }

}