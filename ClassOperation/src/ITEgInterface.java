public class ITEgInterface {
    public static void main(String[] args) {
        IT i=new IT();
        i.AssignedTask();
        i.codeTask();
    }
}
interface Work{
    void AssignedTask();
}
interface Task{
    void codeTask();
}
class IT implements Work,Task{
    @Override
    public void AssignedTask() {
        System.out.println("Task is assigned");
    }

    @Override
    public void codeTask() {
        System.out.println("Code task is assigned");
    }
}
