package 스택기본;
import java.util.Stack;
// Stack : LIFO(Last in First Out)구조, Vector의 기능을 제약해서 만듬, 메모리 구조의 Stack역이 대표적이 예시 입니다.
// 입력과 출력이 한 곳에서만 일어 납니다.
// push() : 객체를 삽입
// peek() : 스택의 맨 위의 값 확인
// pop() : 맨 위의 값 추출하면서 보여 줌
// empty() : 스택이 비어 있는지 반환 (true /false)
// size() : 스택에 포함된 객체의 개수 반환
// contains(값) : 해당값이 스택내에 있는지 확인
public class StackEx1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop());  // 3
        System.out.println(stack.peek()); // 2
        System.out.println(stack.empty()); // false
        System.out.println(stack.size()); // 2
        System.out.println(stack.contains(1)); // true
        for(Integer e : stack) { // 이건 지원하지 않는게 맞는듯 ??
            System.out.println(e);
        }
    }
}
