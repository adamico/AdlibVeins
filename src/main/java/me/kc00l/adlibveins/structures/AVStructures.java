package me.kc00l.adlibveins.structures;

import com.mojang.serialization.Codec;

import me.kc00l.adlibveins.AdlibVeins;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AVStructures {
  public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister
      .create(Registries.STRUCTURE_TYPE, AdlibVeins.MODID);

  public static final RegistryObject<StructureType<BasicVeinStructure>> VEIN_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE
      .register("basic_vein_structure", () -> explicitStructureTypeTyping(BasicVeinStructure.CODEC));

  private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(Codec<T> structureCodec) {
    return () -> structureCodec;
  }
}
