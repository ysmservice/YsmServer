package org.bukkit.craftbukkit.v1_20_R2.util;

import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.border.WorldBorder;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkSource;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.entity.EntityTypeTest;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.storage.LevelData;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.ticks.BlackholeTickAccess;
import net.minecraft.world.ticks.LevelTickAccess;

public class DummyGeneratorAccess implements WorldGenLevel {

    public static final WorldGenLevel INSTANCE = new DummyGeneratorAccess();

    protected DummyGeneratorAccess() {}

    public long getSeed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ServerLevel getLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long nextSubTickCount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LevelTickAccess getBlockTicks() {
        return BlackholeTickAccess.emptyLevelList();
    }

    public void scheduleTick(BlockPos blockposition, Block block, int i) {}

    public LevelTickAccess getFluidTicks() {
        return BlackholeTickAccess.emptyLevelList();
    }

    public LevelData getLevelData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public DifficultyInstance getCurrentDifficultyAt(BlockPos blockposition) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public MinecraftServer getServer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ChunkSource getChunkSource() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RandomSource getRandom() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void playSound(Player entityhuman, BlockPos blockposition, SoundEvent soundeffect, SoundSource soundcategory, float f, float f1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addParticle(ParticleOptions particleparam, double d0, double d1, double d2, double d3, double d4, double d5) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void levelEvent(Player entityhuman, int i, BlockPos blockposition, int j) {}

    public void gameEvent(GameEvent gameevent, Vec3 vec3d, GameEvent.Context gameevent_a) {}

    public List getEntities(Entity entity, AABB aabb, Predicate prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List getEntities(EntityTypeTest ett, AABB aabb, Predicate prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List players() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ChunkAccess getChunk(int i, int i1, ChunkStatus cs, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getHeight(Heightmap.Types type, int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getSkyDarken() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BiomeManager getBiomeManager() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Holder getUncachedNoiseBiome(int i, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isClientSide() {
        return false;
    }

    public int getSeaLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public DimensionType dimensionType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public RegistryAccess registryAccess() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public FeatureFlagSet enabledFeatures() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public float getShade(Direction ed, boolean bln) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public LevelLightEngine getLightEngine() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BlockEntity getBlockEntity(BlockPos blockposition) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public BlockState getBlockState(BlockPos blockposition) {
        return Blocks.AIR.defaultBlockState();
    }

    public FluidState getFluidState(BlockPos blockposition) {
        return Fluids.EMPTY.defaultFluidState();
    }

    public WorldBorder getWorldBorder() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isStateAtPosition(BlockPos bp, Predicate prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isFluidAtPosition(BlockPos bp, Predicate prdct) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean setBlock(BlockPos blockposition, BlockState iblockdata, int i, int j) {
        return false;
    }

    public boolean removeBlock(BlockPos blockposition, boolean flag) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean destroyBlock(BlockPos blockposition, boolean flag, Entity entity, int i) {
        return false;
    }
}
