package app;

public class Loger {
    private static Loger instance;

    private Loger(){}

    public static Loger getInstance(){
        if (instance == null){
            synchronized (Loger.class){
                if (instance == null){
                    instance = new Loger();
                }
            }
        }
        return instance;
    }
    private StringBuilder logs = new StringBuilder();

    public void log(String message){
        logs.append(message).append("\n");
        System.out.println("Logged " + message);
    }
    public String getLog(){
        return logs.toString();
    }
}
