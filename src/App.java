public class App {
    public static void main(String[] args) throws Exception {
        String baz = "Baz";
        String inga = "inga!";
        boolean isEven = false;
        boolean isFiveDiv = false;

        for (int i = 0; i <= 100; i++) {
            isEven = i % 2 == 0;
            isFiveDiv = i % 5 == 0;

            if (isEven && isFiveDiv) {
                System.out.println(baz + inga);
            }
            else if (isEven) {
                System.out.println(baz);
            }
            else if (isFiveDiv) {
                System.out.println(inga);
            }
            else {
                System.out.println(i);
            }
        }
    }
}
