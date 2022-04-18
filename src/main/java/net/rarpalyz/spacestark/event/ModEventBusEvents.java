package net.rarpalyz.spacestark.event;


import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.rarpalyz.spacestark.Spacestark;
import net.rarpalyz.spacestark.event.loot.CoalCokeFromCreeperAdditionModifier;
import net.rarpalyz.spacestark.event.loot.CucumberSeedsFromGrassAdditionModifier;
import net.rarpalyz.spacestark.event.loot.DowsingRodInIglooAdditionModifier;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = Spacestark.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new CucumberSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Spacestark.MOD_ID,"cucumber_seeds_from_grass")),
                new DowsingRodInIglooAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Spacestark.MOD_ID,"dowsing_rod_in_igloo")),
                new CoalCokeFromCreeperAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(Spacestark.MOD_ID,"coal_coke_from_creeper"))
        );
    }
}
