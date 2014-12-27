public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main arg");
            return;
        }

        Runnable r = () -> System.out.println("Hello " + args[0] + "!");
        r.run();
    }
}
