package TheArkNoah05.DoctorWhoMobs.init;

import TheArkNoah05.DoctorWhoMobs.DWMRegistries;
import TheArkNoah05.DoctorWhoMobs.entities.MondasianCyberman;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

import static TheArkNoah05.DoctorWhoMobs.DoctorWhoMobs.dwmitems;


public class DWMEntities
{
    public static EntityType<?> mondasian_cyberman = EntityType.Builder.create(MondasianCyberman::new, EntityClassification.CREATURE).build(DWMRegistries.modid + ":mondasian_cyberman").setRegistryName(DWMRegistries.location("mondasian_cyberman"));

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ItemList.mondasian_cyberman_egg = registerEntitySpawnEgg(mondasian_cyberman, 0xc2c2c2, 0x8ffff9, "mondasian_cyberman_egg")
        );
    }

    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(mondasian_cyberman, Biomes.PLAINS, Biomes.BEACH, Biomes.FOREST);
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
