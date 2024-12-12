public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int daysTracked;
    private int activeDays;
    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.daysTracked = 0;
        this.activeDays = 0;
    }
    public void addDailySteps(int steps) {
        totalSteps += steps;
        daysTracked++;
        if (steps >= minSteps) {
            activeDays++;
        }
    }
    public int activeDays() {
        return activeDays;
    }
    public double averageSteps() {
        if (daysTracked == 0) {
            return 0.0;
        }
        return (double) totalSteps / daysTracked;
    }
}