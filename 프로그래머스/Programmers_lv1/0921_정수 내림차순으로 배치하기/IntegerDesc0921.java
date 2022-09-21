
public class IntegerDesc0921 {
    String s="";
    public static void main(String[] args) {
        long n=118372;
        IntegerDesc0921 t=new IntegerDesc0921();
        Long.toString(n).chars().sorted().forEach(c -> t.s = Character.valueOf((char)c) + t.s);
        System.out.println(t.s);

        

        
    }
    
}
