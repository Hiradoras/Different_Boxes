import java.util.*;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> box;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<Thing>();
    }

    public int getBoxWeight() {
        if (this.box.isEmpty()) {
            return 0;
        }
        int boxWeight = 0;
        for (Thing thing : this.box) {
            boxWeight += thing.getWeight();
        }
        return boxWeight;
    }
    public void add(Thing thing) {
        if (thing.getWeight() + this.getBoxWeight() <= this.maxWeight) {
            this.box.add(thing);
        }
    }

    // ABSTRACT METHOD. Checks if thing is in the box
    public boolean isInTheBox(Thing thing) {
        Boolean bool = false;
        for (Thing item : this.box) {
            if (item.equals(thing)) {
                bool = true;
            }
        }
        return bool;
    }
}