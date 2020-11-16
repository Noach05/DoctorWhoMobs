package TheArkNoah05.DoctorWhoMobs;

import TheArkNoah05.DoctorWhoMobs.init.DWMEntities;
import net.minecraft.entity.EntityType;
import org.apache.logging.log4j.Logger;

import TheArkNoah05.DoctorWhoMobs.init.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static TheArkNoah05.DoctorWhoMobs.DoctorWhoMobs.dwmitems;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)

public class DWMRegistries
{
    public static final ItemGroup DWMITEMS = dwmitems;
    public static final Logger logger = DoctorWhoMobs.logger;
    public static final String modid = DoctorWhoMobs.modid;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        ItemList.cyberium_ingot = new Item(new Item.Properties().group(dwmitems)).setRegistryName(location("cyberium_ingot"))
                );

        DWMEntities.registerEntitySpawnEggs(event);

        logger.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll(
                DWMEntities.mondasian_cyberman
        );

        DWMEntities.registerEntityWorldSpawns();
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(modid, name);
    }
}

