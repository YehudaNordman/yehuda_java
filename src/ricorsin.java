public class ricorsin {

    public static boolean isDivisor(int num, int divisor) {
        if (num < 0) return false;
        if (num == 0) return true;
        return isDivisor(num - divisor, divisor);
    }

    public static boolean seeKString(String str, char letter) {
        if (str.isEmpty()) return false;
        if (str.charAt(0) == letter) return true;
        String newStr = str.substring(1);
        return seeKString(newStr, letter);
    }

    public static boolean isPalindromeRac(String str) {
        if (str.isEmpty()) return false;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindromeRac(str.substring(+1, str.length() - 1));

    }

    public static void main(String[] args) {
        System.out.println(isDivisor(10, 5));
        String strr = "asdfghgfdsdfg";
        System.out.println(seeKString(strr, 'w'));
        System.out.println(isPalindromeRac("mom"));

    }
}
