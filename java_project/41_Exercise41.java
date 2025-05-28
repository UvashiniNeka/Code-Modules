
// Exercise 41: Executor Service and Callable
import java.util.concurrent.*;
import java.util.*;

public class Exercise41 {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(() -> "Result from Task 1");
        tasks.add(() -> "Result from Task 2");
        tasks.add(() -> "Result from Task 3");

        List<Future<String>> results = service.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }
        service.shutdown();
    }
}
