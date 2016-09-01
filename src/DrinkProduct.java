public class DrinkProduct extends Product{
    double volume;

    public DrinkProduct(double volume, int id, double price, String description) {
        super(id, price, description);
        setVolume(volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if(volume > 0){
            this.volume = volume;
        }
        else{
            throw new IllegalArgumentException("Volume can't be negative nor zero");
        }
    }
    
    public String toString(){
        return String.format("%s, %.2f]", super.toString(), volume);
    }
    
    
}
