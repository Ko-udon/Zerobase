import java.util.Random;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("[주민등록번호 계산]");
        Scanner sc=new Scanner(System.in);
        System.out.printf("출생년도를 입력해 주세요.(yyyy):");
        String year=sc.next();
        System.out.printf("출생월을 입력해 주세요.(mm):");
        String month=sc.next();
        System.out.printf("출생일을 입력해 주세요.(dd):");
        String day=sc.next();
        System.out.printf("성별을 입력해 주세요.(m/f):");
        char sex=sc.next().charAt(0);

        //생년월일 앞번호, 문제에선 2021 12 10  모든 생년이 입력되었지만 슬랙의 2자리 방식으로 넣은 답변을 보고 수정
        String registNum;
        registNum=year.substring(2,3)+year.charAt(3)+month+day;

        Random rnd=new Random();
        int randomNum= rnd.nextInt(100000,999999);
        
        //성별 체크
        if(sex=='m'){
            randomNum+=3*1000000;
        }
        else {
            randomNum+=4*1000000;
        }

        registNum+=randomNum;

        System.out.println(registNum.substring(0,6)+'-'+registNum.substring(6));

    }
}
