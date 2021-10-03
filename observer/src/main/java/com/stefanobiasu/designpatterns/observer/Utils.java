package com.stefanobiasu.designpatterns.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class Utils {

    public static void shutdownIn(ExecutorService threadPool, int seconds) {
        threadPool.shutdown();
        try {
            if (!threadPool.awaitTermination(seconds, TimeUnit.SECONDS)) {
                threadPool.shutdownNow();
            }
        } catch (InterruptedException ex) {
            threadPool.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
