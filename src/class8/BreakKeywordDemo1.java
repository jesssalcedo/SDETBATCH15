package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;

        while(summer){
            if(temp<=100){
                System.out.println("I love summer because the temperature is "+temp);
            }else {
                System.out.println("ITs very hot");
                break;
            }
            temp+=5;
        }
    }
}
