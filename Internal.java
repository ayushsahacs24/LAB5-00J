package CIE;

public class Internal {
    public int[] internalMarks = new int[5];

    public void setMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            internalMarks[i] = marks[i];
        }
    }

    public void displayMarks() {
        System.out.print("Internal Marks: ");
        for (int m : internalMarks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
