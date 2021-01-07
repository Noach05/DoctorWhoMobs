package thearknoah05.doctorwhomobs.client.renders;

import thearknoah05.doctorwhomobs.entities.KarnSisterhood;
import thearknoah05.doctorwhomobs.entities.MondasianCyberman;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class DWMRenderRegistry
{
    public static void registerEntityRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(MondasianCyberman.class, new MondasianCybermanRender.RenderFactory());
        RenderingRegistry.registerEntityRenderingHandler(KarnSisterhood.class, new KarnSisterhoodRender.RenderFactory());
    }
}
