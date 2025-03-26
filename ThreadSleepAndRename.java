public class ThreadSleepAndRename {

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("Initial Thread Name: " + Thread.currentThread().getName());

                    // Sleep for 5 seconds
                    Thread.sleep(5000);

                    // Change thread name
                    Thread.currentThread().setName("NewThreadName");

                    System.out.println("Thread Name after sleep: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted.");
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }
}