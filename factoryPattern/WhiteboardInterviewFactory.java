package factoryPattern;

public class WhiteboardInterviewFactory implements InterviewFactory {
    public Interview createInterview() {
        return new WhiteboardInterview();
    }
}