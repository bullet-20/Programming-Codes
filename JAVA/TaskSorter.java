import java.util.*;

public class TaskSorter {
  public static void main(String[] args) {
    // Create a list of tasks and their deadlines
    List<Task> tasks = new ArrayList<>();
    tasks.add(new Task("Task 1", 5));
    tasks.add(new Task("Task 2", 3));
    tasks.add(new Task("Task 3", 4));
    tasks.add(new Task("Task 4", 2));
    tasks.add(new Task("Task 5", 1));

    // Sort the list of tasks by their priority
    tasks.sort(new TaskPriorityComparator());

    // Display the sorted list of tasks
    for (Task task : tasks) {
      System.out.println(task.name + " (Priority: " + task.priority + ")");
    }
  }
}

class Task {
  String name;
  int priority;

  Task(String name, int priority) {
    this.name = name;
    this.priority = priority;
  }
}

class TaskPriorityComparator implements Comparator<Task> {
  @Override
  public int compare(Task t1, Task t2) {
    return t2.priority - t1.priority;
  }
}
