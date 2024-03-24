package org.example.thread_safe_singleton;

import org.example.singleton.Singleton;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton singleton;
    private final String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getSingleton(String value) {
        ThreadSafeSingleton result = singleton;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new ThreadSafeSingleton(value);
            }
            return singleton;

        }
    }

    public String getValue() {
        return value;
    }
}
