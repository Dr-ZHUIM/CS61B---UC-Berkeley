/**
 * DogStaticAndDogNonStatic
 */
public class DogStaticAndDogNonStatic {
    public static void main(String[] args) {
        Dog dog1 = new Dog(12);
        Dog dog2 = new Dog(22);
        // Here we use a static method maxDog
        Dog biggerDog = Dog.maxDog(dog1,dog2);
        biggerDog.makeNoise();
        // Here we use a nonstatic method compareMaxDog
        Dog BiggerDog = dog1.compareMaxDog(dog2);
        BiggerDog.makeNoise();
    }
}