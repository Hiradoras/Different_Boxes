public class MaxWeightBox extends Box {
    public int maxWeight;

    private int currentWeight;
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if(currentWeight+ thing.weight<=maxWeight){
            currentWeight+=thing.weight;

        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
