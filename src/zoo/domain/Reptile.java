package zoo.domain;

public abstract class Reptile extends Animal {

    public static final int MAX_AGE_REPTILE = 150;
    
    protected String isVenomous;
    protected String dietType; 
    public Reptile(String name, int age, String isVenomous, String dietType) {
        super(name, age);
        if (age > MAX_AGE_REPTILE) {
            throw new IllegalArgumentException("Age exceeds maximum limit for reptiles");
        }
        
        this.isVenomous = isVenomous;
        this.dietType = dietType; 
    }

    @Override
    public String info() {
        return super.info() + ", Venomous: " + isVenomous + ", Diet: " + dietType;
    }
}