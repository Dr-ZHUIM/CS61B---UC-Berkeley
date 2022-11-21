package Lab1;

/**
 * @author Dr-Zhuim 
 * @description this is lab1 of CS61B of UC Berkeley
 * @method 
 * isLeapYear, this is a function that returns a boolean value .
 * If the parameter passed into this function is a int value which can % 4 totally or can % 400 totally and cannot % 100 totally, returning a true.
 * Else this function will return a false.
 */

public class LeapYear {

    public static boolean isLeapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1999));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2100));
    }
}
