package src.java.microcontroller;

public class App {
    public static void main(String[] args){
        Microcontroller myFirstMicrocontroller = new Microcontroller();
        Microcontroller mySecondMicrocontroller = new Microcontroller(8, 0.76, "Intel", 1987);
        Microcontroller myThirdMicrocontroller = new Microcontroller(8, 0.011, "Renesas", 1980,
                                                                   "Error", 64, 7, 40, "Sure", 18);
        System.out.println(myFirstMicrocontroller);
        mySecondMicrocontroller.resetValues(1, 2, "erhgeyuge", 2167, "Petro", 1488, 2, 47, "No doubt", 13);
        System.out.println(mySecondMicrocontroller);
        myThirdMicrocontroller.printWorkingHours();
        Microcontroller.printStaticWorkingHours();
    }
}
