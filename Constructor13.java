class Human{
    private int age;
    private String name;

    public Human(){
        System.out.println("In default constructor block : ");
        age = 21;
        name = "Rajan";
    }
    public Human(int age, String name){
        System.out.println("In parameterized constructor block: ");
        this.name = name;
        this.age = age;
    }

    public void setter(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void getter(){
        System.out.println("Age is : "+ age);
        System.out.println("Name is : "+ name);
    }
}



class Constructor13{
    public static void main(String[] args){
        Human obj1 = new Human();
        //System.out.println(obj1.name +  obj1.age);
        Human obj2 = new Human(17, "Shyam");
        //System.out.println(obj2.name +  obj2.age);
        obj1.getter();
        obj2.getter();

        //anonymous object
        new Human().getter();


        }
}