package factoryPattern;

class WhiteboardInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: LDM _________");
        new AdvancedScheduling().schedule(); // Modify this method to output two scheduling steps
        
        System.out.println("Schedule initial interview");
        System.out.println("Schedule followup interview");
        System.out.println("Review presentation at the whiteboard");
        System.out.println("Collect manager and skip-level reviews");
        System.out.println("inform the candidate of hiring decision");
        new CandidateNotification().notifyCandidate();
        System.out.println("_________________________________");
    }
}
