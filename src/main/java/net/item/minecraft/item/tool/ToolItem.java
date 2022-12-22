package net.item.minecraft.item.tool;

import net.item.minecraft.item.AbstractItem;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;

public abstract class ToolItem extends AbstractItem {

    public ToolItem(int id, Material material) {
        super(id, material);
    }

    public abstract void onBreak(BlockBreakEvent event);


}
