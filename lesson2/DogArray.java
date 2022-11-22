public class DogArray {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(20);
        dogs[1] = new Dog(25);
        dogs[2] = new Dog(30);
        for(int i = 0 ; i < 3 ; i++) {
            dogs[i].makeNoise();
        }
    }
}
