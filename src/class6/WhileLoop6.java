package class6;

public class WhileLoop6 {
    public static void main(String[] args) {

        boolean flag=true;
        int num=0;

        while (flag) {
            System.out.println("Hello world");
            if (num > 3) {
                flag = false;
            }
            num++;
        }
    }
}
