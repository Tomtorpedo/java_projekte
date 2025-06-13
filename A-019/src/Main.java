//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int month = 2;
        boolean isLeapYear = true;
        switch (month){
            case 1:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 2:
                if (isLeapYear){
                    System.out.println("Der monat hat"+" 29 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                }
                else{
                    System.out.println("Der monat hat"+" 28 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                }
                break;
            case 3:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 4:
                System.out.println("Der monat hat"+" 30 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 5:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 6:
                System.out.println("Der monat hat"+" 30 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 7:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 8:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 9:
                System.out.println("Der monat hat "+" 30 "+" tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 10:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 11:
                System.out.println("Der monat hat"+" 30 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
            case 12:
                System.out.println("Der monat hat"+" 31 "+"tage\n"+"ist ein Schaltjahr:"+isLeapYear);
                break;
        }
    }
}