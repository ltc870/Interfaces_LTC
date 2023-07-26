public class Application {
  public static void main(String[] args) {

    Process process1 = new Process("12345", 1);
    Process process2 = new Process("09876", 5);

    int answer1 = process1.compareTo(process2);

    if (answer1 == 0) {
      System.out.println("process1 has an equal priority to process2");
    } else if (answer1 < 0) {
      System.out.println("process1 has a lesser priority than process2");
    } else {
      System.out.println("process1 has a greater priority than process2");
    }

    Task task1 = new Task("task1", 10, Task.Status.NOT_STARTED);
    Task task2 = new Task("task2", 2, Task.Status.IN_PROCESS);

    int answer2 = task1.compareTo(task2);

    if (answer2 == 0) {
      System.out.println("task1 has an equal priority to task2");
    } else if (answer2 < 0) {
      System.out.println("task1 has a lesser priority than task2");
    } else {
      System.out.println("task1 has a greater priority than task2");
    }
  }
}