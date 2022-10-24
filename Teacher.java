
public class Teacher extends Person{
    
     private int numCourses;  
   private final String[] courses;
   private static final int MAX_COURSES=10;
  //Teacher Constructor with name and address
   public Teacher(String name, String address)
   {
      super(name, address);
      courses=new String[MAX_COURSES];
   }
  
   @Override
   public String toString() {
      return "Teacher: " + super.toString();
   }
   
   // add course
   public boolean addCourse(String course)
   {
      // Check if the course already exists
      for(int i=0;i<numCourses;i++)
      {
         if (courses[i].equals(course))
         {
           return false;  
         } 
      }
      courses[numCourses]=course;
      numCourses++;
      return true;
   }
   
   // remove course 
   public boolean removeCourse(String course)
   {
      boolean found=false;
      int index=-1;  
      for(int i=0;i<numCourses;i++)
      {
         if(courses[i].equals(course))
         {
            index = i;
            found = true;
            break;
         }
      }
      if(found)
      {
         //this will remove course and rearrange course array
         for(int i=index;i<numCourses-1;i++) {
            courses[i]=courses[i+1];
         }
         numCourses--;
         return true;
      }
      else 
      {
         return false;
      }
   }
}

