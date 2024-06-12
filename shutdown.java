import java.io.IOException;

public class shutdown {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t 0");  // Shuts down the system immediately (replace 0 with desired delay in seconds)
    }
}
