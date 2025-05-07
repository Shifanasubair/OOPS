import java.util.Deque;
import java.util.LinkedList;

class DequeManager
 {
    private Deque<String> deque;
    public DequeManager() 
    {
        deque = new LinkedList<>();
    }
    public void addToRight(String value) 
    {
        deque.addLast(value);
        System.out.println("Added \"" + value + "\" to the right: " + deque);
    }
    public void addToLeft(String value) 
    {
        deque.addFirst(value);
        System.out.println("Added \"" + value + "\" to the left: " + deque);
    }
    public void removeFromRight() 
    {
        if (!deque.isEmpty()) 
        {
            String removed = deque.removeLast();
            System.out.println("Removed \"" + removed + "\" from the right: " + deque);
        } 
        else 
        {
            System.out.println("Deque is empty. Cannot remove from right.");
        }
    }
    public void removeFromLeft() 
    {
        if (!deque.isEmpty())
         {
            String removed = deque.removeFirst();
            System.out.println("Removed \"" + removed + "\" from the left: " + deque);
        } 
        else
         {
            System.out.println("Deque is empty. Cannot remove from left.");
        }
    }
    public void displayDeque()
     {
        System.out.println("Current Deque: " + deque);
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        DequeManager dqManager = new DequeManager();

        dqManager.addToRight("apple");
        dqManager.addToRight("banana");
        dqManager.addToLeft("kiwi");

        dqManager.displayDeque();

        dqManager.removeFromRight();
        dqManager.removeFromLeft();

        dqManager.displayDeque();
    }
}

