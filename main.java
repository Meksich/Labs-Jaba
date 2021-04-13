class Microcontroller{
    private int bit_rate;
    private double CPU_clock_speed; // clock speed in GHz
    private String producer;

    private int year_of_production;
    private String name;
    private int memory; // memory in KB
    private int height; // height in mm
    private int width; // width in mm

    static public int working_hours;

    protected String too_many_fields;
    protected int number_of_LEDs;

    static{
        working_hours = 5000;
    }

    public Microcontroller() {
    bit_rate = 64;
    CPU_clock_speed = 3.6;
    producer = "Intel";

    year_of_production = 2017;
    name = "Intel core i3";
    memory = 2048; 
    height = 2;
    width = 38;

    too_many_fields = "Yes";
    number_of_LEDs = 0;
    }

    public Microcontroller(int bit_rate, double CPU_clock_speed, String producer, int year_of_production) {
        this.bit_rate = bit_rate;
        this.CPU_clock_speed = CPU_clock_speed;
        this.producer = producer;
        this.year_of_production = year_of_production;
    }

    public Microcontroller(int bit_rate, double CPU_clock_speed, String producer, int year_of_production, 
                           String name, int memory, int height, int width, String too_many_fields, int number_of_LEDs){
        this(bit_rate, CPU_clock_speed, producer, year_of_production);
        this.name = name;
        this.memory = memory;
        this.height = height;
        this.width = width;
        this.too_many_fields = too_many_fields;
        this.number_of_LEDs = number_of_LEDs;
    }

    public String getToo_many_fields() {
        return this.too_many_fields;
    }

    public void setToo_many_fields(String too_many_fields) {
        this.too_many_fields = too_many_fields;
    }

    public int getNumber_of_LEDs() {
        return this.number_of_LEDs;
    }

    public void setNumber_of_LEDs(int number_of_LEDs) {
        this.number_of_LEDs = number_of_LEDs;
    }

    public int getBit_rate() {
        return this.bit_rate;
    }

    public void setBit_rate(int bit_rate) {
        this.bit_rate = bit_rate;
    }

    public double getCPU_clock_speed() {
        return this.CPU_clock_speed;
    }

    public void setCPU_clock_speed(int CPU_clock_speed) {
        this.CPU_clock_speed = CPU_clock_speed;
    }

    public String getProducer() {
        return this.producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear_of_production() {
        return this.year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
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

    public String toString() {
        return "bit rate = " + getBit_rate() + "\n" +
            "CPU clock speed = " + getCPU_clock_speed() + "\n" +
            "producer = " + getProducer() + "\n" +
            "year of production ='" + getYear_of_production() + "\n" +
            "name = " + getName() + "\n" +
            "memory = " + getMemory() + "\n" +
            "height = " + getHeight() + "\n" +
            "width = " + getWidth() + "\n" +
            "too many fields = " + getToo_many_fields() + "\n" +
            "number of LEDs = " + getNumber_of_LEDs() + "\n";
    }

    public static void printStaticWorkingHours() {
        System.out.println(working_hours);
    }

    public void printWorkingHours() {
        System.out.println(working_hours);
    }

    public void resetValues(int bit_rate, double CPU_clock_speed, String producer, int year_of_production, 
    String name, int memory, int height, int width, String too_many_fields, int number_of_LEDs) {

        this.name = name;
        this.memory = memory;
        this.height = height;
        this.width = width;
        this.too_many_fields = too_many_fields;
        this.number_of_LEDs = number_of_LEDs;
        this.bit_rate = bit_rate;
        this.CPU_clock_speed = CPU_clock_speed;
        this.producer = producer;
        this.year_of_production = year_of_production;
    }

    
}

class Main{
    public static void main(String[] args){
        Microcontroller My_Microcontroller_1 = new Microcontroller();
        Microcontroller My_Microcontroller_2 = new Microcontroller(8, 0.76, "Intel", 1987);
        Microcontroller My_Microcontroller_3 = new Microcontroller(8, 0.011, "Renesas", 1980,
                                                                   "Error", 64, 7, 40, "Sure", 18);
        System.out.println(My_Microcontroller_1);
        My_Microcontroller_2.resetValues(1, 2, "erhgeyuge", 2167, "Petro", 1488, 2, 47, "No doubt", 13);
        System.out.println(My_Microcontroller_2);
        My_Microcontroller_3.printWorkingHours();
    }
}