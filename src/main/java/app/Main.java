package app;

public class Main {
    public static void main(String[] args) {
        Loger loger1 = Loger.getInstance();
        Loger loger2 = Loger.getInstance();
        loger1.log("loger 1");
        loger2.log("loger 2");
//        еревірка чи це один і той самий об'єкт
        System.out.println("Доводимо що це один і той самий об'єкт : " + loger1.equals(loger2));
        System.out.println(loger1.getLog());
        System.out.println(loger2.getLog());
    }
}