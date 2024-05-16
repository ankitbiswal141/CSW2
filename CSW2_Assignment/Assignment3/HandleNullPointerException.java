public class HandleNullPointerException{
    public static void main(String[]args){
    String str=null;
    try{
    int length=str.length();
    System.out.println("Lengthofstring:"+length);
    }catch(NullPointerException e){
    System.out.println("CaughtNullPointerException:"+e.getMessage());
    }
    }
    }