package src.java.microcontroller;

public class App {
    public static void main(String[] args){
        Microcontroller defualtMicrocontroller = new Microcontroller();
        Microcontroller intelCoreI3 = new Microcontroller(8, 0.76, "Intel", 1987);
        Microcontroller renesasIcon12 = new Microcontroller(8, 0.011, "Renesas", 1980,
                                                                   "Error", 64, 7, 40, "Sure", 18);
        System.out.println(defualtMicrocontroller);
        intelCoreI3.resetValues(1, 2, "erhgeyuge", 2167, "Petro", 1488, 2, 47, "No doubt", 13);
        System.out.println(intelCoreI3);
        renesasIcon12.printWorkingHours();
        Microcontroller.printStaticWorkingHours();
    }
}
