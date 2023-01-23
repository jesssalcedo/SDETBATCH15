package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        int[] arr={10,1,20,25,45,50};
    // we can't update the elements in for each loop bc we dont have access to index. We can only print

        for(int x:arr){
            if(x%2!=0){
                x=0;
            }
        }
    }
}
