package class8;

public class RecapDemo1 {

    public static void main(String[] args) {

        // 10 8 6 4 2 - number starts with 10 and decrements
        int num=10;
        while (num>=2){ // <-- condition
            System.out.println(num);
            num-=2;
        }

        System.out.println("*****************");

        int num2=10;

        do{
            System.out.println(num2);
            num2-=2; // same as num2-2


        }while (num2>=2);

    }
}
