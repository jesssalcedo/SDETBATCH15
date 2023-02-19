package Class27;

public class Demo2 {
    // create a method which can search a name from this array return true if name is present in the array

    public static void main(String[] args) {
        String name = "Savo";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        System.out.println(search(names,name));
    }
    public static boolean search(String[] names, String name) {
        for (String str : names) {
            if (names.equals("name")) {
                return true;
            }
        }
        return false;
    }
}