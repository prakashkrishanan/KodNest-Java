public class unaryDemo {

    public static void main(String[] args) {
        int a = 10;
        int res = a++ + ++a + a++ + a++ + ++a + a++;
        //        10  + 11  + 12  + 13  +15   + 15   
        System.out.println(res);
    }
}