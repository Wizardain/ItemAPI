package net.item.minecraft.item;

import org.bukkit.Material;

public abstract class AbstractItem {

    private final int id;

    private String displayName;

    private String description;

    private Material material;

    public AbstractItem(int id, Material material) {
        this.id = id;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
