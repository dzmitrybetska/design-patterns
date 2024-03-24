package org.example;

import org.example.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton("FOO");
        Singleton anotherSingleton = Singleton.getSingleton("BAR");
        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getSingleton("FOO");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getSingleton("BAR");
            System.out.println(singleton.getValue());
        }
    }
}