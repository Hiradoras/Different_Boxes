public class Thing {
    private String name;
    public int weight;


    public Thing(String name, int weight){
        this.name = name;
        try{
            if (weight>=0) this.weight = weight;
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }

    }


}
