public class FoodProduct extends Product{

    double weight;
    
    public FoodProduct(double weight, int id, double price, String description) {
        super(id, price, description);
        setWeigth(weight);
    }

    public void setWeigth(double weight) {
        if(weight > 0){
            this.weight = weight;
        }
        else{
            throw new IllegalArgumentException("weight can't be negative nor zero");
        }
    }
    
    public double getWeight(){
        return weight;
    }
    
    public String toString(){
        return String.format("%s, %.2f]", super.toString(), weight);
    }
}
