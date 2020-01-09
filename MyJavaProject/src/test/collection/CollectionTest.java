package test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>(); // 클래스로만 가능
		list1.add("Hi");
		list1.add("Hello");
		list1.add("Apple");
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		list1.addFirst("<");
		list1.add(">");
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		
		System.out.println("");
		LinkedList<Integer> list2 = new LinkedList<Integer>(); // 클래스로만 가능
		list2.add(10);
		list2.add(20);
		list2.add(30);
		for(int n : list2) {
			System.out.println(n);
		}
		
		ArrayList<Member> list3 = new ArrayList<Member>();
		list3.add(new Member("홍길동", 20, "010-1234-5678"));
		list3.add(new Member("가나다", 12, "010-1111-2222"));
		list3.add(new Member("라마바", 34, "010-3333-4444"));
		for(int i = 0; i < list3.size(); i++) {
			Member member = list3.get(i);
			System.out.println("--------------------");
			System.out.println(member.getName());
			System.out.println(member.getAge());
			System.out.println(member.getPhone());
		}
		System.out.println("--------------------");
	}
}