package interviewManagement;

import factoryPattern.InfoInterviewFactory;
import factoryPattern.InterviewFactory;
import factoryPattern.TeamInterviewFactory;
import factoryPattern.WhiteboardInterviewFactory;
import factoryPattern.Interview;
import factoryPattern.InterviewType;


class InterviewManager {
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
        interview.displaySteps(); // Make sure this is the only place where steps are displayed.
        return interview;
    }
}
