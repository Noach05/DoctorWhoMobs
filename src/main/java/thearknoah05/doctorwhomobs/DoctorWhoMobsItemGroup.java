package thearknoah05.doctorwhomobs;

import thearknoah05.doctorwhomobs.init.ItemList;
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
