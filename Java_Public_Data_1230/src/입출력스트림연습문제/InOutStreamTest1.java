package 입출력스트림연습문제;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
public class InOutStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<StudentInfo> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("Java_Public_Data_1230/src/입출력스트림연습문제/score.txt");
        Scanner sc = new Scanner(is);
        while(sc.hasNextLine()) { // 읽어 들일 라인이 있으면 true
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for (StudentInfo e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
