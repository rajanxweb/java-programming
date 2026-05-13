enum Status{
    Running, Pending, Failed, Successful;
}



public class Enum18 {
    public static void main(String[] args){
        Status s = Status.Running;
        if(s == Status.Running){
            System.out.println("Process running...");
        }
        else{
            System.out.println("Process failed");
        }
    }
}
