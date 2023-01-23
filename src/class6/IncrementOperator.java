package class6;

public class IncrementOperator {

    public static void main(String[] args) {

        //3 ways to increment by 1

        int number=10;
        number=number+1;
        System.out.println(number);
        number+=1;
        System.out.println(number);
        number++; //also increments the number by 1
        System.out.println(number);

        int number2=10;
        number2--;
        System.out.println(number2);
    }
}
