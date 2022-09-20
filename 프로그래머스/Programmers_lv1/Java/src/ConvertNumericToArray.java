public class ConvertNumericToArray {
    public static void main(String[] args) {
        int n=12345;
        String s =""+n; 
		 int[] answer = new int[s.length()];
     
        
        int cnt=0;
        while(n>0){
            answer[cnt]=(int)n%10;
            n/=10;
            cnt++;
        }
        System.out.println(answer);

    }
    
}
