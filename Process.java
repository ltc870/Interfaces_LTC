public class Process implements Priority, Comparable<Process> {

  private String processID;
  private int priority;

  public Process() {
    processID = "";
    priority = 0;
  }

  public Process(String processID, int priority) {
    this.processID = processID;
    setPriority(priority);
  }

  public String getProcessID() {
    return processID;
  }

  public void setProcessID(String processID) {
    this.processID = processID;
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

  @Override
  public int compareTo(Process secondProcess) {
    return Integer.compare(this.getPriority(), secondProcess.getPriority());
  }

  @Override
  public String toString() {
    return "Process [processID=" + processID + ", priority=" + priority + "]";
  }
}
