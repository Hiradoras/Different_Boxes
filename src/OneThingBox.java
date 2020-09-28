import java.util.*;

public class OneThingBox extends Box {

    private List<Thing> box;

    public OneThingBox() {
        this.box = new ArrayList<Thing>();
    }
    public void add (Thing thing) {
        if ( this.box.isEmpty() ) {
            this.box.add(thing);
        }
    }
    public boolean isInTheBox(Thing thing) {
        for ( Thing item : this.box ) {
            if ( item.equals(thing) ) {
                return true;
            }
        }
        return false;
    }
}