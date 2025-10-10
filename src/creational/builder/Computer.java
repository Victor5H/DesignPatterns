package creational.builder;

public class Computer {
    private String motherboard;
    private String CPU;
    private String GPU;

    private Computer(ComputerBuilder computerBuilder) {
        // for validation of necessary fields
        this.setGPU(computerBuilder.computer.getGPU());
        this.setCPU(computerBuilder.computer.getCPU());
        this.setMotherboard(computerBuilder.computer.getMotherboard());
    }
    private Computer(){}

    @Override
    public String toString() {
        return "Computer{" +
                "id "+ this.hashCode()+'\''+
                "motherboard='" + motherboard + '\'' +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }

    public String getMotherboard() {
        return motherboard;
    }

    private void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCPU() {
        return CPU;
    }

    private void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    private void setGPU(String GPU) {
        this.GPU = GPU;
    }


    static class ComputerBuilder {
        private final Computer computer;
        public ComputerBuilder(){
            this.computer=new Computer();
        }
        public ComputerBuilder Motherboard(String motherboard){
            this.computer.setMotherboard(motherboard);
            return this;
        }
        public ComputerBuilder CPU(String CPU){
            this.computer.setCPU(CPU);
            return this;
        }
        public ComputerBuilder GPU(String GPU){
            this.computer.setGPU(GPU);
            return this;
        }
        public Computer build(){
            return new Computer(this);
//            or can validate here as well
//            return this.computer;
        }

        @Override
        public String toString() {
            return "ComputerBuilder{" +
                    "computer=" + computer +
                    '}';
        }
    }

}
