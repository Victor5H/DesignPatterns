package codeWithAryan.creational.singleton;

public class Main {
    public static Runnable implement(){
        return ()->{
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            Logger logger = Logger.getLogger();
            logger.log("hi from "+Thread.currentThread().getName());
        };
    }
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            new Thread(implement(),String.valueOf(i)).start();
        }
    }
}
