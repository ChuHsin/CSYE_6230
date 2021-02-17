import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("start");

        ProcessBuilder pb = new ProcessBuilder("/Applications/Safari.app/Contents/MacOS/Safari");
        Process process = pb.start();
        Thread.sleep(30000);
        process.destroy();
        process.waitFor();


        System.out.println("End");
    }
}

