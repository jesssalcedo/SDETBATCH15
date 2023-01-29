package Class15;

public class MPractice6 {

    /*hereCreate a method createEmail().
    Based on values of users name, lastName and email type,
    your method should return complete email Address.
     Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
     */

    String createEmail(String name, String lastName, String email) {
        String address = name+lastName+email;
        return address;
    }



}
