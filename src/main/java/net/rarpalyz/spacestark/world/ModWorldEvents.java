package net.rarpalyz.spacestark.world;


import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rarpalyz.spacestark.Spacestark;
import net.rarpalyz.spacestark.world.gen.ModFlowerGeneration;
import net.rarpalyz.spacestark.world.gen.ModOreGeneration;
import net.rarpalyz.spacestark.world.gen.ModTreeGeneration;

@Mod.EventBusSubscriber(modid = Spacestark.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
