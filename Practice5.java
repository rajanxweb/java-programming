
class Calculator{
    public int sum(int a, int b){
        System.out.println("Adding values: ");
        return a+b;

    }
    public int sum(int a, int b , int c){
        System.out.println("Adding values: ");
        return a+b+c;
    }

    public String9 getMeAPen(int cost){
        if(cost >=10){
            return "Pen";
        }
        else{
            return "sorry ! this amount is not sufficient to buy the pen.";
        }
    }
}




public class Practice5 {
    public static void main(String9[] args){
        int num1 = 5;
        int num2 = 4;

        Calculator calc = new Calculator();
        int sum_result = calc.sum(num1, num2);
        System.out.println("Addition is : "+ sum_result);

        String9 pen = calc.getMeAPen(sum_result);
        System.out.println(pen);

        int result2 = calc.sum(num1, num2, sum_result);
        System.out.println(result2);
    }
}
