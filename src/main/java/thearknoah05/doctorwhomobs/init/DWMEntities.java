package thearknoah05.doctorwhomobs.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import thearknoah05.doctorwhomobs.DWMRegistries;
import thearknoah05.doctorwhomobs.entities.KarnSisterhood;
import thearknoah05.doctorwhomobs.entities.MondasianCyberman;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;
import thearknoah05.doctorwhomobs.items.ItemList;

import static thearknoah05.doctorwhomobs.DoctorWhoMobs.dwmitems;


public class DWMEntities
{
    public static EntityType<?> mondasian_cyberman = EntityType.Builder.create(MondasianCyberman::new, EntityClassification.CREATURE).build(DWMRegistries.modid + ":mondasian_cyberman").setRegistryName(DWMRegistries.location("mondasian_cyberman"));
    public static EntityType<?> karn_sisterhood = EntityType.Builder.create(KarnSisterhood::new, EntityClassification.CREATURE).build(DWMRegistries.modid + ":karn_sisterhood").setRegistryName(DWMRegistries.location("karn_sisterhood"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ItemList.mondasian_cyberman_egg = registerEntitySpawnEgg(mondasian_cyberman, 0xc2c2c2, 0x8ffff9, "mondasian_cyberman_egg"),
                ItemList.karn_sisterhood_egg = registerEntitySpawnEgg(karn_sisterhood, 0xff0000, 0xf7cd51, "karn_sisterhood_egg")
        );
    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(mondasian_cyberman, Biomes.PLAINS, Biomes.BEACH, Biomes.FOREST);
        registerEntityWorldSpawn(karn_sisterhood, Biomes.PLAINS, Biomes.BEACH, Biomes.FOREST);
    }

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(dwmitems));
        item.setRegistryName(DWMRegistries.location(name));
        return item;
    }

    public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if (biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }
}
