package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorThreadSafe {

    private Executor executor = new ScheduledThreadPoolExecutor(10);

}
