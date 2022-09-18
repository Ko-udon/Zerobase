public class Question1 {
    public static void main(String[] args) {
        int[] guguList={1,2,3,4,5,6,7,8,9};
        System.out.println("[구구단 출력]");

        //다중 반복문을 이용하여 코딩할 것
        for(int DanNum:guguList){
            for(int multiplyNum:guguList){
                //문제와 같은 출력을 위해 format 함수를 이용하되 %02 --> 정수의 앞 0 두자리까지 붙이기
                System.out.printf(String.format("%02d x %02d = %02d   ",multiplyNum,DanNum,DanNum*multiplyNum));
            }
            //줄바꿈 한번 해주기! 더 좋은 방법 찾아보기
            System.out.println();
        }
    }

}
