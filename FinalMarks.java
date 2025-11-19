import java.util.*;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        External[] students = new External[n];
        Internal[] cieMarks = new Internal[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            cieMarks[i] = new Internal();

            int[] internal = new int[5];
            int[] external = new int[5];

            System.out.println("Enter 5 Internal marks:");
            for (int j = 0; j < 5; j++)
                internal[j] = sc.nextInt();

            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++)
                external[j] = sc.nextInt();

            cieMarks[i].setMarks(internal);
            students[i].setSEE(external);

            sc.nextLine(); 
        }

    
        System.out.println("\n---- FINAL MARKS ----");
        for (int i = 0; i < n; i++) {
            students[i].display();
            cieMarks[i].displayMarks();
            students[i].displaySEE();

            System.out.print("Final Marks (out of 100 per subject): ");
            for (int j = 0; j < 5; j++) {
                int finalMark = (cieMarks[i].internalMarks[j] + (students[i].seeMarks[j] / 2));
                System.out.print(finalMark + " ");
            }
        }

    }
}