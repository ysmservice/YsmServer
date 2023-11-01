package org.bukkit.craftbukkit.v1_20_R2.command;

import java.util.Map;
import org.bukkit.Server;
import org.bukkit.command.SimpleCommandMap;

public class CraftCommandMap extends SimpleCommandMap {

    public CraftCommandMap(Server server) {
        super(server);
    }

    public Map getKnownCommands() {
        return this.knownCommands;
    }
}
