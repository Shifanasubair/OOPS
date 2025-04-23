import java.util.Scanner;
interface Student 
{
    int score = 100;
    void displayscore();
}
interface Sports
{
    int score = 70; 
    void displaysportscore();
}
class Result implements Student, Sports 
{
    public void displayscore() 
    {
        System.out.println("Academic Score: " + Student.score);
    }
    public void displaysportscore() 
    {
        System.out.println("Sports Score: " + Sports.score);
    }
}
public class Results 
{
    public static void main(String args[]) 
    {
        Result r = new Result();
        r.displayscore();
        r.displaysportscore();
    }
}

