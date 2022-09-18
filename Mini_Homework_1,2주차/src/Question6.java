import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Question6 {

    public static void main(String[] args) {
        int voteCount=0;
        int totalVote=100000;
        double percent;
        HashMap<String,Integer>candidate=new HashMap<String, Integer>();
        candidate.put("이재명",1);
        candidate.put("윤석열",0);
        candidate.put("심상성",0);
        candidate.put("안철수",0);


        //100000만번 랜덤투표
        while(voteCount<totalVote){
            int vote= new Random().nextInt(1,5);
            voteCount++;


            switch (vote){
                case 1:
                    candidate.replace("이재명",candidate.get("이재명")+1);
                    System.out.println(String.format("[투표진행율]: %.2f"+"%%, "+voteCount+"명 투표 => 이재명",(float)voteCount/1000f));
                    break;
                case 2:
                    candidate.replace("윤석열",candidate.get("윤석열")+1);
                    System.out.println(String.format("[투표진행율]: %.2f"+"%%, "+voteCount+"명 투표 => 윤석열",(float)voteCount/1000f));
                    break;
                case 3:
                    candidate.replace("심상성",candidate.get("심상성")+1);
                    System.out.println(String.format("[투표진행율]: %.2f"+"%%, "+voteCount+"명 투표 => 심상성",(float)voteCount/1000f));
                    break;
                case 4:
                    candidate.replace("안철수",candidate.get("안철수")+1);
                    System.out.println(String.format("[투표진행율]: %.2f"+"%%, "+voteCount+"명 투표 => 안철수",(float)voteCount/1000f));
                    break;
                default:
                    System.out.println("후보권 외 투표!");
                    break;
            }
            System.out.println(String.format("[기호:1] 이재명: %.2f"+"%%, (투표수: "+candidate.get("이재명")+")",(float)candidate.get("이재명")/1000f));
            System.out.println(String.format("[기호:2] 윤석열: %.2f"+"%%, (투표수: "+candidate.get("윤석열")+")",(float)candidate.get("윤석열")/1000f));
            System.out.println(String.format("[기호:3] 심상성: %.2f"+"%%, (투표수: "+candidate.get("심상성")+")",(float)candidate.get("심상성")/1000f));
            System.out.println(String.format("[기호:4] 안철수: %.2f"+"%%, (투표수: "+candidate.get("안철수")+")",(float)candidate.get("안철수")/1000f));

            System.out.println();

        }


        //최다 득표수 구하기
        int maxVote=candidate.get("이재명");
        for(String k :candidate.keySet()){
            if(maxVote<candidate.get(k)){
                maxVote=candidate.get(k);
            }
        }

        //최다 득표수의 키값(후보가 누구인지) 구하기
        String president="";
        for (String k : candidate.keySet()) {
            if (candidate.get(k).equals(maxVote)) {
                president=k;
            }
        }

        System.out.println("[투표결과] 당선인: "+president);
    }

}
