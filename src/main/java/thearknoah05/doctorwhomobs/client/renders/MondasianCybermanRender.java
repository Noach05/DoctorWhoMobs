package thearknoah05.doctorwhomobs.client.renders;

import thearknoah05.doctorwhomobs.DWMRegistries;
import thearknoah05.doctorwhomobs.client.models.MondasianCybermanModel;
import thearknoah05.doctorwhomobs.entities.MondasianCyberman;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class MondasianCybermanRender extends LivingRenderer<MondasianCyberman, MondasianCybermanModel> {
    private static final Object MondasianCybermanModel =  new MondasianCybermanModel();

    public MondasianCybermanRender(EntityRendererManager manager) {
        super(manager, (thearknoah05.doctorwhomobs.client.models.MondasianCybermanModel) MondasianCybermanModel, 0.1f);
    }


    @Override
    protected ResourceLocation getEntityTexture(MondasianCyberman entity)
    {
        return DWMRegistries.location("textures/entity/mondasian_cyberman.png");
    }

    public static class RenderFactory implements IRenderFactory<MondasianCyberman>
    {
        @Override
        public EntityRenderer<? super MondasianCyberman> createRenderFor(EntityRendererManager manager) {
            return new MondasianCybermanRender(manager);
        }
    }
}