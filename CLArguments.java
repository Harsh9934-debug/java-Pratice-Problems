// Using command line arguments
class CLArguments {
    public static void main(String args[]) {
        float sum = 0;
        int n = args.length;

        if (n == 0) {
            System.out.println("No arguments provided. Please pass some numbers as command-line arguments.");
            return;
        }

        for (int i = 0; i < n; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        float average = sum / n;
        System.out.println("Average of " + n + " arguments is: " + average);
    }
}
