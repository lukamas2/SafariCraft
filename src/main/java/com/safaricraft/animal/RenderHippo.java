package com.safaricraft.animal;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHippo extends RenderLiving<EntityHippopotamus> {
		
	    private ResourceLocation mobTexture = new ResourceLocation("ec:textures/entity/hippo/hippo.png");
	    
		public RenderHippo(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
			super(rendermanagerIn, modelbaseIn, shadowsizeIn);
		}

	    /**
	     * Renders the desired {@code T} type Entity.
	     */
	    public void doRender(EntityHippopotamus entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
	        super.doRender(entity, x, y, z, entityYaw, partialTicks);
	    }

	    /**
	     * Allows the render to do state modifications necessary before the model is rendered.
	     */
	    protected void preRenderCallback(EntityHippopotamus entitylivingbaseIn, float partialTickTime)
	    {
	        super.preRenderCallback(entitylivingbaseIn, partialTickTime);
	    }

		@Override
		protected ResourceLocation getEntityTexture(EntityHippopotamus entity) {
			return mobTexture;
		}
	}