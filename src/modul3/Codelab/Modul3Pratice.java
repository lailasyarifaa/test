package modul3.Codelab;

import java.util.Scanner;

public class Modul3Pratice {
        private double value;
        public void setValue(double value) {
            this.value = value;
        }
        public double getValue() {
            return value;
        }
        public static void main (String[] args){
            Scanner menu = new Scanner(System.in);
            System.out.println("Yard Conventer to m, cm, feet & miles");
            System.out.println("1. Yard to M");
            System.out.println("2. Yard to CM");
            System.out.println("3. Yard to Feet");
            System.out.println("4. Yard to Miles");
            System.out.print("Pilih menu : "); int a = menu.nextInt();
            switch (a){
                case 1:
                    Conventer input1 = new Conventer();
                    input1.setValueToM(input1.getValue());
                    break;
                case 2:
                    Conventer input2 = new Conventer();
                    input2.setValueToCM(input2.getValue());
                    break;
                case 3:
                    Conventer input3 = new Conventer();
                    input3.setValueToFeet(input3.getValue());
                    break;
                case 4:
                    Conventer input4 = new Conventer();
                    input4.setValueToMiles(input4.getValue());
                    break;
            }
        }
}
