import java.util.Scanner;

public class Question3 {
    public static int cost(int age,int time, char meritorious,char card){
        int totalCost=10000;
        totalCost=(age<3)?0:totalCost;
        totalCost=((meritorious=='y')||(card=='y'))?8000:totalCost;
        totalCost=(time>17)?4000:totalCost;
        return totalCost;
    }
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        Scanner sc=new Scanner(System.in);
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age=sc.nextInt();
        System.out.printf("입장시간을 입력해 주세요.(숫자입력):");
        int time=sc.nextInt();
        System.out.printf("국가유공자 여부를 입력해 주세요.(y/n):");
        char meritorious=sc.next().charAt(0);
        System.out.printf("복지카드 여부를 입력해 주세요.(y/n):");
        char card=sc.next().charAt(0);
        System.out.println("입장료: "+Question3.cost(age,time,meritorious,card));
    }
}
