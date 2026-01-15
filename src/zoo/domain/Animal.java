package zoo.domain;

public abstract class Animal 
{

private String name;
private int age;

public String getName() {
    return name;
}
public int getAge() {
    return age;
}


public Animal(String name, int age)
{this.name = name;
this.age = age;
if (age < 0) {
    throw new IllegalArgumentException("Age cannot be negative");
}
}

public void eat()
{System.out.println(name + " is eating");}

public void sleep()
{System.out.println(name + " is sleeping");}

public abstract String sound();

String info()
{
return "Name: " + name + ", Age: " + age;
}

}
