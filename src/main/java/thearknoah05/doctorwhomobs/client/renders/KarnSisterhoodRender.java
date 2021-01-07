package thearknoah05.doctorwhomobs.client.renders;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import thearknoah05.doctorwhomobs.DWMRegistries;
import thearknoah05.doctorwhomobs.client.models.KarnSisterhoodModel;
import thearknoah05.doctorwhomobs.entities.KarnSisterhood;

public class KarnSisterhoodRender extends LivingRenderer<KarnSisterhood, thearknoah05.doctorwhomobs.client.models.KarnSisterhoodModel> {
    private static final Object KarnSisterhoodModel =  new KarnSisterhoodModel();

    public KarnSisterhoodRender(EntityRendererManager manager) {
        super(manager, (thearknoah05.doctorwhomobs.client.models.KarnSisterhoodModel) KarnSisterhoodModel, 0.1f);
    }

    @Override
    protected ResourceLocation getEntityTexture(KarnSisterhood entity)
    {
        return DWMRegistries.location("textures/entity/karn_sisterhood.png");
    }

    public static class RenderFactory implements IRenderFactory<KarnSisterhood>
    {
        @Override
        public EntityRenderer<? super KarnSisterhood> createRenderFor(EntityRendererManager manager) {
            return new KarnSisterhoodRender(manager);
        }
    }
}
