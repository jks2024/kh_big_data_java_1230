package TreeMap기본;
import java.util.Map;
import java.util.TreeMap;
// TreeMap 도 TreeSet 마찬가지로 이진 검색 트리(값이 추가 될 때 정렬이 됨)로 구현 되어 있습니다.
// Key 값으로 정렬하므로 key값에 해당하는 Comparable과 Comparator를 구현 해야 함
public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(87, "나희도"); // 25다섯 21
        score.put(88, "고유림"); // 25다섯 21
        score.put(75, "백이진"); // 25다섯 21
        score.put(65, "구자경"); // 해방일지, 손석구
        score.put(98, "우영우");

        Map.Entry<Integer, String> entry = null;
        entry = score.firstEntry();
        System.out.println("가장 낮은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lastEntry();
        System.out.println("가장 높은 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.lowerEntry(95);
        System.out.println("95 아래 점수 : " + entry.getKey() + " : " + entry.getValue());
        entry = score.higherEntry(95);
        System.out.println("95 위의 점수 : " + entry.getKey() + " : " + entry.getValue());
    }
}
