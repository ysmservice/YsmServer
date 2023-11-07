package org.bukkit.craftbukkit.v1_20_R2.block.impl;

import java.util.Set;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.block.data.type.WallSign;
import org.bukkit.craftbukkit.v1_20_R2.block.data.CraftBlockData;

public final class CraftWallSign extends CraftBlockData implements WallSign, Directional, Waterlogged {

    private static final EnumProperty FACING = getEnum(WallSignBlock.class, "facing");
    private static final BooleanProperty WATERLOGGED = getBoolean(WallSignBlock.class, "waterlogged");

    public CraftWallSign() {}

    public CraftWallSign(BlockState state) {
        super(state);
    }

    public BlockFace getFacing() {
        return (BlockFace) this.get(CraftWallSign.FACING, BlockFace.class);
    }

    public void setFacing(BlockFace facing) {
        this.set(CraftWallSign.FACING, (Enum) facing);
    }

    public Set getFaces() {
        return this.getValues(CraftWallSign.FACING, BlockFace.class);
    }

    public boolean isWaterlogged() {
        return (Boolean) this.get(CraftWallSign.WATERLOGGED);
    }

    public void setWaterlogged(boolean waterlogged) {
        this.set((Property) CraftWallSign.WATERLOGGED, (Comparable) waterlogged);
    }
}