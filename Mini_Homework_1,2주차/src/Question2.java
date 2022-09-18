import java.util.Scanner;

public class Question2 {
    public static int cashBack(int money){
        double tmp=0;
        int cashback=0;
        tmp=money*0.1;
        cashback=(int)tmp;

        if(cashback>300) {
            cashback = 300;
        }
        return cashback;
    }
    public static void main(String[] args) {
        int money=0;
        System.out.println("[캐시백 계산]");
        Scanner sc=new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        money=sc.nextInt();
        System.out.println("결제 금액은"+money+"원이고, 캐시백은 "+Question2.cashBack(money)+"원 입니다.");

    }
}
