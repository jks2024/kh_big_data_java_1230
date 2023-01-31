package 로또번호생성리스트이용;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
// 리스트 타입 => HaseSet 이용해 중복 제거로 변경하기
public class LottoArrayList {
    public static void main(String[] args) {
        //List<Integer> list = new LinkedList<>(); // 갯수 지정 필요 없음
        HashSet<Integer> list = new HashSet<>();
        int tmp; // 로또 번호를 임시로 저장하는 변수
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            //if(!list.contains(tmp)) list.add(tmp); // 중복 여부 체크
            list.add(tmp);
            if(list.size() == 6) break;
        }
        for(Integer e : list) System.out.print(e + " ");
    }
}
