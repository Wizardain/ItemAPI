package net.item.minecraft.item.food;

import net.item.minecraft.item.AbstractItem;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerItemConsumeEvent;

public abstract class FoodItem extends AbstractItem {

    public FoodItem(int id, Material material) {
        super(id, material);
    }

    public abstract void onConsume(PlayerItemConsumeEvent event);

}