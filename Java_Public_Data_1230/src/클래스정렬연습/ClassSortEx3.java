package 클래스정렬연습;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ClassSortEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> ts = new TreeSet<>(new SortScore());
        System.out.print("학생 수 입력 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            ts.add(new Student(sc.next(), sc.nextInt()));
        }

        for(Student e : ts) {
            System.out.print(e.name + " ");
        }
    }
}

class Student {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class SortScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.score == o2.score) {
            return o1.name.compareTo(o2.name);
        }
        return o1.score - o2.score;
    }
}