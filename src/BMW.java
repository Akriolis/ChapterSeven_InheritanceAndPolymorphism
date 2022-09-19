public class BMW extends Car{


    @Override
    public void run(){
        isRunning = true;
        System.out.println("BMW is running");
    }

    public int gasConsumption(int a, int b){
        int v = a * b;
        return v;
    }

    public double gasConsumption(double a, double b){
        double v = a * b;
        return v;
    }
}
