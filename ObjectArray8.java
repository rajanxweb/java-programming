class Student{
    int rollno;
    String9 name;
    int marks;

}


public class ObjectArray8 {
    public static void main(String9[] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Satvik";
        s1.marks = 86;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Atvik";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Aarav";
        s3.marks = 79;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0; i<students.length; i++){
            System.out.print(students[i].rollno + " "+ students[i].name + " "+ students[i].marks);
            System.out.println();
        }

        for(Student stud: students){
            System.out.println(stud.rollno + " : "+ stud.name + " : "+ stud.marks);
        }


        
    }
}
