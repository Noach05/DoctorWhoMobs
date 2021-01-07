package thearknoah05.doctorwhomobs;

import thearknoah05.doctorwhomobs.init.DWMEntities;
import net.minecraft.entity.EntityType;
import org.apache.logging.log4j.Logger;

import thearknoah05.doctorwhomobs.items.ItemList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import thearknoah05.doctorwhomobs.items.ToolMaterialList;

import static thearknoah05.doctorwhomobs.DoctorWhoMobs.dwmitems;

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
                        ItemList.cyberium_ingot = new Item(new Item.Properties().group(dwmitems)).setRegistryName(location("cyberium_ingot")),
                        ItemList.mondasian_cyberman_egg = new Item(new Item.Properties().group(dwmitems)).setRegistryName(location("mondasian_cyberman_egg")),
                        ItemList.karn_sisterhood_egg = new Item(new Item.Properties().group(dwmitems)).setRegistryName(location("karn_sisterhood_egg"))
                );

        DWMEntities.registerEntitySpawnEggs(event);

        logger.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        event.getRegistry().registerAll(
                DWMEntities.mondasian_cyberman,
                DWMEntities.karn_sisterhood
        );

        DWMEntities.registerEntityWorldSpawns();
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation(modid, name);
    }
}

