import java.time.LocalDate;
import java.util.Scanner;

public class Question5 {
    public static void showCalender(int year,int month){
        int date=1,day;  //날짜와 요일

        LocalDate firstDate=LocalDate.of(year,month,date);
        day=firstDate.getDayOfWeek().getValue(); //요일 가져오기, 구글링,,, 일 월 화 0 1 2 순

        //두자리 수 미만인 월은 앞에 0붙여서 출력하기
        if(month>9){
            System.out.println(String.format("[%d년 %d월]",year,month));
        }
        else{
            System.out.println(String.format("[%d년 %02d월]",year,month));
        }
        System.out.println("일  월  화  수  목  금  토"); //달력 요일 출력 간격 맞추기 어렵습니다.

        //System.out.println(day);

        for(int i=0;i<day;i++){   //01일이 일요일이 아닐때 공백 출력해주기
            System.out.print("    ");  //공백은 어느정도?? 이거 맞추기가 힘듭니다..
        }

        for(int i=1; i<=firstDate.lengthOfMonth(); i++) { //lengthOfMonth 그 달의 요일 수
            System.out.printf("%02d\t", date);
            date++;
            day++;

            if(day % 7 == 0) {  //한주 간격으로 줄 바꿈
                System.out.println();
            }
        }



    }
    public static void main(String[] args) {
        System.out.println("[달력 출력 프로그램]");
        Scanner sc=new Scanner(System.in);
        System.out.printf("달력의 년도를 입력해 주세요.(yyyy):");
        int year=sc.nextInt();
        System.out.printf("달력의 월을 입력해 주세요.(mm):");
        int month=sc.nextInt();
        showCalender(year,month);

    }
}
