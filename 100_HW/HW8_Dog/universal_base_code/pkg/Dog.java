package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	private String name;
    private int age;
    private String breed;
    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }
    public Dog(String dogName) {
        name = dogName;
        age = 1;
        breed = "dog dog";
    }
    public Dog(String dogName, String dogBreed) {
        name = dogName;
        breed = dogBreed;
        age = 1;
    }
    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
        breed = "dog dog";
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void setBreed(String newBreed) {
        breed = newBreed;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getBreed() {
        return breed;
    }
    public boolean isSleeping() {
        return new Random().nextBoolean();
    }
    public void bark() {
        System.out.println(name + " barks!");
    }
}