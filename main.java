class Microcontroller{

    private int bitRate;
    private double CPUClockSpeed; // clock speed in GHz
    private String producer;

    private int yearOfProduction;
    private String name;
    private int memory; // memory in KB
    private int height; // height in mm
    private int width; // width in mm

    static public int workingHours;

    protected String tooManyFields;
    protected int numberOfLEDs;

    static{
        workingHours = 5000;
    }

    public Microcontroller() {
    bitRate = 64;
    CPUClockSpeed = 3.6;
    producer = "Intel";

    yearOfProduction = 2017;
    name = "Intel core i3";
    memory = 2048; 
    height = 2;
    width = 38;

    tooManyFields = "Yes";
    numberOfLEDs = 0;
    }

    public Microcontroller(int bitRate, double CPUClockSpeed, String producer, int yearOfProduction) {
        this.bitRate = bitRate;
        this.CPUClockSpeed = CPUClockSpeed;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public Microcontroller(int bitRate, double CPUClockSpeed, String producer, int yearOfProduction, 
                           String name, int memory, int height, int width, String tooManyFields, int numberOfLEDs){
        this(bitRate, CPUClockSpeed, producer, yearOfProduction);
        this.name = name;
        this.memory = memory;
        this.height = height;
        this.width = width;
        this.tooManyFields = tooManyFields;
        this.numberOfLEDs = numberOfLEDs;
    }


    public int getBitRate() {
        return this.bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public double getCPUClockSpeed() {
        return this.CPUClockSpeed;
    }

    public void setCPUClockSpeed(double CPUClockSpeed) {
        this.CPUClockSpeed = CPUClockSpeed;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTooManyFields() {
        return this.tooManyFields;
    }

    public void setTooManyFields(String tooManyFields) {
        this.tooManyFields = tooManyFields;
    }

    public int getNumberOfLEDs() {
        return this.numberOfLEDs;
    }

    public void setNumberOfLEDs(int numberOfLEDs) {
        this.numberOfLEDs = numberOfLEDs;
    }    

    public String toString() {
        return "bit rate = " + getBitRate() + "\n" +
            "CPU clock speed = " + getCPUClockSpeed() + "\n" +
            "producer = " + getProducer() + "\n" +
            "year of production ='" + getYearOfProduction() + "\n" +
            "name = " + getName() + "\n" +
            "memory = " + getMemory() + "\n" +
            "height = " + getHeight() + "\n" +
            "width = " + getWidth() + "\n" +
            "too many fields = " + getTooManyFields() + "\n" +
            "number of LEDs = " + getNumberOfLEDs() + "\n";
    }

    public static void printStaticWorkingHours() {
        System.out.println(workingHours);
    }

    public void printWorkingHours() {
        System.out.println(workingHours);
    }

    public void resetValues(int bitRate, double CPUClockSpeed, String producer, int yearOfProduction, 
    String name, int memory, int height, int width, String tooManyFields, int numberOfLEDs) {

        this.name = name;
        this.memory = memory;
        this.height = height;
        this.width = width;
        this.tooManyFields = tooManyFields;
        this.numberOfLEDs = numberOfLEDs;
        this.bitRate = bitRate;
        this.CPUClockSpeed = CPUClockSpeed;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    
}

class App{

    public static void main(String[] args){
        Microcontroller myFirstMicrocontroller = new Microcontroller();
        Microcontroller mySecondMicrocontroller = new Microcontroller(8, 0.76, "Intel", 1987);
        Microcontroller myThirdMicrocontroller = new Microcontroller(8, 0.011, "Renesas", 1980,
                                                                   "Error", 64, 7, 40, "Sure", 18);
        System.out.println(myFirstMicrocontroller);
        mySecondMicrocontroller.resetValues(1, 2, "erhgeyuge", 2167, "Petro", 1488, 2, 47, "No doubt", 13);
        System.out.println(mySecondMicrocontroller);
        myThirdMicrocontroller.printWorkingHours();
    }
}
