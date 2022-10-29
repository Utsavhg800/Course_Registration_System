/**
 * Write a description of class Course here.
 *
 * @author (Utsav Basnet)
 * @version (a version number or a date)
 */
public class Course
{
    // Four attributes of Course Class
    private String courseID;
    private String courseName;
    private String courseLeader;
    private int duration;
   
    public Course(String CourseID, String CourseName, int Duration) // Using the paramaterized constructor 
    {
        // Using the  get method  
        this.courseID = CourseID;
        this.courseName = CourseName;
        this.duration = Duration;
        this.courseLeader = "";
    }
    // The each and every attribute having a corresponding accessor method 
    public String getcourseID()
    {
        return this.courseID;
    }
    public String getcourseName()
    {
        return this.courseName;
    }
    public int getduration()
    {
        return this.duration;
    } 
    public String getcourseLeader()
    {
        return this.courseLeader;
    }
    // Using the set method to  name the  course leader to new name by accepting the course leader as a parameter
    public void setcourseLeader(String courseLeader)
    {
        this.courseLeader = courseLeader;
    }
    // using the display method for expected results.
    public void display()
    {
        System.out.println("CourseID is: " +courseID);
        System.out.println("CourseName is: " +courseName);
        System.out.println( "duration is: " +duration);
        if(courseLeader=="")  // Using the conditional Statement
        {
            System.out.println("Enter the courseLeader name" + courseLeader );
        }
        else // Using the else stateent when condition is not accepted
        {
            System.out.println("The name of the course Leader is " +courseLeader);
            
        }
    }
}
