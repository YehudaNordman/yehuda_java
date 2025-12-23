package shop_27_25;

public class best_friend1 {
    public static void main(String[] args) {
        // (String name, String type, char gender, int age, boolean isImunned)
        Best_friend dog1 = new Best_friend("123", "naknik", 'M', 4, true);
        Best_friend dog2 = new Best_friend("bobee", "naknik", 'f', 2, false);
        Best_friend dog3 = new Best_friend("bobee!!", "naknik", 'M', 1, true);
        Best_friend dog4 = new Best_friend("bobee", "naknik", 'M', 2, false);
        Best_friend dog5 = new Best_friend("bobee", "naknik", 'f', 2, true);
        System.out.println(dog1.isItSuitable('M', 4));
        Best_friend[] arr = {dog1, dog2, dog3, dog4, dog5};
        Best_friend.print(arr);
        System.out.println(Best_friend.countNoAge(arr));
    }
}
