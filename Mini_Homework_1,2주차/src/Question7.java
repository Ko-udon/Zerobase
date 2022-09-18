import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class Question7 {

    public static void announceLotto(int[] correctLotto){
        for(int i=0;i<6;i++){
            int tmp=new Random().nextInt(1,46);
            correctLotto[i]=tmp;
            for(int j=0; j<i; j++){ //로또 번호는 중복 불가능
                if(tmp == correctLotto[j]){
                    i--;
                }

            }
        }
        System.out.println("[로또 발표]");
        System.out.printf("   ");
        for(int n:correctLotto){
            if(n==correctLotto[5]){
                System.out.printf(String.format("%02d ",n));
            }
            else{
                System.out.printf(String.format("%02d,",n));
            }
        }
        System.out.printf("\n\n");
    }
    public static void resultMyLotto(int N,int[] correctLotto,int[][] myLotto){
        String[] countAlphabet= {"A","B","C","D","E","F","G","H","I","J"};
        for(int i=0;i<N;i++){
            int correctCount=returnSameNumCount(correctLotto,myLotto[i]);
            System.out.printf(countAlphabet[i]+"  ");
            for(int n:myLotto[i]){
                if(n==myLotto[i][5]){
                    System.out.printf(String.format("%02d => %d개 일치",n,correctCount));
                }
                else{
                    System.out.printf(String.format("%02d,",n));
                }
            }
            System.out.printf("\n");

        }
    }

    public static int returnSameNumCount(int[] A,int[] B){  //일치하는 로또 번호 수 출력(n개 일치)
        int n=0;
        for(int i:A){
            for(int j=0;j<B.length;j++){
                if(i==B[j]){
                    n++;
                }
            }
        }
        return n;
    }

    public static void showMyLotto(int N,int[][] myLotto){
        String[] countAlphabet= {"A","B","C","D","E","F","G","H","I","J"};
        for(int i=0;i<N;i++){
            //int[] myLotto=new int[6];
            for(int j=0;j<6;j++){
                int tmp=new Random().nextInt(1,46);
                myLotto[i][j]=tmp;

                for(int y=0; y<j; y++){
                    if(tmp == myLotto[i][y]){
                        j--;
                    }

                }

            }
            System.out.printf(countAlphabet[i]+"  ");
            for(int n:myLotto[i]){
                if(n==myLotto[i][5]){
                    System.out.printf(String.format("%02d ",n));
                }
                else{
                    System.out.printf(String.format("%02d,",n));
                }
            }
            System.out.printf("\n");



        }
        System.out.printf("\n");


    }

    public static void main(String[] args) {
        int[] correctLotto=new int[6];
        int[][] myLotto=new int[10][6];    //내가 뽑은 로또 번호 저장할 2차원 배열 [로또개수][로또번호]

        System.out.println("[로또 당첨 프로그램]");
        System.out.printf("\n");
        Scanner sc=new Scanner(System.in);
        System.out.printf("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
        int n=sc.nextInt();
        System.out.printf("\n");

        Question7.showMyLotto(n,myLotto);       //내 로또 결과 출력
        Question7.announceLotto(correctLotto);  //로또 번호 발표



        System.out.println("[내 로또 결과]");
        resultMyLotto(n,correctLotto,myLotto);  //내 로또 결과 출력


    }
}
