package interviewManagement;

import factoryPattern.InfoInterviewFactory;
import factoryPattern.WhiteboardInterviewFactory;
import factoryPattern.TeamInterviewFactory;
import factoryPattern.Interview;
import factoryPattern.InfoInterview;
import factoryPattern.WhiteboardInterview;
import factoryPattern.TeamInterview;
import factoryPattern.InterviewType;


public class InterviewManager {
    public Interview arrange(String candidateName, InterviewType interviewType) {
        Interview interview = null;
    
        switch (interviewType) {
            case INFO:
                interview = new InfoInterview();
                break;
            case WHITEBOARD:
                interview = new WhiteboardInterview();
                break;
            case TEAM:
                interview = new TeamInterview();
                break;
        }
        interview.displaySteps(); 
        return interview;
    }
}
