import java.util.Scanner;

public class AddingStudents {
    static String[][] sortArray(String array [][]) {
        String [] temp;
        temp = new String[4];
        for (int i = array.length - 1; i > 0; i--){
            for (int i2 = 0; i2 < i; i2++)
            if ((array[i][0].compareTo(array[i2][0])) < 0){
                    temp = array[i2];
                    array[i2] = array[i];
                    array[i] = temp;
            }
        }
        return array;
    }
    public static void main (String[]args) {
        //Declare variables
        Scanner keybd = new Scanner(System.in);
        int numOfStudents;
        String[][] students, sortStudents;

        //Prompt for how many students in the class
        System.out.print("Enter the number of students in the class: ");
        numOfStudents = keybd.nextInt();

        //Set the array with the size provided
        students = new String[numOfStudents][4];
        sortStudents = new String[numOfStudents][4];
        keybd.nextLine(); // flush the buffer

        //Enter the students name, id number, major, and educational department
        for (int index1 = 0; index1 < students.length; index1++) {
            System.out.println("Enter the students name:");
            students[index1][0] = keybd.nextLine();
            System.out.println("Enter " + students[index1][0] + "'s student id:");
            students[index1][1] = keybd.nextLine();
            System.out.println("Enter " + students[index1][0] + "'s major:");
            students[index1][2] = keybd.nextLine();
            System.out.println("Enter the educational department:");
            students[index1][3] = keybd.nextLine();
        }
        /* commenting for the sorted output
        System.out.printf("%-40s %-10s %-40s %-40s\n", "Name", "Id", "Major", "Department");
        for (int index1 = 0; index1 < students.length; index1++) {
            System.out.printf("%-40s %-10s %-40s %-40s\n", students[index1][0], students[index1][1],
                    students[index1][2], students[index1][3]);
        }*/

        // Don't really need a copy but just to keep the original
        for (int i = 0; i < numOfStudents; i++){
            for (int i2 = 0; i2 < 4; i2++){
                sortStudents[i][i2] = students[i][i2];
            }

        }
        sortArray(sortStudents); // call method to sort

        // Now to output the information
        System.out.printf("%-40s %-10s %-40s %-40s\n", "Name", "Id", "Major", "Department");
        System.out.printf("%-40s %-10s %-40s %-40s\n", "----", "--", "-----", "----------");
        for (int index1 = 0; index1 < students.length; index1++){
            System.out.printf("%-40s %-10s %-40s %-40s\n", sortStudents[index1][0], sortStudents[index1][1],
            sortStudents[index1][2], sortStudents[index1][3]);
        }
    }
}
