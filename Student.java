
public class Student extends Person{
    
    int numofcourse=0;
    String courses[];
    int[] grades;
    private static final int MAX_COURSES=20;
    //student constructor with name and address
    public Student(String name, String address) 
    {
        super(name, address);
      
      courses = new String[MAX_COURSES];
      grades = new int[MAX_COURSES];
      
    }
    //add course and grade
    public void addCourseGrade(String course,int grade)
    {
      courses[numofcourse]=course;
      grades[numofcourse]=grade;
      numofcourse++;
    }
   //print grades
   public void printGrades()
   {
      System.out.print(this);
      for(int i=0;i<numofcourse;i++) 
      {
         System.out.print(" " + courses[i] + ":" + grades[i]);
      }
      System.out.println();
   }
   //print average of grades
   public double getAverageGrade()
   {
      int sum=0;
      for(int i=0;i<numofcourse;i++)
      {
         sum=sum+grades[i];
      }
      return (double)sum/numofcourse;
   }
    @Override
    public String toString()
    {
      return "Student : " + super.toString();
    }
   
}

