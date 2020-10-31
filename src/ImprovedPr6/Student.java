package ImprovedPr6;

public class Student {
    private String name;
    private int score;

    public Student(String n,int i) throws EmptyNameException{
        name=n;
        score=i;
        if (name.isEmpty()) {
            throw new EmptyNameException("Exception in empty line for name");
        }
    }
    public Student(String n){
        name=n;
        score=12;
    }
    public Student(int i){
        name="Karina";
        score=i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int compareTo(Student student) {
        if (score > student.getScore()) {
            return 1;
        } else if (score == student.getScore()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

