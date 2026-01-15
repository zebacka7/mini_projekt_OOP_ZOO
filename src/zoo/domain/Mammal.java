package zoo.domain;

public abstract class Mammal extends Animal
{

public static final int Max_AGE_Mammal = 100;
protected String furColor;
protected String dietType;

public Mammal(String name, int age, String furColor, String dietType)
 {
 super(name, age);
 if (age > Max_AGE_Mammal) {
     throw new IllegalArgumentException("Age exceeds maximum limit for mammals");
 }
    this.furColor = furColor;
    this.dietType = dietType;
}

 @Override
 public String info()
 {
 return super.info() + ", Fur Color: " + furColor + ", Diet Type: " + dietType;
 }

}
