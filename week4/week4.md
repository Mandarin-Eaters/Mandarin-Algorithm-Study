## 4주차 회고

### 2cleanwater
<details>
<summary>10828번 (스택)</summary>
<div markdown="1">

   
### 문제 해결 방식
   * 단순히 스택 클래스를 사용하지 않고 기본적인 자료구조 처리 방식을 이해해본다.
   * 임의의 수의 데이터가 입력 삭제되므로 ArrayList를 사용했다.
   * push는 add, size는 size, empty는 isEmpty로 해결
   * top, pop은 size-1을 인덱스로 후입선출 방식 구현
   * 시간 제한이 있기 때문에 BufferedReader, Writer를 사용
### 문제점과 해결방안
   * if문만으로 작성하니 코드가 깔끔하지 않았다.
      * 해결 : 케이스가 여러가지이기 때문에 Switch문으로 작성
   
</div>
</details>

<details>
<summary>18258번 (큐)</summary>
<div markdown="1">

### 문제 해결 방식
   * 단순히 큐 클래스를 사용하지 않고 기본적인 자료구조 처리 방식을 이해해본다.
   * push는 add, size는 size, empty는 isEmpty로 해결
   * pop과 front는 0을, back은 size - 1을 인덱스로 선입선출 방식 구현
   * 시간 제한이 있기 때문에 BufferedReader, Writer를 사용
### 문제점과 해결방안
   * ArrayList는 삽입과 삭제 시 데이터를 하나씩 다 옮겨오기 때문에 사용 불가
      * 해결 : 삽입, 삭제에 효과적인 LinkedList 방식을 사용
   * Deque를 사용해도 시간초과가 났다.
      * 한 줄 입력 ⇒ 한 줄 출력 방식으로만 채점이 가능하다 생각
      * while( ) 내부에  flush( )를 사용해 한 줄씩 출력
      * 결론적으론 Buffer를 이용하지 않고 Scanner를 사용한 것과 같게 됨.
      * 해결 : flush( )를 while( )밖에 배치하여 시간초과를 해결
</div>
</details>

