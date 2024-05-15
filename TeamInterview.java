

class TeamInterview implements Interview {
    public void displaySteps() {
        System.out.println("_____ PROCESS for candidate: PPK _________");
        new BasicScheduling().schedule(); // Modify this method to reflect two scheduling steps
        
        System.out.println("Schedule initial interview");
        
        System.out.println("Schedule followup interview");
        System.out.println("Facilitate team interview");
        System.out.println("Organize team review survey");
        System.out.println("No followup needed");
        System.out.println("_________________________________");
    }
}
