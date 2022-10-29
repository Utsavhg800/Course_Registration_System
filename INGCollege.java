
/**
 * Write a description of class INGCollege here.
 *
 * @author (Utsav Basnet)
 * @version (a version number or a date)
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;


public class INGCollege implements ActionListener
{
/** Declaring Instance variables for different Jcomponents,
 * different data types and objects 
 */
private JFrame frame_academic, frame_nonacademic;

private JPanel panel_first, panel_second, panel_third,  panel_fourth; 

private JLabel title_academic,label_courseid, label_coursename,label_duration, label_level,label_credit,
label_numberofassessments, label_courseleader, label_lecturername, label_startingdate,label_completiondate;

private JLabel title_nonacademic,label_courseid2 , label_coursename2, label_duration2,label_prerequisite; 
private JLabel label_courseleader2,label_instructorname, label_startingdate2,label_completiondate2,label_examdate;

private JTextField field_courseid,field_coursename,field_duration,field_level,field_credit,field_numberofassessments;
private JTextField field_courseleader, field_lecturername;

private JTextField field_courseid2,field_coursename2,field_duration2,field_prerequisite;
private JTextField field_courseleader2,field_instructorname;


private JComboBox box_startingdateyear, box_startingdatemonth,  box_startingdateday,  box_completiondateyear,
box_completiondatemonth,  box_completiondateday;
private JComboBox box_startingdateyear2, box_startingdatemonth2, box_staringdateday2, box_completiondateyear2,
box_completiondatemonth2, box_completiondateday2, box_examdateyear, box_examdatemonth,box_examdateday;


private JButton buttonregister_academiccourse, button_display,button_clear, buttonadd_academiccourse,
button_registernonacademiccourse, button_displaynonacademic, button_clearnonacademiccourse, button_switchto,
button_switchagainto, buttonadd_nonacademiccourse,buttonremove_nonacademiccourse;


private String academiccourseid, academiccoursename, academiccourseduration, academiccourselevel,academiccoursecredit;
private String academiccoursenumberofassessments, nonacademiccourseid2, nonacademiccoursename2,
nonacademiccourseduration2, nonacademiccourseprerequisite,regiser_academicid, register_academiccourseleader,
register_academiclecturername, academic_startregister, academic_completeregister, nonacademic_completeregister,
nonacademic_startregister,register_nonacademicid,register_nonacademiccourseleader,register_nonRegisterInstructor,
nonacademic_examregister;

private int a_coursenumberofassessments, academiccourse_credit, a_courseduration, n_academiccourseduration2;

private AcademicCourse fs, h;

private NonAcademicCourse NA, n, RNA;
            

// Making the object of INGCollege and declaring as a static variable
public static INGCollege ing=new INGCollege();
    
// Making Static Object
public static AcademicCourse object_AcademicCourse;
public static NonAcademicCourse object_NonAcademicCourse;
    
// Adding ArrayList
public ArrayList<Course>arr_list=new ArrayList <Course>();

