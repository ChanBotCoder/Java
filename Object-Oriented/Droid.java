public class Droid{
  int batteryLevel;
  String name;
  
  public void performTask(String Task){
    System.out.println(name + " is performing task: " + Task);
    batteryLevel -= 10;
  }
  public String toString(){
    return "Hello, I'm the droid: "+ name;
  }
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("Eatting");

  }
}
