package class11;

public class task3 {

    public static void main(String[] args) {


    /*
     Create a 2D array(shorter way)
      in which first array will consist of 4 names and second array
      will contain grades. Then your program should print name of the students that has A and B grade

     */

        String [][] student = {{"Jessica", "Jason", "Javier", "Jasmin"},
                               {"A", "B", "C", "D"}};

        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {

                if (student[i][j]=="A"||student[i][j]=="B"){
                    System.out.println(student[0][j]+" ");
                }

            }

        }
            }

        }



