public class Department {

    private String name;
    private Student students[];
    private int numOfStudents;
    static final int MAX_STUDENTS = 120;

    public Department(String name) {
        this.name = name;
        students = new Student[MAX_STUDENTS];
        numOfStudents = 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addStudent(Student student) {
        if (numOfStudents == MAX_STUDENTS) {
            return false;
        }
        students[numOfStudents++] = student;

        return true;
    }

    public Student getBestStudent() {
        int bestStudentIndex = 0;

        if (numOfStudents == 0) {
            return null;
        }
        for (int i = 1; i < numOfStudents; ++i) {
            if (students[i].getAverage() > students[bestStudentIndex].getAverage()) {
                bestStudentIndex = i;
            }
        }

        return students[bestStudentIndex];
    }
}

