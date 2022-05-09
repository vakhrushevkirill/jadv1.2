import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        List<Callable<Integer>> callableList = new ArrayList<>();
        Callable<Integer> callable1 = new MyThread();
        Callable<Integer> callable2 = new MyThread();
        Callable<Integer> callable3 = new MyThread();
        Callable<Integer> callable4 = new MyThread();
        callableList.add(callable1);
        callableList.add(callable2);
        callableList.add(callable3);
        callableList.add(callable4);

        //System.out.println("Случай 1");
        //List<Future<Integer>> tasks = executorService.invokeAll(callableList);
        ///executorService.shutdown();

        System.out.println("Случай 2");
        Integer task = executorService.invokeAny(callableList);
        executorService.shutdown();
    }
}
