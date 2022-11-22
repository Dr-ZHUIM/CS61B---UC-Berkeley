/**
 * The DogLuncher class tries to 'test drive' the Dog class.
 * @ 
 * Declaration of a Dog variable -- Dog d;
 * @
 * Instantiation and Assignment -- d = new Dog(33);
 */
public class DogLuncher {
    public static void main(String[] args) {
        Dog d = new Dog(33);
        d.makeNoise();
    }
}