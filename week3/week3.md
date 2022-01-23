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