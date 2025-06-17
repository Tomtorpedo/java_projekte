public class Main {
    public static void main(String[] args) {
        double[] randomNumbers = new double[100];
        for(int i =0; i<100;i++) {
            randomNumbers[i]=Math.random();
        }
        double summeFor = 0;
        for (int i=0; i<100;i++) {
            summeFor+=randomNumbers[i];
        }
        System.out.print("1:"+summeFor/100+"\n");

        double summeForEach = 0;
        for(double zahl : randomNumbers) {
            summeForEach+=zahl;
        }
        System.out.print("2:"+summeForEach/100);
    }
}