public class Main {
    public static void main(String[] args) {
        String input=null;
        while (input==null || input.length()<10) {
            input = javax.swing.JOptionPane.showInputDialog("Langer Text bitte:");
        }
        System.out.println("Eingabe ist "+input.length()+" Zeichen lang: "+input);
    }
}