public class Assignment {
    public int tasks;
    public String difficulty ;
    public boolean submission;
    public void printDetails(){
        System.out.println( "Number of tasks: "+tasks +"\nDifficulty level: "+ difficulty + "\nSubmission required: "+ submission);
    }
    public void makeOptional(){
        if (submission) {
            System.out.println( "Assignment will not require submission");
        }
        else {
            System.out.println("Submission is already not required");
        }
    }
}
