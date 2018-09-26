public class Grade
{
   //Fields
   private double exam1, exam2, finalExam, activityAvg, quizAvg, projectAvg;
   private String studentName;
   
   public static final int EXAM_1 = 1, EXAM_2 = 2, EXAM_3 = 3; 
   public static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
   
   public Grade(String studentNameIn)
   {
      studentName = studentNameIn;
   }
   
   public void setLabAverages(double activityAvgIn, double quizAvgIn)
   {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
   
   public void setProjAvg (double projectAvgIn)
   {
      projectAvg = projectAvgIn;
   }
   
   public void setExamScore(int examType, double examScoreIn)
   {
      if (examType == EXAM_1)
      {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2)
      {
         exam2 = examScoreIn;
      }
      else if (examType == EXAM_3)
      {
         finalExam = examScoreIn;
      }
   }
   
   public double calculateGrade()
   {
      double grade = exam1 * EXAM_WEIGHT + exam2 *EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      
      return grade;
   }
   
   public String toString()
   {
      return "Name " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
   
}