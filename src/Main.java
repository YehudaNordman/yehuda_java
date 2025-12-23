
public class Main {
    public static void main(String[] args) {
        car toyota = new car(25, "white", "comety");
        car volvo = new car(25, "white", "comety");
        toyota.model = 30;
        System.out.println("color: " + volvo.color);
        System.out.println("model: " + toyota.model);
        System.out.println(volvo.getDescription());

        System.out.println("=============\n");


        System.out.println("Class Basic Example:");

        Course c1 = new Course(12, "Mathematics", 87);
        Course c2 = new Course(22, "Physics", 50);
        Course c3 = new Course(13, "Hebrew", 100);
        Course c4 = new Course(4, "Talmud", 90);
        Course c5 = new Course(5, "Computer science", 88);


        Student student1 = new Student(324, "Ben-Haim");

        student1.addCourse(c1);
        student1.addCourse(c2);
        student1.addCourse(c3);
        student1.addCourse(c4);
        student1.addCourse(c5);
        System.out.println("Student name: " + student1.getName() + "  ID: " + student1.getId());
        System.out.println("    Grades average: " + student1.getAverage());
        System.out.println("    Is graduated: " + student1.isGraduated());
        student1.printCourses();
        System.out.println("==================================");
        student1.removeById(4);
        student1.printCourses();
        System.out.println("==================================");
        student1.removeTheMinimalGradeCourse();
        student1.printCourses();
        System.out.println("==================================");
        System.out.println("Number of students: " + Student.numOfStudents);
        System.out.println("Max Courses: " + Student.MAX_COURSES);
        c1.setId(45);
        System.out.println("asdfghj "+c1.getId());
        c1.setNum(99);
        c2.setNum(34);
        System.out.println("c1 "+c1.getNum());
        System.out.println("c2 "+c2.getNum());

    }
}

