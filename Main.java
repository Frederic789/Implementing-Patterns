

public class Main {
    public static void main(String[] args) {
        InterviewManager manager = new InterviewManager();
        manager.arrange("JHG", InterviewType.INFO);
        manager.arrange("LDM", InterviewType.WHITEBOARD);
        manager.arrange("PPK", InterviewType.TEAM);
    }
}

enum InterviewType {
    INFO, WHITEBOARD, TEAM
}