public class OopsBannerApp5 {

    public static void main(String[] args) {

        // Array initialization with String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", "U", "C", "5", " ", "*"),
                String.join("", "*", " ", "B", "A", "N", " ", "*"),
                String.join("", "*", " ", "N", "E", "R", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop for display
        for (String line : banner) {
            System.out.println(line);
        }
    }
}