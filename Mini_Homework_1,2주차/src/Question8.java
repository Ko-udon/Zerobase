import java.util.Scanner;

public class Question8 {
    public static int taxCase(long Income) {
        if (Income <= 12000000){
            return 0;
        }
        else if ((Income > 12000000)&&(Income <= 46000000)) {
            return 1;
        }
        else if ((Income > 46000000)&&(Income <= 88000000)){
            return 2;
        }
        else if ((Income > 88000000)&&(Income <= 150000000)){
            return 3;
        }
        else if ((Income > 150000000)&&(Income <= 300000000)){
            return 4;
        }
        else if ((Income > 300000000)&&(Income <= 500000000)) {
            return 5;
        }
        else if ((Income > 500000000)&&(Income <= 1000000000)){
            return 6;
        }
        else {
            return 7;
        }
    }

    public static void showTotalTax(long income){
        long[] taxAvg={12000000,34000000,42000000,65000000,150000000,200000000,500000000};
        float[] taxPercent={0.06f,0.15f,0.24f,0.35f,0.38f,0.40f,0.42f,0.45f}; //double 로 선언했다가 연산이 잘 안되는 경우가 많음,,,
        //String[] taxPercentText={"6%","15%","24%","35%","38%","40%","42%","45%"};
        int[] nujinList={0,1080000,5220000,14900000,19400000,25400000,35400000,65400000};

        long yearIncome = income;

        int taxCase = Question8.taxCase(yearIncome);

        int taxSum = 0;

        float rate = 0;
        long tax = 0;
        int nujin=nujinList[taxCase];

        long tmp = 0; //세금 계산용
        long totalTax = 0; //총 세금 금액

        for (int i = 0; i < taxCase; i++) {
            tax=taxAvg[i];
            rate=taxPercent[i];

            tmp = (int) (rate * tax);
            totalTax += tmp;
            taxSum += tax;
            System.out.printf("%9d * %2d%% = %9d\n", tax, (int)(rate * 100), tmp);
        }

        tax = yearIncome - taxSum;
        rate = taxPercent[taxCase];
        tmp = (int) (rate * tax);
        totalTax += tmp;

        System.out.printf("%9d * %d%% = %9d\n", tax, (int)(rate * 100), tmp);
        System.out.println("\n\n");
        System.out.printf("[세율에 의한 세금]:        %9d\n", totalTax);
        System.out.printf("[누진공제 계산에 의한 세금]: %9d",(long)(yearIncome*rate)-nujin);

    }



    public static void main(String[] args) {
        System.out.println("[과제금액 계산 프로그램]");
        Scanner sc=new Scanner(System.in);
        System.out.printf("연소득을 입력해 주세요.:");
        long income=sc.nextInt();

        showTotalTax(income);

    }
}
