package 스트림예제4번;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 파일로 부터 스트림 얻기
public class StreamEx4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Java_Public_Data_1230/src");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p->System.out.println(p.getFileName()));
    }
}
