package TheArkNoah05.DoctorWhoMobs.client.renders;

import TheArkNoah05.DoctorWhoMobs.entities.MondasianCyberman;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class DWMRenderRegistry
{
    public static void registerEntityRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(MondasianCyberman.class, new MondasianCybermanRender.RenderFactory());
    }
}
