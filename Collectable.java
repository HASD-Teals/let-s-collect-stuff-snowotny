public class Collectable {
    // Add collectable properties here
    private String color;
    private int size;
    private String condition;
    private double cost;
    private String rarity;

    // Add collectable constructors here
    collectable(){
        this.color = "";
        this.size = 0;
        this.condition = "";
        this.cost = 0.0;
        this.rarity = "";
    }
    collectable(String color, int size, String condition, double cost, String rarity){
        this.color = color;
        this.size = size;
        this.condition = condition;
        this.cost = cost;
        this.rarity = rarity;
    }

    // Add collectable accessors and mutators here
    public String getColor(){
        return color;
    }
    public int getSize(){
        return size;
    }
    public String getCondition(){
        return condition;
    }
    public double getCost(){
        return cost;
    }
    public String getRarity(){
        return rarity;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSize(int size){
        this.size = size;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setRarity(String rarity){
        this.rarity = rarity;
    }

    // Add any methods here
    @Override
    public String toString() {
        String answer = "color: " + this.color + "/n" + "size: " + this.size + "/n" + "condition: " + this.collection + "/n" + "cost: " + this.cost + "/n" + "rarity: " + this.rarity + "/n";
        return answer;
    }
    public String equal(Object other){
        boolean equal1 = true;
        if(other instanceof Collectable){
            Collectable otherCollectable = Collectable(other);
            return (this.getSize() == otherCollectable.getSize()) && 
            (this.getColor().equals(otherCollectable.getColor())) && 
            (this.getCondition().equals(otherCollectable.getCondition())) && 
            (this.getCost() == (otherCollectable.getCost())) &&
            (this.getRarity().equals(othercCollectable.getRarity()));
        }else{
            return false;
        }
    }
}