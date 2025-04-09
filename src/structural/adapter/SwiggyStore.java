package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
    private List<Item> items;
    SwiggyStore(){
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return items;
    }
    public void addItem(Item  item){
        this.items.add(item);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SwiggyStore{" +
                "items=" + items +
                '}';
    }
}
