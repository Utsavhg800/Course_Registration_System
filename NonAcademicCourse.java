 /**
 * Write a description of class NonAcademicCourse here.
 *
 * @author (Utsav Basnet)
 * @version (a version number or a date)
 */
public class NonAcademicCourse extends Course
{
    private String Instructorname;
    private int Duration;
    private String StartDate;
    private String CompletionDate;
    private String ExamDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    
    // Using the paramaterized constructor
    public NonAcademicCourse(String courseID, String courseName, int duration, String prerequisite)
    {
        super(courseID, courseName, duration);// using the super class
        this.prerequisite = prerequisite;
        this.StartDate = "";
        this.CompletionDate = "";
        this.ExamDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
        this.Duration=Duration;
    }
    // The each and every attribute having a corresponding accessor method 
    public String getInstructorname()
    {
        return this.Instructorname;
    }
    public int getDuration()
    {
        return this.Duration;
    }
     public String getStartDate()
    {
        return this.StartDate;
    }
    public String getCompletionDate()
    {
        return this.CompletionDate;
    }
    public String getExamDate()
    {
        return this.ExamDate;
    }
    public String getprerequisite()
    {
        return this.prerequisite;
    }
    public boolean getisRegistered()
    {
        return this.isRegistered;
    }
    public boolean getisRemoved()
    {
         return this.isRemoved;
    }
     //setting the instructor name which accepts a new instructor name as a parameter
    public void setInstructorname(String Instructorname)
    {
 
        if(isRegistered == false)
        {
            this.Instructorname = Instructorname;
        }
        else
        {
            System.out.println("Instructor name can not be changed because non-academic course is already registered");
        }
    }
     //The  registered method containing five parameters.
    public void registerNonAcademicCourse(
    String courseLeader, String Instructorname, String StartDate, String CompletionDate, String ExamDate)
    {
        if(isRegistered == false)
        {
            super.setcourseLeader(courseLeader);
            this.Instructorname = Instructorname ;
            this.StartDate = StartDate;
            this.CompletionDate = CompletionDate;
            this.ExamDate = ExamDate;
            this.isRegistered = true;
            
        }
        else if(isRegistered == true)
        {
            System.out.println("The course has already been registered");
            
        }
    }
    // using the remove Method to remove the stored data if the condition is true
    public void removeNonAcademicCourse()
    {
        if(isRemoved == true) 
        {
            System.out.println("The Non-Academic Course is already removed");
        }
        else if(isRemoved == false)
        {
            super.setcourseLeader("");
            StartDate="";
            Instructorname="";
            CompletionDate="";
            ExamDate="" ;
            isRegistered=false;
            isRemoved=true;
        }
    }
    // Using Display Method for the expected output.
    public void display()
    {
        super.display();
        
        if(isRegistered == true) 
        {
            System.out.println("InstructorName= "+this.Instructorname);
            System.out.println("StartDate= "+this.StartDate);
            System.out.println("CompletionDate= "+this.CompletionDate);
            System.out.println("ExamDate= "+this.ExamDate);
            System.out.println("The Prerequisite is " + this.prerequisite);
        }
    }
}