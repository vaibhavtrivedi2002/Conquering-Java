class Resource {

    private boolean isClosed = false;

    public void close() {
        isClosed = true;
        System.out.println("Closed normally.");
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isClosed) {
            System.out.println("Closed in finalize method.");
        }
        super.finalize();
    }
}

public class finalize{

    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();

        // Don't call close() method to simulate resource leak
        resource = null;

        System.gc();  // Request garbage collection

        Thread.sleep(1000);  // Wait for finalize method to be called
    }
}
