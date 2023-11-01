package org.bukkit.craftbukkit.v1_20_R2.inventory;

import net.minecraft.world.Container;
import org.bukkit.inventory.ItemStack;

public class CraftResultInventory extends CraftInventory {

    private final Container resultInventory;

    public CraftResultInventory(Container inventory, Container resultInventory) {
        super(inventory);
        this.resultInventory = resultInventory;
    }

    public Container getResultInventory() {
        return this.resultInventory;
    }

    public Container getIngredientsInventory() {
        return this.inventory;
    }

    public ItemStack getItem(int slot) {
        net.minecraft.world.item.ItemStack item;

        if (slot < this.getIngredientsInventory().getContainerSize()) {
            item = this.getIngredientsInventory().getItem(slot);
            return item.isEmpty() ? null : CraftItemStack.asCraftMirror(item);
        } else {
            item = this.getResultInventory().getItem(slot - this.getIngredientsInventory().getContainerSize());
            return item.isEmpty() ? null : CraftItemStack.asCraftMirror(item);
        }
    }

    public void setItem(int index, ItemStack item) {
        if (index < this.getIngredientsInventory().getContainerSize()) {
            this.getIngredientsInventory().setItem(index, CraftItemStack.asNMSCopy(item));
        } else {
            this.getResultInventory().setItem(index - this.getIngredientsInventory().getContainerSize(), CraftItemStack.asNMSCopy(item));
        }

    }

    public int getSize() {
        return this.getResultInventory().getContainerSize() + this.getIngredientsInventory().getContainerSize();
    }
}
