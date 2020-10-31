package ImprovedPr6;

import java.util.ArrayList;
import java.util.Comparator;

class LabClass implements LapClassUI {
    ArrayList<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    @Override
    public void sortByScore() {
        Comparator comparator = (student1, student2) -> ((Student) student1).compareTo((Student) student2);
        students.sort(comparator);
    }

    @Override
    public Student searchName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Exception in non-existent student");
    }

    @Override
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void addStudent(String name, int score) throws EmptyNameException {
        Student student = new Student(name, score);
        students.add(student);
    }
}