package by.academy.project.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - X");
        int choice = Integer.parseInt(reader.readLine());

        Network network = null;
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new X(userName, password);
        }
        network.post(message);
    }
}