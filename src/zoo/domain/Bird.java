package zoo.domain;

public abstract class Bird extends Animal {

    public static final int MAX_AGE_BIRD = 50; //
    protected String wingSpan;
    protected String canFly;
    protected String dietType;

    public Bird(String name, int age, String wingSpan, String canFly, String dietType) {
        super(name, age); //
        if (age > MAX_AGE_BIRD) {
            throw new IllegalArgumentException("Age exceeds maximum limit for birds");
        }
        this.wingSpan = wingSpan;
        this.canFly = canFly;
        this.dietType = dietType;
    }

    @Override
    public String info() {
        return super.info() + ", Wing Span: " + wingSpan + ", Can Fly: " + canFly + ", Diet Type: " + dietType;
    }
}