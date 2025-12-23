public class Course {
    private int id;
    private String name;
    private int grade;
    private int num;
    private int ofir;

    public Course(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
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

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOfir() {
        return ofir;
    }

    public void setOfir(int ofir) {
        this.ofir = ofir;
    }
}
