/**
 * A simple demo program using lambda's in Java 8.
 *
 * @author: Sean Strout (RIT CS)
 */

public class Main {

    /**
     * The main program takes the first command line argument and uses
     * it in a print message that is spawned in a thread.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main arg");
            return;
        }

        // Runnable tied to a lambda
        Runnable r = () -> System.out.println("Hello " + args[0] + "!");
        r.run();
    }
}
