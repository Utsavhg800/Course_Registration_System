/**
 * Write a description of class AcademicCourse here.
 *
 * @author (Utsav Basnet)
 * @version (a version number or a date)
 */
public class AcademicCourse extends Course
{
    // Seven Attributes of AcademicCourse class
    private String Lecturername;
    private String Level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int NumberofAssessments;
    private boolean isRegistered;
    
    
    public AcademicCourse(String courseID, String courseName, int duration, String Level, String Credit, int NumberofAssessments) /*Using the 
     paramaterized constructor*/
    {
        super(courseID, courseName, duration); // Using the super class
        this.Lecturername="";
        this.StartingDate="";
        this.CompletionDate="";
        this.isRegistered = false;
        this.Level = Level;
        this.Credit = Credit;
        this.NumberofAssessments= NumberofAssessments;
        
    }
    // The each and every attribute having a corresponding accessor method 
    public String getLecturername()
    {
         return this.Lecturername;
    }
    public String getLevel()
    {
        return this.Level;
    }
    public String getCredit()
    {
        return this.Credit;
    }
    public String getStartingDate()
    {
        return this.StartingDate;
    }
    public String getCompletionDate()
    {
        return this.CompletionDate;
    }
    public int getNumberofAssessments()
    {
        return this.NumberofAssessments;
    }
    public boolean getisRegistered()
    {
        return this.isRegistered;
    }
     // Using the set method to  name the  Lecturer to new name by accepting the lecturer as a parameter and giving the new value to the Lecturername.
    public void setLecturername(String Lecturername)
    {
        this.Lecturername = Lecturername;
    }
    /*setting the  number of assessments of course by accepting the new number of assessments as a parameter and assigning the new value to the 
    the  number of assessments attribute*/

    public void setNumberofAssessments(int NumberofAssessments)
    {
        this.NumberofAssessments=NumberofAssessments;
    }
    // Registered Method holding four parameters
    public void setregisterAcademicCourse(
    String courseLeader, String Lecturername, String StartingDate, String CompletionDate)
    {
        if(isRegistered==true)// Using the conditional Statement
        {
            System.out.println("The course is already taken by the" +this.Lecturername+ "Starting from " +this.StartingDate+ "until "
            +this.CompletionDate);// The condition is accepted
            
        }
        else if(isRegistered==false) // Using the else if  statement when condition is not accepted
        {
            super.setcourseLeader(courseLeader);
            this.Lecturername= Lecturername;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            this.isRegistered = true;
            boolean courseremoved = false;   
            
        }
        
    }
    // using the display method for expected results.
     public void display()
    {
        super.display();
        if(isRegistered==true)
        {
            System.out.println("LecturerName = "+this.Lecturername);
            System.out.println("Level= "+this.Level);
            System.out.println("Credit= "+this.Credit);
            System.out.println("StartingDate= "+this.StartingDate);
            System.out.println("CompletionDate="+this.CompletionDate);
            System.out.println("NumberofAssessments="+this.NumberofAssessments);
        }
    }
     
    
}