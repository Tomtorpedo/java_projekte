public class Main {
    public static void main(String[] args) {
        double[] randomNumbers = new double[100];
        for(int i =0; i<randomNumbers.length;i++) {
            randomNumbers[i]=Math.random();
        }
        double summeFor = 0;
        for (int i=0; i<randomNumbers.length;i++) {
            summeFor+=randomNumbers[i];
        }
        System.out.print("1:"+summeFor/randomNumbers.length+"\n");

        double summeForEach = 0;
        for(double zahl : randomNumbers) {
            summeForEach+=zahl;
        }
        System.out.print("2:"+summeForEach/randomNumbers.length);
    }
}