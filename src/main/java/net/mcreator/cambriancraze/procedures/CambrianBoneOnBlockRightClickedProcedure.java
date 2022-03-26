package net.mcreator.cambriancraze.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.cambriancraze.item.DNAItem;
import net.mcreator.cambriancraze.item.DNAExtractorItem;
import net.mcreator.cambriancraze.CambrianCrazeMod;

import java.util.Map;

public class CambrianBoneOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency world for procedure CambrianBoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency x for procedure CambrianBoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency y for procedure CambrianBoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency z for procedure CambrianBoneOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CambrianCrazeMod.LOGGER.warn("Failed to load dependency entity for procedure CambrianBoneOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == DNAExtractorItem.block) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DNAItem.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
