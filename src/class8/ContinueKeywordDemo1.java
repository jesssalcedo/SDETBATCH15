package class8;

public class ContinueKeywordDemo1 {

    public static void main(String[] args) {

        for (int i=0; i <10; i++){

            if(i%3==0){ // another example: i==3||i==6||i==9
                continue; // skip 3 6 9 ; also always use with if condition
            }else {
                System.out.println(i);

            }
        }
    }
}
