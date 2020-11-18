package TheArkNoah05.DoctorWhoMobs.entities;

import TheArkNoah05.DoctorWhoMobs.init.DWMEntities;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.world.World;

public class MondasianCyberman extends SkeletonEntity {

    @SuppressWarnings("unchecked")
    public MondasianCyberman(EntityType<? extends CreatureEntity> type, World worldIn) {
        super((EntityType<? extends SkeletonEntity>) DWMEntities.mondasian_cyberman, worldIn);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23F);
    }
}
