package TheArkNoah05.DoctorWhoMobs.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    ;

    private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial)
    {
        this.attackDamage() = attackDamage;
        this.efficiency() = efficiency;
        this.durability() = durability;
        this.harvestLevel() = harvestLevel;
        this.enchantability() = enchantability;
        this.repairMaterial() = repairMaterial;


    }

    @Override
    public int getMaxUses() {
        return 0;
    }

    @Override
    public float getEfficiency() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
