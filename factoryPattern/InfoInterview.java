package factoryPattern;

class InfoInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: JHG _________");
        new BasicScheduling().schedule();
        System.out.println("Respond to interviewer's questions about profession");
        System.out.println("No review needed");
        System.out.println("No followup needed");
        System.out.println("_________________________________");
    }
}
