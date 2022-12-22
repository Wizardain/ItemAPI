package net.item.minecraft.item.weapon;

import net.item.minecraft.item.AbstractItem;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public abstract class WeaponItem extends AbstractItem {

    private final double attackDamage;

    public WeaponItem(int id, Material material, double attackDamage) {
        super(id, material);
        this.attackDamage = attackDamage;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public abstract void onAttack(EntityDamageByEntityEvent event);

}
