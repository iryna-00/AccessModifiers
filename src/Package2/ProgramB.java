package Package2;
import Package1.Class;

public class ProgramB {

    int i = 0;

    public static void main(String[] args) {
        Class obj = new Class();


        //System.out.println(obj.day); //NOT accessible because its located in the DIFFERENT package;
        System.out.println(obj.week); // accessible from everywhere
        //System.out.println(obj.month); //NOT accessible because its located in the DIFFERENT package;

        //System.out.println(obj.year); - not accessible since variable is private

        System.out.println(obj.printWeek()); //accessible from everywhere
    }
}
