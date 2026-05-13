public class StringBufferAndBuilder10 {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Rajan ");
        System.out.println(sb.capacity());
        sb.append("Yadav");
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(0,"Java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb);
        
    }
}
