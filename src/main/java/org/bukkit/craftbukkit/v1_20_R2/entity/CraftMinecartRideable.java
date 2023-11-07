package org.bukkit.craftbukkit.v1_20_R2.entity;

import net.minecraft.world.entity.vehicle.AbstractMinecart;
import org.bukkit.craftbukkit.v1_20_R2.CraftServer;
import org.bukkit.entity.minecart.RideableMinecart;

public class CraftMinecartRideable extends CraftMinecart implements RideableMinecart {

    public CraftMinecartRideable(CraftServer server, AbstractMinecart entity) {
        super(server, entity);
    }

    public String toString() {
        return "CraftMinecartRideable";
    }
}