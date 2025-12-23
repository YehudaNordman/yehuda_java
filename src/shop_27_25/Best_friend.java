package shop_27_25;

public class Best_friend {
    String name, type;
    char gender;
    int age;
    boolean isImunned;

    public Best_friend(String name, String type, char gender, int age, boolean isImunned) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.isImunned = isImunned;
    }

    public boolean isItSuitable(char gender, int age) {
        if (gender != this.gender || age < this.age) {
            return false;
        }
        return true;
    }

    public static void print(Best_friend[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].isItSuitable('M', 2)+" "+ arr[i].isImunned);
            if (arr[i].isItSuitable('M', 2) && arr[i].isImunned) {
                System.out.println(arr[i].name + ", " + arr[i].type);
            }
        }
    }

    public static int countNoAge(Best_friend[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].age == 0 && arr[i].isImunned == false) {
                count++;
            }
        }
        return count;
    }
}
