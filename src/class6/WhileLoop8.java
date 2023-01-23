package class6;

public class WhileLoop8 {

    public static void main(String[] args) {

//        int number=1;
//
//        while (number<=16){
//            if(number==5||number==10||number==15){
//
//            }else {
//                System.out.println(number);
//                number++;
//            }

        System.out.println("*******************");

        boolean condition = true;
        int num = 1;
        while (condition) {
            if (!(num % 5 == 0))
                System.out.println(num);
            if (num > 15) {
                condition = false;
            }
            num++;
        }
    }
}