// Creating a method for Academic Course
public void CreateAcademicCourse(){
    // For the first JFrame Academic Course
        
        frame_academic=new JFrame();
        frame_academic.setTitle("Academic Course");
        
        
        // For the first JPanel Add Academic Course
        panel_first=new JPanel();
        panel_first.setLayout(null);
        panel_first.setBounds(40,175,380,350);
        
        Color c1=new Color(149, 215, 230);
        panel_first.setBackground(c1);
        
        
        // JLabel title Academic Course
        title_academic=new JLabel();
        title_academic.setText("Academic Course");
        title_academic.setBounds(295,45,300,50);
        
        // Font1 for title_academic
        Font f1=new Font("Serif",Font.BOLD,35);
        title_academic.setFont(f1);
        frame_academic.add(title_academic);
        
        // JLabel for Course ID
        label_courseid=new JLabel();
        label_courseid.setText("Course ID: ");
        label_courseid.setBounds(20,25,90,20);
        
        // Font 2 for label_courseid
        Font f2=new Font("Ariel",Font.PLAIN,16);
        label_courseid.setFont(f2);
        panel_first.add(label_courseid);
        
        // JTextField for Course ID
        field_courseid=new JTextField();
        field_courseid.setBounds(155,22,200,30);
        panel_first.add(field_courseid);
        
        // JLabel for Course Name
        label_coursename=new JLabel();
        label_coursename.setText("Course Name: ");
        label_coursename.setBounds(20,70,108,20);
        
        // Font 3 for label_coursename
        Font f3=new Font("Ariel",Font.PLAIN,16);
        label_coursename.setFont(f3);
        panel_first.add(label_coursename);
        
        // JTextField for Course Name
        field_coursename=new JTextField();
        field_coursename.setBounds(155,70,200,30);
        panel_first.add(field_coursename);
        
        // JLabel for Duration
        label_duration=new JLabel();
        label_duration.setText("Duration: ");
        label_duration.setBounds(20,115,100,20);
        
        // Font 4 for Duration
        Font f4=new Font("Ariel",Font.PLAIN,16);
        label_duration.setFont(f4);
        panel_first.add(label_duration);
        
        // JTextField Duration
        field_duration=new JTextField();
        field_duration.setBounds(155,110,200,30);
        panel_first.add(field_duration);
        
        
        // JLabel for Level
        label_level=new JLabel();
        label_level.setText("Level: ");
        label_level.setBounds(20,160,90,20);
        
        // Font 5 for Level
        Font f5=new Font("Ariel",Font.PLAIN,16);
        label_level.setFont(f5);
        panel_first.add(label_level);
        
        // JTextField Level
        field_level=new JTextField();
        field_level.setBounds(155,150,200,30);
        panel_first.add(field_level);
        
        // JLabel Credit
        label_credit=new JLabel();
        label_credit.setText("Credit: ");
        label_credit.setBounds(20,205,90,20);
        
        // Font 6 for Credit
        Font f6=new Font("Ariel",Font.PLAIN,16);
        label_credit.setFont(f6);
        panel_first.add(label_credit);
        
        // JTextField for Credit
        field_credit=new JTextField();
        field_credit.setBounds(155,195,200,30);
        panel_first.add(field_credit);
        
        // JLabel Number of Assessments
        label_numberofassessments=new JLabel();
        label_numberofassessments.setText("Number of Assesments: ");
        label_numberofassessments.setBounds(20,252,175,20);
        
        // Font f7 for Number of Assessments
        Font f7=new Font("Ariel",Font.PLAIN,16);
        label_numberofassessments.setFont(f7);
        panel_first.add(label_numberofassessments);
        
        // JTextField for Number of Assessments
        field_numberofassessments=new JTextField();
        field_numberofassessments.setBounds(200,250,120,30);
        panel_first.add(field_numberofassessments);
        
        // JButton for Adding course for Academic Course
        buttonadd_academiccourse=new JButton();
        buttonadd_academiccourse.setText("Add Course for Academic Course");
        buttonadd_academiccourse.setBounds(20,310,335,28);
        
        // Font f8 for Adding course for Academic Course
        Font f8=new Font("Serif",Font.PLAIN,16);
        buttonadd_academiccourse.setFont(f8);
        buttonadd_academiccourse.addActionListener(this);
        panel_first.add(buttonadd_academiccourse);
        
        
        // JButton for switching from Academic Course to Non-Academic Course
        button_switchto=new JButton();
        button_switchto.setText("Switch to  Non-Academic Course>>|");
        button_switchto.setBounds(470,180,335,28);
        
        // Font f9 for switching from Academic Course to Non-Academic Course
        Font f9=new Font("Serif",Font.PLAIN,16);
        button_switchto.setFont(f9);
        button_switchto.addActionListener(this);
        frame_academic.add(button_switchto);
        
        // For the second JPanel Register Academic Course
        panel_second= new JPanel();
        panel_second.setLayout(null);
        panel_second.setBounds(470,225,380,295);
        
        Color c2=new Color(247, 247, 247);
        panel_second.setBackground(c2);
        
        // JLabel for Course Leader
        label_courseleader=new JLabel();
        label_courseleader.setText("Course Leader: ");
        label_courseleader.setBounds(20,25,115,20);
        
        // Font 10 for Course Leader
        Font f10=new Font("Ariel",Font.PLAIN,16);
        label_courseleader.setFont(f10);
        panel_second.add(label_courseleader);
        
        // JTextField for Course Leader
        field_courseleader=new JTextField();
        field_courseleader.setBounds(155,25,200,30);
        panel_second.add(field_courseleader);
        
        // JLabel for Lecturer Name
        label_lecturername=new JLabel();
        label_lecturername.setText("Lecturer Name: ");
        label_lecturername.setBounds(20,70,120,20);
        
        // Font f11 for Lecturer Name
        Font f11=new Font("Ariel",Font.PLAIN,16);
        label_lecturername.setFont(f11);
        panel_second.add(label_lecturername);
        
        // JTextField for Lecuter Name
        field_lecturername=new JTextField();
        field_lecturername.setBounds(155,70,200,30);
        panel_second.add(field_lecturername);
        
        // JLabel for Starting Date
        label_startingdate=new JLabel();
        label_startingdate.setText("Starting Date: ");
        label_startingdate.setBounds(20,115,110,20);
        
        // Font 12 for Starting Date
        Font f12=new Font("Ariel",Font.PLAIN,16);
        label_startingdate.setFont(f12);
        panel_second.add(label_startingdate);
        
        // JCombo Box Year for Starting Date
        String[]year={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
        "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        box_startingdateyear=new JComboBox(year);
        box_startingdateyear.setBounds(155,115,60,23);
        panel_second.add(box_startingdateyear);
        
        //JCombo Box  Month for Starting Date
        String[]months={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        box_startingdatemonth=new JComboBox(months);
        box_startingdatemonth.setBounds(220,115,90,23);
        panel_second.add(box_startingdatemonth);
        
        // JCombo Box Days for Starting Date
        String[]days= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        box_startingdateday=new JComboBox(days);
        box_startingdateday.setBounds(315,115,40,23);
        panel_second.add(box_startingdateday);
        
        // JLabel for Completion Date
        label_completiondate=new JLabel();
        label_completiondate.setText("Completion Date: ");
        label_completiondate.setBounds(20,160,130,20);
        
        // Font 13 for Completion Date
        Font f13=new Font("Ariel",Font.PLAIN,16);
        label_completiondate.setFont(f13);
        panel_second.add(label_completiondate);
                
        // JCombo Box Year for Completion Date 
        String[]year_2={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
        "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        box_completiondateyear=new JComboBox(year_2);
        box_completiondateyear.setBounds(155,160,60,23);
        panel_second.add(box_completiondateyear);
        
        //JCombo Box  Month for Completion Date
        String[]months_2={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        box_completiondatemonth=new JComboBox(months_2);
        box_completiondatemonth.setBounds(220,160,90,23);
        panel_second.add(box_completiondatemonth);
        
        // // JCombo Box Days for Completion Date
        String[]days_2= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        box_completiondateday=new JComboBox(days_2);
        box_completiondateday.setBounds(315,160,40,23);
        panel_second.add(box_completiondateday);
        
        // JButton for  for registering Academic Course
        buttonregister_academiccourse=new JButton();
        buttonregister_academiccourse.setText("Register Academic Course");
        buttonregister_academiccourse.setBounds(20,220,335,28);
        
        // Font f14 for button registering Academic Course
        Font f14=new Font("Serif",Font.PLAIN,16);
        buttonregister_academiccourse.setFont(f14);
        buttonregister_academiccourse.addActionListener(this);
        panel_second.add(buttonregister_academiccourse);
        
        // JButton used for Displaying Academic Course
        button_display=new JButton();
        button_display.setText("Display");
        button_display.setBounds(280,570,140,34);
        button_display.setBackground(new Color(45, 133, 68));
        button_display.setForeground(new Color(250,250,250));
        
        // Font 15 for button display
        Font f15=new Font("Comic Sans",Font.PLAIN,18);
        button_display.setFont(f15);
        button_display.addActionListener(this);
        frame_academic.add(button_display);
        
        // JButton used for Clearing Academic Course Text Field
        button_clear=new JButton();
        button_clear.setText("Clear");
        button_clear.setBounds(470,570,140,34);
        button_clear.setBackground(new Color(247, 25, 25));
        button_clear.setForeground(new Color(250,250,250));
        
        // Font 16 for button clear
        Font f16=new Font("Comic Sans",Font.PLAIN,18);
        button_clear.setFont(f16);
        button_clear.addActionListener(this);
        frame_academic.add(button_clear);
        
        frame_academic.setLayout(null);
        frame_academic.setResizable(false);
        frame_academic.setBounds(150,40,900,690);
        frame_academic.setVisible(true);
        frame_academic.add(panel_first);
        frame_academic.add(panel_second);
    }
        
    // Making a method for Non Academic Course
public  void CreateNonAcademicCourse(){
        
        // For the second JFrame Non Academic Course
        frame_nonacademic=new JFrame();
        frame_nonacademic.setTitle("Non Academic Course");
        
        // For JPanel third
        panel_third=new JPanel();
        panel_third.setLayout(null);
        panel_third.setBounds(40,200,380,270);
        
        Color c3=new Color(149,215,230);
        panel_third.setBackground(c3);
        
        // JLabel title2 Non Academic Course
        title_nonacademic=new JLabel();
        title_nonacademic.setText("Non Academic Course");
        title_nonacademic.setBounds(295,45,340,50);
        
        // Font 17 for title_nonacademic
        Font f17=new Font("Serif",Font.BOLD,35);
        title_nonacademic.setFont(f17);
        frame_nonacademic.add(title_nonacademic);
        
        // JLabel Course ID for Add Non Academic Course
        label_courseid2=new JLabel();
        label_courseid2.setText("Course ID:");
        label_courseid2.setBounds(20,25,90,20);
        
        // Font 18 for label_courseid2
        Font f18=new Font("Ariel",Font.PLAIN,16);
        label_courseid2.setFont(f18);
        panel_third.add(label_courseid2);
        
        // JText Field for label_courseid2
        field_courseid2=new JTextField();
        field_courseid2.setBounds(155,22,200,30);
        panel_third.add(field_courseid2);
        
        // JLabel Course Name for Non Academic Course
        label_coursename2=new JLabel();
        label_coursename2.setText("Course Name: ");
        label_coursename2.setBounds(20,70,108,20);
        
        // Font 19 for label_coursename2
        Font f19=new Font("Ariel",Font.PLAIN,16);
        label_coursename2.setFont(f19);
        panel_third.add(label_coursename2);
        
        // JTextField for label_coursename2
        field_coursename2=new JTextField();
        field_coursename2.setBounds(155,70,200,30);
        panel_third.add(field_coursename2);
        
        // JLabel Duration for Non Academic Course
        label_duration2=new JLabel();
        label_duration2.setText("Duration: ");
        label_duration2.setBounds(20,115,100,20);
        
        // Font 20 for label_duration2
        Font f20=new Font("Ariel",Font.PLAIN,16);
        label_duration2.setFont(f20);
        panel_third.add(label_duration2);
        
        // JText Field for label_duration2
        field_duration2=new JTextField();
        field_duration2.setBounds(155,110,200,30);
        panel_third.add(field_duration2);
        
        // JLabel for prerequisite
        label_prerequisite=new JLabel();
        label_prerequisite.setText("Prerequisite: ");
        label_prerequisite.setBounds(20,160,100,20);
        
        // Font 21 for label_prerequisite
        Font f21=new Font("Ariel",Font.PLAIN,16);
        label_prerequisite.setFont(f21);
        panel_third.add(label_prerequisite);
        
        // JTextField for label_prereuisite
        field_prerequisite=new JTextField();
        field_prerequisite.setBounds(155,150,200,30);
        panel_third.add(field_prerequisite);
        
        // JButton for Add Course for Non-Academic Course
        buttonadd_nonacademiccourse=new JButton();
        buttonadd_nonacademiccourse.setText("Add Course for Non-Academic Course");
        buttonadd_nonacademiccourse.setBounds(20,220,335,28);
        
        
        // Font 22 for buttonadd_nonacademiccourse
        Font f22=new Font("Serif",Font.PLAIN,16);
        buttonadd_nonacademiccourse.setFont(f22);
        buttonadd_nonacademiccourse.addActionListener(this);
        panel_third.add(buttonadd_nonacademiccourse);
        
        // For the fourth Panel 
        panel_fourth=new JPanel();
        panel_fourth.setLayout(null);
        panel_fourth.setBounds(470,200,380,290);
        
        Color c4=new Color(247,247,247);
        panel_fourth.setBackground(c4);
        
        // JButton for switching from Non Academic Course to Academic Course
        button_switchagainto=new JButton();
        button_switchagainto.setText("Switch to Academic Course >>|");
        button_switchagainto.setBounds(475,150,335,28);
        
        // Font 24 for button_switchagainto
        Font f24=new Font("Serif",Font.PLAIN,16);
        button_switchagainto.setFont(f24);
        button_switchagainto.addActionListener(this);
        frame_nonacademic.add(button_switchagainto);

        
        // JLabel for Course Leader Non Academic Course
        label_courseleader2=new JLabel();
        label_courseleader2.setText("Course Leader: ");
        label_courseleader2.setBounds(20,25,115,20);
        
        // Font 25 for label_courseleader2
        Font f25=new Font("Ariel",Font.PLAIN,16);
        label_courseleader2.setFont(f25);
        panel_fourth.add(label_courseleader2);
        
        // JText Filed for label_courseleader2
        field_courseleader2=new JTextField();
        field_courseleader2.setBounds(155,25,200,30);
        panel_fourth.add(field_courseleader2);
        
        // JLabel for Instructor Name
        label_instructorname=new JLabel();
        label_instructorname.setText("Instructor Name: ");
        label_instructorname.setBounds(20,70,120,20);
        
        // Font 26 for label_instructorname
        Font f26=new Font("Ariel",Font.PLAIN,16);
        label_instructorname.setFont(f26);
        panel_fourth.add(label_instructorname);
        
        // JText Field for Instructor Name
        field_instructorname=new JTextField();
        field_instructorname.setBounds(155,70,200,30);
        panel_fourth.add(field_instructorname);
        
        // JLabel for Starting Date
        label_startingdate2=new JLabel();
        label_startingdate2.setText("Starting Date: ");
        label_startingdate2.setBounds(20,115,110,20);
        
        // Font 27 for label_startingdate2
        Font f27=new Font("Ariel",Font.PLAIN,16);
        label_startingdate2.setFont(f27);
        panel_fourth.add(label_startingdate2);
        
        // JCombo Box Year for Starting Date Non Academic Course
        String[]year_3={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
        "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        box_startingdateyear2=new JComboBox(year_3);
        box_startingdateyear2.setBounds(155,115,60,23);
        panel_fourth.add(box_startingdateyear2);
        
        //JCombo Box  Month for Starting Date Non Academic Course
        String[]months_3={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        box_startingdatemonth2=new JComboBox(months_3);
        box_startingdatemonth2.setBounds(220,115,90,23);
        panel_fourth.add(box_startingdatemonth2);
        
        // JCombo Box Days for Starting Date Non Academic Course
        String[]days_3= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        box_staringdateday2=new JComboBox(days_3);
        box_staringdateday2.setBounds(315,115,40,23);
        panel_fourth.add(box_staringdateday2);
        
        // JLabel for Completion Date Non Academic Course
        label_completiondate2=new JLabel();
        label_completiondate2.setText("Completion Date: ");
        label_completiondate2.setBounds(20,160,130,20);
        
        // Font 28 label_completiondate2
        Font f28=new Font("Ariel",Font.PLAIN,16);
        label_completiondate2.setFont(f28);
        panel_fourth.add(label_completiondate2);
        
        // JCombo Box Year for Completion Date Non Academic Course
        String[]year_4={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
        "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        box_completiondateyear2=new JComboBox(year_4);
        box_completiondateyear2.setBounds(155,160,60,23);
        panel_fourth.add(box_completiondateyear2);
        
        //JCombo Box  Month for Completion Date Non Academic Course
        String[]months_4={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        box_completiondatemonth2=new JComboBox(months_4);
        box_completiondatemonth2.setBounds(220,160,90,23);
        panel_fourth.add(box_completiondatemonth2);
        
        // // JCombo Box Days for Completion Date Non Academic Course
        String[]days_4= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        box_completiondateday2=new JComboBox(days_4);
        box_completiondateday2.setBounds(315,160,40,23);
        panel_fourth.add(box_completiondateday2);
        
        // JLabel for Exam Date
        label_examdate=new JLabel();
        label_examdate.setText("Exam Date: ");
        label_examdate.setBounds(20,205,110,20);
        
        // Font 29 label_examdate
        Font f29=new Font("Ariel",Font.PLAIN,16);
        label_examdate.setFont(f29);
        panel_fourth.add(label_examdate);
        
        // JCombo Box Year for Exam Date
        String[]year_5={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
        "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
        box_examdateyear=new JComboBox(year_5);
        box_examdateyear.setBounds(155,205,60,23);
        panel_fourth.add(box_examdateyear);
        
        //JCombo Box  Month for Exam Date
        String[]months_5={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        box_examdatemonth=new JComboBox(months_5);
        box_examdatemonth.setBounds(220,205,90,23);
        panel_fourth.add(box_examdatemonth);
        
        // JCombo Box Days for Exam Date
        String[]days_5= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18",
        "19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        box_examdateday=new JComboBox(days_5);
        box_examdateday.setBounds(315,205,40,23);
        panel_fourth.add(box_examdateday);
        
        // JButton for registering Non-Academic Course
        button_registernonacademiccourse=new JButton();
        button_registernonacademiccourse.setText("Register Non Academic Course");
        button_registernonacademiccourse.setBounds(20,250,335,28);
        
        // Font 30 for button_registernonacademiccourse
        Font f30=new Font("Serif",Font.PLAIN,16);
        button_registernonacademiccourse.setFont(f30);
        button_registernonacademiccourse.addActionListener(this);
        panel_fourth.add(button_registernonacademiccourse);
        
        
        // JButton for Remove Non-Academic Course
        buttonremove_nonacademiccourse=new JButton();
        buttonremove_nonacademiccourse.setText("Remove Non Academic Course");
        buttonremove_nonacademiccourse.setBounds(280,510,335,28);
        
        // Font 23 for buttonremove_nonacademiccourse
        Font f23=new Font("Serif",Font.PLAIN,16);
        buttonremove_nonacademiccourse.setFont(f23);
        buttonremove_nonacademiccourse.addActionListener(this);
        frame_nonacademic.add(buttonremove_nonacademiccourse);
        
        
        // JButton used for displaying non academic Course
        button_displaynonacademic=new JButton();
        button_displaynonacademic.setText("Display");
        button_displaynonacademic.setBounds(280,570,140,34);
        button_displaynonacademic.setBackground(new Color(45,133,68));
        button_displaynonacademic.setForeground(new Color(250,250,250));
        
        // Font 31 for button_displaynonacademic
        Font f31=new Font("Comic Sans",Font.PLAIN,18);
        button_displaynonacademic.setFont(f31);
        button_displaynonacademic.addActionListener(this);
        frame_nonacademic.add(button_displaynonacademic);
        
        // JButton used for clearing the text field of Non Academic Course
        button_clearnonacademiccourse=new JButton();
        button_clearnonacademiccourse.setText("Clear");
        button_clearnonacademiccourse.setBounds(470,570,140,34);
        button_clearnonacademiccourse.setBackground(new Color(247,25,25));
        button_clearnonacademiccourse.setForeground(new Color(250,250,250));
        
        // Font 32 for button_clearnonacademiccourse
        Font f32=new Font("Comic Sans",Font.PLAIN,18);
        button_clearnonacademiccourse.setFont(f32);
        button_clearnonacademiccourse.addActionListener(this);
        frame_nonacademic.add(button_clearnonacademiccourse);

        frame_nonacademic.setLayout(null);
        frame_nonacademic.setResizable(false);
        frame_nonacademic.setVisible(true);
        frame_nonacademic.setBounds(150,40,900,690);
        frame_nonacademic.add(panel_third);
        frame_nonacademic.add(panel_fourth);        
        
    }   
     // Using the object of the class and calling the AcademicCourse method in main method
public static void main(String[]args){
        ing.CreateAcademicCourse();
    }
    // Action Event Method
   public void actionPerformed(ActionEvent e)
    {
        // For switching to Non-Academic Course
if (e.getSource()==button_switchto)
{
    CreateNonAcademicCourse();
    }
    // For Switching again to Academic Course
    else if (e.getSource()==button_switchagainto)
    {
        CreateAcademicCourse(); 
    }
        // For Add Course for Academic Course
     else if (e.getSource()==buttonadd_academiccourse)
       {
        int a_coursenumberofassessments =0;
        int academiccourse_credit=0;
        int a_courseduration=0;
        try{
             academiccourseid = field_courseid.getText(); 
             academiccoursename = field_coursename.getText();
             academiccourseduration=field_duration.getText();
             academiccourselevel=field_level.getText();
             academiccoursecredit=field_credit.getText();
             academiccoursenumberofassessments=field_numberofassessments.getText();
    if (academiccourseid.isEmpty() || academiccoursename.isEmpty() ||  
              academiccourselevel.isEmpty() || academiccoursecredit.isEmpty() || academiccourseduration.isEmpty() ||
               academiccoursenumberofassessments.isEmpty())
         {
         throw new NullPointerException();
        }
        try{         
            a_courseduration=Integer.parseInt(academiccourseduration);      
            a_coursenumberofassessments  = Integer.parseInt(academiccoursenumberofassessments);  
            academiccourse_credit =Integer.parseInt(academiccoursecredit);  
            
            boolean DuplicatecourseID=false;
            for (Course var: arr_list)
             {
            if (var.getcourseID().equals(academiccourseid)){
                DuplicatecourseID=true;
                     break;
                    }
            }
            if (DuplicatecourseID==false){

             // Calling the constructor of AcademicCourse class
            object_AcademicCourse=new AcademicCourse(academiccourseid,academiccoursename,
            a_courseduration,academiccourselevel,academiccoursecredit,a_coursenumberofassessments);
             
             // Adding object to the ArrayList
            arr_list.add(object_AcademicCourse);
             
            JOptionPane.showMessageDialog(frame_academic,"Course is added. The no of course is: " + arr_list.size());
            }
            else
            {
            JOptionPane.showMessageDialog(null, "The courseID is already in the list.", "Error",
            JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e1){
          JOptionPane.showMessageDialog(null,"Input is invaild","Error",JOptionPane.ERROR_MESSAGE);
    }
    }catch(NullPointerException nexception)
    {
    JOptionPane.showMessageDialog(null,"The texfields are empty! Please fill the fields","Error",
    JOptionPane.ERROR_MESSAGE); 
    }
}

// For Add Course for Non Academic Course
        else if (e.getSource()==buttonadd_nonacademiccourse)
        {
          // intializing the variables as null
           int add_nonacademiccourseduration2=0;
          String nonacademiccourseid2="",nonacademiccoursename2="",nonacademiccourseprerequisite="";
            try{             
              nonacademiccourseid2= field_courseid2.getText();
             
             nonacademiccoursename2 = field_coursename2.getText();
             
             nonacademiccourseduration2=field_duration2.getText();
             
             nonacademiccourseprerequisite=field_prerequisite.getText();
             
      if  (nonacademiccourseid2.isEmpty() || nonacademiccoursename2.isEmpty() ||
            nonacademiccourseduration2.isEmpty() || nonacademiccourseprerequisite.isEmpty()){
                 throw new NullPointerException();
                }
         try{
            n_academiccourseduration2= Integer.parseInt(nonacademiccourseduration2);
                boolean DuplicateNoncourseID=false;
        for (Course var3: arr_list)
        {
        if (var3.getcourseID().equals(nonacademiccourseid2))
            {
        DuplicateNoncourseID=true;
         break;
            }
                }
                if( DuplicateNoncourseID==false)
                {
                    // Now Calling the Constructor of Non Academic Course class
                    
                object_NonAcademicCourse=new NonAcademicCourse(nonacademiccourseid2, nonacademiccoursename2,
                n_academiccourseduration2,nonacademiccourseprerequisite);
                
                // Adding the object in the ArrayList
                arr_list.add( object_NonAcademicCourse);
                
                JOptionPane.showMessageDialog(frame_nonacademic,"The Non Academic course is added" + arr_list.size());
            }
            
        else
            {
            JOptionPane.showMessageDialog(null, "The courseID is already in the list.", "Error",
               JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e1){
          JOptionPane.showMessageDialog(null,"Input is invaild","Error",JOptionPane.ERROR_MESSAGE);
    }
    }catch(NullPointerException nexception)
    {
    JOptionPane.showMessageDialog(null,"The texfields are empty! Please fill the fields","Error",
               JOptionPane.ERROR_MESSAGE); 
    }
}
  

       // Registration for Academic Course
  else if (e.getSource()==buttonregister_academiccourse){
            String regiser_academicid="",register_academiccourseleader="",register_academiclecturername="",
            academic_startregister="", academic_completeregister="";
            try{
            regiser_academicid=field_courseid.getText();
            register_academiccourseleader=field_courseleader.getText();
            register_academiclecturername=field_lecturername.getText();
            
            // For Staring Date
            String academic_staryear=(box_startingdateyear.getSelectedItem()).toString();
            String academic_startmonth=(box_startingdatemonth.getSelectedItem()).toString();
            String academic_startday=(box_startingdateday.getSelectedItem()).toString();
            academic_startregister= academic_staryear+ academic_startmonth+ academic_startday;
            
            // For Completion Date
            String academic_completeyear=(box_completiondateyear.getSelectedItem()).toString();
            String academic_completemonth=(box_completiondatemonth.getSelectedItem()).toString();
            String academic_completeday=(box_completiondateday.getSelectedItem()).toString();
            academic_completeregister=academic_completeyear+ academic_completemonth+ academic_completeday;
            
if(regiser_academicid.isEmpty() ||register_academiccourseleader.isEmpty() ||
      register_academiclecturername.isEmpty()||
   academic_startregister.isEmpty() || academic_completeregister.isEmpty())
            {
                throw new NullPointerException();
            }
          
            for (Course var2 :arr_list){
                if (var2.getcourseID().equals(regiser_academicid)){
                    if (var2 instanceof AcademicCourse){
                        fs=(AcademicCourse)var2;
        
                        // If the academic course is already registered
                 if (fs.getisRegistered()==true){
        JOptionPane.showMessageDialog(frame_academic,"Sorry the Lecturer name, Starting Date and CompletionDate has already been registered.");
                            
    }else{
        fs.setregisterAcademicCourse(register_academiccourseleader,register_academiclecturername,
         academic_startregister,academic_completeregister);
        JOptionPane.showMessageDialog(frame_academic,"It has been registered.");
        break;
    }
}
}

else{
    JOptionPane.showMessageDialog(frame_academic,"Not valid to Register");
}
  }
 }
    
            
            catch(NullPointerException nexception)
            {
JOptionPane.showMessageDialog(null,"The text are empty! Please fill all the fields","Error",JOptionPane.WARNING_MESSAGE);
}  
} 
            
        // Registration of Non Academic Course
  else if(e.getSource() == button_registernonacademiccourse)
        {
           String register_nonacademicid="",register_nonacademiccourseleader="", register_nonRegisterInstructor="",
            nonacademic_startregister,nonacademic_completeregister,nonacademic_examregister;
            try{
            register_nonacademicid = field_courseid2.getText();   
            register_nonacademiccourseleader=field_courseleader2.getText();
            register_nonRegisterInstructor= field_instructorname.getText();
               
            //For Starting Date
            String nonacademic_startyear = box_startingdateyear2.getSelectedItem().toString();
            String nonacademic_startmonth = box_startingdatemonth2.getSelectedItem().toString();
            String nonacademic_startday = box_staringdateday2.getSelectedItem().toString();
            nonacademic_startregister= nonacademic_startyear +  nonacademic_startmonth + nonacademic_startday;
               
            //For Completion Date
            String nonacademic_completeyear2 = box_completiondateyear2.getSelectedItem().toString();
            String nonacademic_completemonth2 = box_completiondatemonth2.getSelectedItem().toString();
            String nonacademic_completeday2 = box_completiondateday2.getSelectedItem().toString();
            nonacademic_completeregister = nonacademic_completeyear2 + nonacademic_completemonth2+ 
            nonacademic_completeday2;
               
               
            //For Exam date 
            String nonacademic_examyear2  = box_examdateyear.getSelectedItem().toString();
            String nonacademic_exammonth2 = box_examdatemonth.getSelectedItem().toString();
            String nonacademic_examdate2 = box_examdateday.getSelectedItem().toString();
            nonacademic_examregister= nonacademic_examyear2 + nonacademic_exammonth2+ nonacademic_examdate2;
               
if(register_nonacademicid.isEmpty() || register_nonacademiccourseleader.isEmpty() || 
register_nonRegisterInstructor.isEmpty() ||  nonacademic_startregister.isEmpty() || 
nonacademic_completeregister.isEmpty() || nonacademic_examregister.isEmpty())
    {
         throw new NullPointerException();
                }
     
        for(Course var5:arr_list)
         {
        if(var5.getcourseID().equals(register_nonacademicid))
         {
         if(var5 instanceof NonAcademicCourse)
            {
        NA= (NonAcademicCourse)var5;                   
        if(NA.getisRegistered() == true)
        {
        JOptionPane.showMessageDialog(null, "Sorry the Non Academic has already been registered.", "Error",JOptionPane.ERROR_MESSAGE);
        }else{
        NA.registerNonAcademicCourse(register_nonacademiccourseleader,
        register_nonRegisterInstructor,nonacademic_startregister,
        nonacademic_completeregister,nonacademic_completeregister);                         
        JOptionPane.showMessageDialog(frame_nonacademic,"Non Academic Course has been registered"+ arr_list.size());
        break;
        }
         }
        }
    else{
    JOptionPane.showMessageDialog(frame_nonacademic,"Not valid to Register");
}
}
}
   
            
 catch(NullPointerException nexception)
            {
JOptionPane.showMessageDialog(null,"The text are empty! Please fill all the fields","Error",JOptionPane.WARNING_MESSAGE);
}  
}

 // Remove Non Academic Course
    else if(e.getSource() == buttonremove_nonacademiccourse)
        {
     
    for(Course var8:arr_list)
     {
     if(var8 instanceof NonAcademicCourse)
     {
    RNA= (NonAcademicCourse)var8;                     
    if(RNA.getisRemoved()==false)
     {
     RNA.removeNonAcademicCourse();
     JOptionPane.showMessageDialog(frame_nonacademic,"Non Academic Course is sucessfully removed");
     break;
      }else if(RNA.getisRemoved()== true)
        {
     JOptionPane.showMessageDialog(frame_nonacademic,"Course is already removed");
       }
         }
          }
        
}

 // Display for Academic Course
else if (e.getSource()==button_display)
     {
         for (Course var6: arr_list)
         if (var6 instanceof AcademicCourse){
             h= (AcademicCourse)var6;
             h.display();
            }
        }
        // Display for Non Academic Course
        else if (e.getSource()==button_displaynonacademic)
     {
         for (Course var7: arr_list)
         if (var7 instanceof NonAcademicCourse){
              n= (NonAcademicCourse)var7;
             n.display();
      }
    }

                
     // For Clearing Add  Academic Course textfields
    else if (e.getSource() == button_clear) {
     field_courseid.setText("");
     field_lecturername.setText("");
     field_duration.setText("");
     field_level.setText("");
     field_credit.setText("");
     field_numberofassessments.setText("");
     
     //For Clearing Register  Academic Course textfield and ComboBox
     field_courseid.setText(""); 
     field_coursename.setText("");
     field_lecturername.setText("");
     box_startingdateyear.setSelectedIndex(0);
     box_startingdatemonth.setSelectedIndex(0);
     box_startingdateday.setSelectedIndex(0);
     box_completiondateyear.setSelectedIndex(0);
     box_completiondatemonth.setSelectedIndex(0);
     box_completiondateday.setSelectedIndex(0);
     
     JOptionPane.showMessageDialog(frame_academic, "The Academic Course has been cleared");
     
     }
// For Clearing Add Non Academic Course textfields
     else if(e.getSource()==button_clearnonacademiccourse){
    field_courseid2.setText("");
    field_coursename2.setText("");
    field_duration2.setText("");
    field_prerequisite.setText("");
    
    //For Clearing Register Non Academic Course textfield and ComboBox
    field_courseleader2.setText("");
    field_instructorname.setText("");
    
    box_startingdateyear2.setSelectedIndex(0);
    box_startingdatemonth2.setSelectedIndex(0);
    box_staringdateday2.setSelectedIndex(0);

    box_completiondateyear2.setSelectedIndex(0);
    box_completiondatemonth2.setSelectedIndex(0);
    box_completiondateday2.setSelectedIndex(0);

    box_examdateyear.setSelectedIndex(0);
    box_examdatemonth.setSelectedIndex(0);
    box_examdateday.setSelectedIndex(0);
    JOptionPane.showMessageDialog(frame_nonacademic, "The Non Academic Course has been cleared");
}
}
}


