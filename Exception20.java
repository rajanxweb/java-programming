class RajanException extends Exception{
    public RajanException(String string){
        super(string);
    }
}



public class Exception20 {
    public static void main(String[] args){
        int i=0; 
        int j=1;
        try{
            j = 18/i;
            if(i==0){
                throw new RajanException("Divide by 0 error.");
            }
        }
        catch(RajanException e){
            System.out.println("Something went wrong.." + e);
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
        // catch(Exception e ){
        //     System.out.println(e);
        // }
        System.out.println(j);

    }
}
