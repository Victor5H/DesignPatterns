package creational.builder;

public class testBuilder {
    public static void main(String[] args) {
      Computer c  = new Computer.ComputerBuilder().CPU("sdf").build();
      Computer c4 = new Computer.ComputerBuilder().GPU("56df").build();
        System.out.println(new Computer.ComputerBuilder());
        System.out.println(c);
        System.out.println(c4);
    }
    Computer r =  new Computer.ComputerBuilder().GPU("sdf").build();
}
