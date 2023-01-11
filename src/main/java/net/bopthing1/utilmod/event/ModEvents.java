package net.bopthing1.utilmod.event;

import jdk.jshell.execution.Util;
import net.bopthing1.utilmod.UtilMod;
import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldDataConfiguration;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = UtilMod.MOD_ID)
    public static class ForgeEvents {
        @SubscribeEvent
        public void LivingHurtEvent(LivingEntity entity, DamageSource source, float amount) {
            Level level = entity.getLevel();

            System.out.println("how dare yoU!");
        }
    }


}
