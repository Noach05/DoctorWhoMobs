package TheArkNoah05.DoctorWhoMobs;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("doctorwhomobs")
public class DoctorWhoMobs
{
    public static DoctorWhoMobs instance;
    public static final String modid = "doctorwhomobs";
    public static final Logger logger = LogManager.getLogger(modid);
    public static final ItemGroup dwmitems = new DoctorWhoMobsItemGroup();

    public DoctorWhoMobs()
    {
        instance = this;

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
        logger.info("clientRegistries method registered.");

    }

}
