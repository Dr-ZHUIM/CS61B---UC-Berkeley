package lesson4;

public class TestGet {
    public static void main(String[] args) {
        SLList<String> testList = new SLList<String>("first");
        testList.addLast("second");
        testList.addLast("third");
        testList.addLast("forth");
        String actual = testList.get(4);
        System.out.println(actual);
        org.junit.Assert.assertEquals("first",actual);
    }
}
