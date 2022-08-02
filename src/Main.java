import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Queue<ToDo> toDoQueue = new PriorityQueue();

        toDoQueue.add(new ToDo(Importance.MEDIUM, 1 , "Wash dishes"));
        toDoQueue.add(new ToDo(Importance.LOW, 1, "Take the trash out"));
        toDoQueue.add(new ToDo(Importance.HIGH, 2, "Finish homework"));
        toDoQueue.add(new ToDo(Importance.HIGH, 1, "Feed the dog"));
        toDoQueue.add(new ToDo(Importance.LOW, 3, "Call the hair salon"));
        toDoQueue.add(new ToDo(Importance.HIGH, 2, "Pay bills"));
        toDoQueue.add(new ToDo(Importance.MEDIUM, 2, "Pay other bills"));

        while (!toDoQueue.isEmpty()){
            System.out.println(toDoQueue.poll());
        }
    }
}