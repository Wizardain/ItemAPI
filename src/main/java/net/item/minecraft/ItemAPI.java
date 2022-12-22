package net.item.minecraft;

import net.item.minecraft.item.AbstractItem;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public final class ItemAPI extends JavaPlugin {

    private static ItemAPI instance;

    @Override
    public void onLoad() {
        instance = this;
    }

    public static ItemAPI getInstance() {
        return instance;
    }

    private final Map<Integer, AbstractItem> items = new HashMap<>();

    public void registerItem(AbstractItem item) {
        if (this.isExists(item.getId())) {
            return;
        }
        this.items.put(item.getId(), item);
    }

    @Nullable
    public AbstractItem getItem(int id) {
        if (!(this.isExists(id))) {
            return null;
        }
        return this.items.get(id);
    }

    @Nullable
    public AbstractItem getItem(AbstractItem item) {
        return getItem(item.getId());
    }

    public boolean isExists(int id) {
        return this.items.containsKey(id);
    }

    public boolean isExists(AbstractItem item) {
        return isExists(item.getId());
    }

    public void unregisterItem(int id) {
        if (!(this.isExists(id))) {
            return;
        }
        this.items.remove(id);
    }

    public void unregisterItem(AbstractItem item) {
        this.unregisterItem(item.getId());
    }

}
