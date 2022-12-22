package net.item.minecraft.item.armor;

import net.item.minecraft.item.AbstractItem;
import org.bukkit.Material;

public abstract class ArmorItem extends AbstractItem {

    private final double armorProtection;

    public ArmorItem(int id, Material material, double armorProtection) {
        super(id, material);
        this.armorProtection = armorProtection;
    }

    public double getProtection() {
        return armorProtection;
    }

}
