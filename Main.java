

import factoryPattern.InfoInterviewFactory;
import factoryPattern.InfoInterview;
import factoryPattern.InterviewFactory;
import factoryPattern.Interview;
import factoryPattern.TeamInterview;
import factoryPattern.TeamInterviewFactory;
import factoryPattern.WhiteboardInterview;
import factoryPattern.WhiteboardInterviewFactory;
import factoryPattern.InterviewType; 
import strategyPattern.AdvancedScheduling;
import strategyPattern.BasicInterviewing;
import strategyPattern.BasicScheduling;
import strategyPattern.CandidateNotification;
import strategyPattern.InterviewingBehavior;
import strategyPattern.NoNotification;
import strategyPattern.NotifyingBehavior;
import strategyPattern.SchedulingBehavior;
import strategyPattern.TeamCoordination;
import strategyPattern.TeamingBehavior;



public class Main {
    public static void main(String[] args) {
        InterviewManager manager = new InterviewManager();
        manager.arrange("JHG", InterviewType.INFO);
        manager.arrange("LDM", InterviewType.WHITEBOARD);
        manager.arrange("PPK", InterviewType.TEAM);
    }
}

