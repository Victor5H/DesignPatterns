package creational.singleton;
class DateUtil{
    private static DateUtil instance; //any properties of class must be static
    static int d;
    private DateUtil(){} // wont allow other to create an object
    public static DateUtil getInstance(){
        if(instance == null) {
            // all init here
            instance = new DateUtil();
            d=6;
        }
        return instance;
    }
}
public class lazyInit {
    public static void main(String[] args) {
        DateUtil du = DateUtil.getInstance();
        System.out.println(du.d);
    }
}
