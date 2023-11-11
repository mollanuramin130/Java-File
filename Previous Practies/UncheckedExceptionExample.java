public class UncheckedExceptionExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            int num = numbers[4];
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This is an unchecked exception
            System.out.println("Error: Index out of bounds");
        }
    }
}