package factoryPattern;



class InfoInterviewFactory implements InterviewFactory {
    public Interview createInterview() {
        return new InfoInterview();
    }
}

