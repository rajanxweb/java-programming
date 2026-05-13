interface Computer{
    abstract public void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile run..");
    }
}


public class Interface17 {
    public static void main(String[] args){
        Computer c = new Laptop();
        c.code();
    }
}
