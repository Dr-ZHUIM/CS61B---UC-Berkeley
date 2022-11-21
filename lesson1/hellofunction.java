package lesson1;

public class hellofunction {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(-5,10));
    }
}

/*
 * 1. Function must be declared as part of a class in Java
 *    Function that is a part of a class called a method.
 *    So in Java, all functions called methods/
 * 2. To define a function in Java, we use "public static" operator.
 *    We will see alternate ways of defining functions later.
 * 3. All parameters in a function must have their types.
 *    and the return value must have a type.
 * 4. Function in Java only return one value.
 */
