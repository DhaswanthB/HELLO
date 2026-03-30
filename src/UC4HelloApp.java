public class UC4HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);

                if (i < args.length - 1) {
                    sb.append(", ");
                }
            }

            System.out.println("Hello, " + sb.toString() + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}