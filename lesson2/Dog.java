/**
 * Typical Class demonstration
 * @instance_variable Can have as many of these as you want.
 * @constructor Can instantiate a instance of the class
 * @unstatic_method Can be called by a calss instance
 * @static_method Can be called by the calss
*/
public class Dog {
    public int _weight;

    public Dog(int weight) {
        _weight = weight;
    }
    public void makeNoise() {
        if (_weight <= 10) {
            System.out.println("yip!");
        } else if (_weight < 30) {
            System.out.println("woooof");
        } else {
            System.out.println("Bark!");
        }
    }
}
