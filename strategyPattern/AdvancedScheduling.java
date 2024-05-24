package strategyPattern;

public class AdvancedScheduling implements SchedulingBehavior {
    public void schedule() {
        System.out.println("Schedule initial interview");
        System.out.println("Schedule followup interview");
    }
}