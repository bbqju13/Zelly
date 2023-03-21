import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kimmmm");
		list.add("chooo");
		list.add("hongggg");
		list.add("thmas");
		list.add("park");
		list.add("leeee");
		
		Stream<String> st = list.stream();
		st.sorted().forEach(s->System.out.println(s));
		System.out.println("------------------------");
		
		// 글자수가 5글자 이상인 이름만 출력
		list.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("-------------------------");
		list.stream().filter(n->n.length()>=5).forEach(System.out::println);
		System.out.println("---------------------------");
		
		// 각자 이름의 글자수 출력
		list.stream().map(n->n.length()).forEach(System.out::println);

	}

}
