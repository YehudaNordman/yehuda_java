public class Student {
    private int id;
    private String name;

    private Course courses[];
    private int numOfCourses;

    private float average;
    static final int MAX_COURSES = 20;
    static int numOfStudents = 0;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new Course[MAX_COURSES];
        numOfCourses = 0;
        average = -1;
        ++numOfStudents;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addCourse(Course course) {
        if (numOfCourses == MAX_COURSES) {
            return false;
        }
        courses[numOfCourses++] = course;
        average = -1;

        return true;
    }

    public float getAverage(){
        if (average != -1) {
            return average;
        }
        float sum=0;
        for (int i=0; i < numOfCourses; ++i) {
            sum += courses[i].getGrade();
        }
        return sum/numOfCourses;
    }

    public boolean isGraduated(){
        int numOfFailedCourses = 0;
        for (int i=0; i < numOfCourses; ++i) {
            if (courses[i].getGrade() < 55) {
                ++numOfFailedCourses;
            }
        }

        return (numOfFailedCourses < 3 && getAverage() > 60);
    }

    public Course  removeById(int id) {
        Course removedCourse = null;

        for (int i=0; i < numOfCourses; ++i) {
            if (courses[i].getId() == id) {
                removedCourse = courses[i];
                courses[i] = courses[numOfCourses - 1];
                --numOfCourses;
                average = -1;
                break;
            }
        }

        return removedCourse;
    }

    public Course  removeTheMinimalGradeCourse() {
        Course removedCourse = null;
        int minimalGradeIndex = 0;

        if (numOfCourses == 0) {
            return null;
        }

        for (int i=1; i < numOfCourses; ++i) {
            if (courses[i].getGrade() < courses[minimalGradeIndex].getGrade()) {
                minimalGradeIndex = i;
            }
        }
        removedCourse = courses[minimalGradeIndex];
        courses[minimalGradeIndex] = courses[numOfCourses - 1];
        --numOfCourses;
        average = -1;

        return removedCourse;
    }

    public void printCourses() {
        System.out.println("    Courses:");
        for(int i=0; i < numOfCourses; ++i) {
            System.out.println("    Course ID:" + courses[i].getId() + " | " +
                    "Name: " + courses[i].getName() + " | " + "Grade: " + courses[i].getGrade() + ".");
        }
    }
}
