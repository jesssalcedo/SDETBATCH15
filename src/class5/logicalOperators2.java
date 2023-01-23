package class5;

public class logicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(true&&false);


        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;


        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("You're a brilliant student");
        }else{
            System.out.println("You need to work harder");
        }

    }
}
