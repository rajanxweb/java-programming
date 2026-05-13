class Human{
    private int age;
    private String name;

    public void setter(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void getter(){
        System.out.println("Age is : "+ age);
        System.out.println("Name is : "+ name);
    }
}



class Encapsulation12{
    public static void main(String[] args){
        Human obj1 = new Human();
        obj1.setter(21, "Rajan");
        obj1.getter();
    }
}