package TheArkNoah05.DoctorWhoMobs;

import TheArkNoah05.DoctorWhoMobs.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

class DoctorWhoMobsItemGroup extends ItemGroup
{

    public DoctorWhoMobsItemGroup() {
        super("doctorwhomobs");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.cyberium_ingot);
    }
}
