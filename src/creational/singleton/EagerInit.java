package creational.singleton;

public class EagerInit {
    // all init here
    private static EagerInit eagerInit= new EagerInit();
    static int num=5 ;
    private EagerInit(){
    }

    public static EagerInit getInstance(){
        return eagerInit;
    }

    public static void main(String[] args) {
        System.out.println(EagerInit.getInstance().num);
    }
    //problem with eager approach is that
//    the object will we created no matter its wanted or not since object is initialized in static block
//    object will initialized when class is loaded in JVM, and will consume memory
}
