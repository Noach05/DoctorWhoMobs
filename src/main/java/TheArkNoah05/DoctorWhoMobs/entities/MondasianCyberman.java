package TheArkNoah05.DoctorWhoMobs.entities;

import TheArkNoah05.DoctorWhoMobs.init.DWMEntities;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class MondasianCyberman extends CreatureEntity
{

    @SuppressWarnings("unchecked")
    public MondasianCyberman(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super((EntityType<? extends CreatureEntity>) DWMEntities.mondasian_cyberman, worldIn);
    }

    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
       // this.goalSelector.addGoal(1, new RangedAttackGoal((IRangedAttackMob) this, 1.25D, 15, 20.0F));
    }

    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.5d);
        this.getAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(1.25d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
    }
}
