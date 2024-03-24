package by.academy.project.test;

public class Facebook extends Network {

    public Facebook(String name, String password) {
        setUserName(name);
        setPassword(password);
    }

    @Override
    public boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + getUserName());
        System.out.print("Password: ");
        for (int i = 0; i < getPassword().length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + getUserName() + "' was logged out from Facebook");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
