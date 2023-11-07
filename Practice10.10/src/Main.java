public class Main {
    public static int Counter(int n) {
        return reverseNumber(n, 0);
    }
    private static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            int lastDigit = n % 10;
            return reverseNumber(n / 10, reversed * 10 + lastDigit);
        }
    }
    public static void main(String[] args) {
        int n = 55214;
        int reversed = Counter(n);
        System.out.println("Разворот числа: " + reversed);
    }
}