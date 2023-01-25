package Class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String str = " ";
        for (int i = 0; i < 1000; i++) {
            // str=str+i; - will loop 100 times concactination bc string
         //   str.append(i);
        }
    }
}

//why is string immutable? interview questions

