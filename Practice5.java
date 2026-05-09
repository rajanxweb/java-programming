
class Calculator{
    public int sum(int a, int b){
        System.out.println("Adding values: ");
        return a+b;

    }
}




public class Practice5 {
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 4;

        Calculator calc = new Calculator();
        int sum_result = calc.sum(num1, num2);
        System.out.println("Addition is : "+ sum_result);

    }
}
