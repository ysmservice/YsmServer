package org.bukkit.craftbukkit.v1_20_R2.block.impl;

import java.util.Set;
import net.minecraft.world.level.block.AnvilBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.craftbukkit.v1_20_R2.block.data.CraftBlockData;

public final class CraftAnvil extends CraftBlockData implements Directional {

    private static final EnumProperty FACING = getEnum(AnvilBlock.class, "facing");

    public CraftAnvil() {}

    public CraftAnvil(BlockState state) {
        super(state);
    }

    public BlockFace getFacing() {
        return (BlockFace) this.get(CraftAnvil.FACING, BlockFace.class);
    }

    public void setFacing(BlockFace facing) {
        this.set(CraftAnvil.FACING, (Enum) facing);
    }

    public Set getFaces() {
        return this.getValues(CraftAnvil.FACING, BlockFace.class);
    }
}