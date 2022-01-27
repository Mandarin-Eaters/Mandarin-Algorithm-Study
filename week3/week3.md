## 3주차 회고

### seungyeonpark
<details>
<summary>10828번 (스택)</summary>
<div markdown="1">

#### 1. 스택의 시간복잡도
* 검색: O(n)
    * 임의 요소 접근 불가
* 삽입: O(1)
* 삭제: O(1)

#### 2. 스택의 용도
* 자료순서 뒤집기
* 컴퓨터 연산 순서에 맞게 자료 재정리
    ```
    1. 한 글자를 읽는다
    2. 글자를 읽는데 성공한 경우
        - 피연산자면, 스택에 넣는다
        - 연산자면, 피연산자 둘을 스택에서 꺼내 연산자로 계산하고 그 결과를 다시 스택에 넣는다
        - 1번으로 돌아감
    3. 글자를 읽는데 실패한 경우(마지막)
        - 스택에서 꺼내면 결과값이 나온다
    ```
* 재귀함수 제거

</div>
</details>

<details>
<summary>18258번 (큐)</summary>
<div markdown="1">

#### 1. 큐의 시간복잡도
* 검색: O(n)
    * 임의 요소 접근 불가
* 삽입: O(1)
* 삭제: O(1)

#### 2. 큐의 용도
* 대기줄이 필요한 경우
* 데이터 유입 속도가 소모 속도보다 빠른 경우
* 데이터 제공자의 수가 소비자의 수와 다른 경우
* 입출력 스트림 버퍼링 등

</div>
</details>

### seoltaehyeok
<details>
<summary>10828번 (스택)</summary>
<div markdown="1"> 
   
   #### 문제이해
   
   * push: 배열에 순차적으로 값을 할당받음
   * pop: 배열의 마지막 인덱스를 출력하고 제거함 단, 값이 없을 경우 -1 출력
   * size: 현재 메모리에 값이 할당된 만큼 출력
   * empty: 할당된 값이 없으면 1 있으면 0 출력
   * top: 배열의 마지막 인덱스를 출력함 (제거하지 않음)
   
   #### 문제해결
   
   * push: stack[size]에 push한 뒤, size 증가
   * pop: size를 감소시킨 뒤, statck[size] 리턴
   * size: 해당 size 리턴
   * empty: size가 0인지 판단 후 리턴
   * top: size가 0이 아니라면, stack[size-1]을 리턴
   
   #### KEY POINT
   
   * push를 할 때 값을 넣고 다음 값을 넣어주기 위해 index를 1증가함
   * pop을 하기위해 이미 증가된 index를 1 줄인 뒤 값을 리턴
   * top은 맨 마지막 배열의 값을 보여주기 위해 배열의 n-1을 리턴 (size 값 자체를 줄이지는 않도록 주의)
   * 시간제한이 있으므로 입력에 용이한 버퍼를 사용
   * 입력 값을 모두 할당한 뒤 출력을 해야 하므로 입력 값을 StringBuilder에 저장한 뒤 마지막에 출력
   
</div>
</details>


<details>
<summary>18258번 (큐)</summary>
<div markdown="1">
   
   #### 문제이해
   
   * queue는 stack과 반대로 선입선출을 하기 때문에 배열의 첫번째 요소를 빼내야 함
   * 첫번째 인덱스를 삭제하고 나머지 값들을 순차적으로 옮기는 것은 좋지 않음
   * 맨 뒤 인덱스를 삭제하는 것이 훨씬 메모리 소모를 줄일 수 있음
   * 하지만 해당 문제에는 영향을 주지 않았지만 뒤늦게 파악을 함
   * front: 맨 처음에 할당한 값을 출력
   * back: 맨 마지막에 할당한 값을 출력
   * 나머지는 stack과 동일
   
   #### 문제해결
   
   * 실행할 case N개를 주고 그것을 배열의 사이즈에 할당함
   * arr[n-1] = push 할당 (앞서 말했듯이 맨 뒤로 하는 게 좋을 줄 알았음)
   * stack과 다르게 size 두개(indexPush / indexPop)와 현재 할당한 개수(count)가 필요했음
   * indexPush: push를 할 때 사용하기 위한 용도로 기본값은 n-1
   * indexPop: pop을 할 때 사용하기 위한 용도로 기본값은 n-1
   * push: 마지막 인덱스의 값을 넣고, 마지막 직전 인덱스로 할당 및 배열에 값이 할당되었으므로 count 증가
      
      ``` java
      queue[indexPush] = push;
      count++;
      indexPush--;

      ```
   * pop: 마지막 인덱스의 값을 넣고, 마지막 직전 인덱스로 할당 및 배열에 값이 할당되었으므로 count 감소
   
      ``` java
      count--;
      return queue[indexPop--]; // return을 하고 나면 다음 문장을 실행할 수 없기 때문에 queue[indexPop]를 넘겨준 뒤 indexPop--를 할 수 없음
      ```
   * front: 맨 처음에 할당한 값을 출력해야 하므로 queue[indexPop]을 해줌 (pop을 할 때만 감소 즉, 맨 처음 넣어준 값만을 리턴)
   * back: 맨 마지막에 할당한 값을 출력해야 하므로 queue[indexPush +1]을 해줌 (push를 한 뒤 감소했으므로 1 증가한 값을 리턴)
   
   #### KEY POINT
   
   * 위에서 말한 배열의 삭제 이론에 대해서는 옳은 말이지만 해당 문제와 관련이 없음을 파악했어야 한다.
   * 괜히 문제를 반대로 푼 느낌이므로 개념 이해와 문제를 정확히 이해 할 필요가 있다.
   
</div>
</details>

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

