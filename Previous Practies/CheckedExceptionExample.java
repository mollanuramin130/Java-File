public class CheckedExceptionExample {

    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception.");
    }
}
