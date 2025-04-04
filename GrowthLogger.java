import java.util.Scanner;
class Growthlogger {
    private double initialHeight;
    Growthlogger(double initialHeight)
    {
        this.initialHeight=initialHeight;
    }
    class PlantGrowth{
        double[] logGrowth(int days, double dailyGrowth){
            double[] logs = new double[days];
            for(int i = 0; i<days;i++){
                initialHeight += dailyGrowth;
                logs[i] = initialHeight;
            }
            return logs;
        }
    }
    double[] startMonitoring(int days, double dailyGrowth){
        
    }
}
