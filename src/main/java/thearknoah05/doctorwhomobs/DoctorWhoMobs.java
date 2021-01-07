package thearknoah05.doctorwhomobs;

import thearknoah05.doctorwhomobs.client.renders.DWMRenderRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DoctorWhoMobs.modid)
public class DoctorWhoMobs
{
    public static DoctorWhoMobs instance;
    public static final String modid = "doctorwhomobs";
    public static final Logger logger = LogManager.getLogger(modid);
    public static final ItemGroup dwmitems = new DoctorWhoMobsItemGroup();

    public DoctorWhoMobs()
    {
        instance = this;

       // ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, "doctorwhomobs-server.toml");
       // ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, "doctorwhomobs-client.toml");

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        logger.info("Setup method registered.");

    }

    private void clientRegistries(final FMLClientSetupEvent event)
    {
        DWMRenderRegistry.registerEntityRenderers();
        logger.info("clientRegistries method registered.");

    }

}
