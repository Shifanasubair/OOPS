import java.util.Scanner;
interface Student 
{
    void showAcademicScore();
}
interface Sports 
{
    void showSportsScore();
}
class Result implements Student, Sports 
{
    private int academicScore;
    private int sportsScore;
    public Result(int academicScore, int sportsScore) 
    {
        this.academicScore = academicScore;
        this.sportsScore = sportsScore;
    }
    public void showAcademicScore() 
    {
        System.out.println("Academic Score: " + academicScore);
    }
    public void showSportsScore()
    {
        System.out.println("Sports Score: " + sportsScore);
    }
    public void displayResult()
    {
        showAcademicScore();
        showSportsScore();
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Academic Score: ");
        int academicScore = scanner.nextInt();
        System.out.print("Enter the Sports Score: ");
        int sportsScore = scanner.nextInt();
        Result studentResult = new Result(academicScore, sportsScore);
        System.out.println("\nDisplaying Student Result:");
        studentResult.displayResult();
        scanner.close();
    }
}

