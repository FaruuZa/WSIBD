package minggu5;

public class Main {

    public static void main(String args[]){
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();
        Animal animalDog = new Dog();
        animalDog.makeNoise();
        
        if(animal instanceof Animal)
            System.out.println("animal is Animal");
        if(dog instanceof Animal)
            System.out.println("dog is Animal");
        if(animalDog instanceof Animal)
            System.out.println("animalDog is Animal");
        if(animal instanceof Dog)
            System.out.println("animal is dog");
    }
}
