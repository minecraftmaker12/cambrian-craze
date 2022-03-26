package net.mcreator.cambriancraze.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.cambriancraze.item.DNAItem;
import net.mcreator.cambriancraze.entity.WiwaxiaEntity;
import net.mcreator.cambriancraze.entity.AstraspisEntity;
import net.mcreator.cambriancraze.block.CambrianKelpBlock;
import net.mcreator.cambriancraze.CambrianCrazeMod;

import java.util.Map;

public class IncubatorOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency world for procedure IncubatorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency x for procedure IncubatorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency y for procedure IncubatorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency z for procedure IncubatorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency entity for procedure IncubatorOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double e = 0;
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DNAItem.block) {
			e = (Math.random() * 5);
			if (e == 0) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new WiwaxiaEntity.CustomEntity(WiwaxiaEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (e == 1) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(CambrianKelpBlock.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if (e == 2) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new WiwaxiaEntity.CustomEntity(WiwaxiaEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (e == 2) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(CambrianKelpBlock.block));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (e == 3) {
								if (world instanceof ServerWorld) {
									Entity entityToSpawn = new AstraspisEntity.CustomEntity(AstraspisEntity.entity, (World) world);
									entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof MobEntity)
										((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
												world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
												(ILivingEntityData) null, (CompoundNBT) null);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (e == 4) {
									if (world instanceof ServerWorld) {
										Entity entityToSpawn = new WiwaxiaEntity.CustomEntity(WiwaxiaEntity.entity, (World) world);
										entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof MobEntity)
											((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
													world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
													(ILivingEntityData) null, (CompoundNBT) null);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (world instanceof World && !world.isRemote()) {
										ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z,
												new ItemStack(CambrianKelpBlock.block));
										entityToSpawn.setPickupDelay((int) 10);
										world.addEntity(entityToSpawn);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
