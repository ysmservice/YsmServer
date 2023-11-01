package org.bukkit.craftbukkit.v1_20_R2.help;

import com.google.common.base.Preconditions;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpMap;
import org.bukkit.help.HelpTopic;

public class CommandAliasHelpTopic extends HelpTopic {

    private final String aliasFor;
    private final HelpMap helpMap;

    public CommandAliasHelpTopic(String alias, String aliasFor, HelpMap helpMap) {
        this.aliasFor = aliasFor.startsWith("/") ? aliasFor : "/" + aliasFor;
        this.helpMap = helpMap;
        this.name = alias.startsWith("/") ? alias : "/" + alias;
        Preconditions.checkArgument(!this.name.equals(this.aliasFor), "Command %s cannot be alias for itself", this.name);
        this.shortText = ChatColor.YELLOW + "Alias for " + ChatColor.WHITE + this.aliasFor;
    }

    public String getFullText(CommandSender forWho) {
        Preconditions.checkArgument(forWho != null, "CommandServer forWho cannot be null");
        StringBuilder sb = new StringBuilder(this.shortText);
        HelpTopic aliasForTopic = this.helpMap.getHelpTopic(this.aliasFor);

        if (aliasForTopic != null) {
            sb.append("\n");
            sb.append(aliasForTopic.getFullText(forWho));
        }

        return sb.toString();
    }

    public boolean canSee(CommandSender commandSender) {
        Preconditions.checkArgument(commandSender != null, "CommandServer cannot be null");
        if (this.amendedPermission == null) {
            HelpTopic aliasForTopic = this.helpMap.getHelpTopic(this.aliasFor);

            return aliasForTopic != null ? aliasForTopic.canSee(commandSender) : false;
        } else {
            return commandSender.hasPermission(this.amendedPermission);
        }
    }
}
