package factoryPattern;



public class InfoInterviewFactory implements InterviewFactory {
    public Interview createInterview() {
        return new InfoInterview();
    }
}

