public class Task implements Priority, Comparable<Task> {

  public enum Status {
    NOT_STARTED, IN_PROCESS, COMPLETED
  }

  private String name;
  private int priority;
  private Status status;

  public Task() {
    name = "";
    priority = 0;
    status = Status.NOT_STARTED;
  }

  public Task(String name, int priority, Status status) {
    this.name = name;
    setPriority(priority);
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int getPriority() {
    // TODO Auto-generated method stub
    return priority;
  }

  @Override
  public void setPriority(int priority) {
    // TODO Auto-generated method stub
    if (priority < Priority.MIN_PRIORITY) {
      this.priority = MIN_PRIORITY;
    } else if (priority > Priority.MAX_PRIORITY) {
      this.priority = MAX_PRIORITY;
    } else if (priority == Priority.MED_PRIORITY) {
      this.priority = MED_PRIORITY;
    } else {
      this.priority = priority;
    }
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public int compareTo(Task secondTask) {
    return Integer.compare(this.getPriority(), secondTask.getPriority());
  }

  @Override
  public String toString() {
    return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
  }
}
