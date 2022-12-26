package lesson8_inheritance_implements;

import lesson4.SLList;
import lesson6_ALists.AList;

public class WordUtils {
    /** Returns the length of the longest word */
    public static String longest(MyList<String> list){
        int maxDex = 0;
        for (int i = 0; i < list.size(); i++){
            String longestString = list.get(maxDex);
            String thisString = list.get(i);
            if(thisString.length() > longestString.length()){
                maxDex = i;
            }
        }
        return list.get(maxDex);
    }
    public static void main(String[] args) {
        MyList<String> someList = new AList<>();
        someList.addLast("elk");
        someList.addLast("are");
        someList.addLast("watching");
        someList.addLast("watcdsadsahing");
        System.out.println(longest(someList));
    }
}
