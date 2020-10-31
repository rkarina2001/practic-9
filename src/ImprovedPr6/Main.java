package ImprovedPr6;

public class Main {
    public static void main(String[] args) throws EmptyNameException, StudentNotFoundException {
        LapClassUI lapClassUI = new LabClass();
        lapClassUI.addStudent("Зинаида", 4);
        lapClassUI.addStudent("Валентин", 3);
        lapClassUI.addStudent("Эмануил", 5);
        lapClassUI.addStudent("Паулина", 4);

        lapClassUI.printStudents();
        lapClassUI.sortByScore();
        System.out.println();
        lapClassUI.printStudents();

        System.out.println();
        System.out.println(lapClassUI.searchName("Зинаида"));
    }
}

