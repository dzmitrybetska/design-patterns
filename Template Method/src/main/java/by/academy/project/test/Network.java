package by.academy.project.test;

public abstract class Network {

    private String userName;
    private String password;

    public boolean post(String message) {
        if (logIn(userName, password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    public abstract boolean logIn(String userName, String password);

    public abstract boolean sendData(byte[] data);

    public abstract void logOut();

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
