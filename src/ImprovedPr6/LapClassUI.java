package ImprovedPr6;

public interface LapClassUI {
    void sortByScore();
    Student searchName(String name) throws StudentNotFoundException;
    void printStudents();
    void addStudent(String name, int score) throws EmptyNameException;
}
