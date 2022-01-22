package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
 
public class boj_18258_hwa {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();// 문자열 처리 
		
		//LIFO 구조를 만들기 위해 적합한 클래스는 Deque 인터페이스를 구현하는 ArrayDeque
		//Deque 양방향 큐
		Deque<Integer> q = new ArrayDeque<>();
		// BufferedReader 라인을 읽어올때 숫자로 읽어오기 위해 형변환
		int N = Integer.parseInt(br.readLine());
		
		// String을 token단위로 끊어줌, this is my string을 this, is, my, string 4개로 끊어주는 기능
		StringTokenizer command;
		
		while(N-- > 0) {
			command = new StringTokenizer(br.readLine(), " ");	// 문자열 분리 
			
			switch(command.nextToken()) {	//토큰을 리턴하고 이전토큰은 제거 
			
			case "push":
				// offer는 큐의 맨 뒤에 요소를 추가한다.
				q.offer(Integer.parseInt(command.nextToken()));	
				break;
				
			case "pop" :
				/*
				 *  poll은 가장 앞에 있는 요소를 삭제하며
				 *  삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
				 */
				Integer item = q.poll();	
				if(item == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(item).append('\n');
				}
				break;
				
			case "size":	//큐에 들어있는 정수의 개수를 출력
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":// 큐가 비어있으면 1, 아니면 0출력
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front":// 큐의 가장 앞에 있는 정수 출력, 없으면 -1출력
				// peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				Integer ite = q.peek();
				if(ite == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(ite).append('\n');
				}
				break;
				
			case "back"://큐의 가장 뒤에 있는 정수 출력, 없으면 -1출력
				// peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
				Integer it = q.peekLast();	 
				if(it == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(it).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
//https://st-lab.tistory.com/169
//큐를 구현하는 클래스는 크게 PriorityQueue(우선순위 큐), 
//ArrayDeque(배열 양방향 큐), LinkedList(연결리스트) 이렇게 3가지가 있다.
//즉, 어디까지나 실질적으로는 LinkedList 처럼 객체를 연결한 방식 또는 PriorityQueue나, 
//ArrayDeque 처럼 배열에 의해 구현되기 때문에 정해진 방식이 있는 것이 아니다.

//offer(E e) = 큐의 마지막에 요소를 추가, add와 비슷한 역할
//poll() : 큐의 첫번째 요소를 제거하고 제거된 요소를 반환, remover와 비슷한 역할
//peek() : 큐의 첫번째 요소를 제거하지 않고 반환, element와 비슷한 역할 

//가장 앞부분에 추가 - addFirst(E value)
//가장 마지막 부분에 추가 (기본값) - addLast(E value)
//특정 위치에 추가 - add(int index, E value) 
//
//가장 앞의 요소(head)를 삭제 - remove()
//특정 index의 요소를 삭제 - remove(int index)
//특정 요소를 삭제 - remove(Object value)