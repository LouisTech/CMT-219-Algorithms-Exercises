public class ShowArgs {
    public static void main(String[] args) {
        System.out.println("Received " + args.length + " args.");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
