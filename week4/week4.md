## 4주차 회고

### 2cleanwater
<details>
<summary>11729번 하노이 탑 이동 순서</summary>
<div markdown="1">

### 문제 해결 방식
   * 하노이의 탑은 n개의 탑을 옮길 때 기본적으로 n-1만큼의 탑을 빈 봉으로 옮기고 n번판을 옮긴 뒤 다시 n-1탑을 위로 올리는 방식으로 해결한다.
   * 재귀를 이용하여 해결한다.
### 문제점과 해결방안
   * 탑을 이동시키는 표현 방식을 적어보면 (n-1 탑 옮기는 과정), (1 3), (n-1 탑을 옮기는 과정) 식으로 계산된다.
   * 따라서 전체 이동 횟수는 n = (n-1)*2 +1 로 계산할 수 있다.
   * 봉이 3개이기 때문에 출발봉, 도착봉, 남는 봉으로 나눠서 입력받아야한다.
       * 재귀 방식을 이용하기 때문에 n-1의 도착이 남는 봉이기 떄문이다.
   * valueOf()와 parseInt()의 차이 : Integer 객체와 int형으로 변환하기때문에 크기 차이가 난다.
 
</div>
</details>

<details>
<summary>1920번 수 찾기</summary>
<div markdown="1">

### 문제 해결 방식
  * 검색할 배열을 정렬한 후 이진 탐색을 이용하여 값을 확인
  * N 배열에 M 배열 요소를 for문을 통해 하나씩 검색
### 문제점과 해결방안
  * search 부분에서 return 값은 boolean으로 검색하는 수의 유무를 체크함
  * 왼쪽과 오른쪽 인덱스를 결정해 중간 인덱스 계산
  * 중간 인덱스 요소랑 비교해서 왼쪽은 +1, 오른쪽은 - 1하며 값을 검색한다.
  * 값이 없어 왼쪽이 오른쪽보다 커지면 while 탈출 후 false
   
</div>
</details>

### seungyeonpark
<details>
<summary>11729번 하노이 탑 이동 순서</summary>
<div markdown="1">
  
- n번째 문제를 풀기 위해 n - 1번째 문제의 해결법을 다시 사용하는 재귀의 원리를 이용
- 단계
  ```
  1. n - 1개의 원반을 보조 기둥으로 옮긴다
  2. 제일 큰 원반을 목표 기둥으로 옮긴다
  3. n - 1을 목표 기둥으로 옮긴다
  ```
- 원반 이동 횟수
  ```
  f(n) = 1 + 2f(n - 1)
  ```
  ```
  f(1) = 1
  f(2) = 1 + 2f(1) = 3
  f(3) = 1 + 2f(2) = 7
  f(4) = 1 + 2f(3) = 15
  f(5) = 1 + 2f(4) = 31
  ...
  ```
  
</div>
</details>

<details>
<summary>1920번 수 찾기</summary>
<div markdown="1">
  
- 이진탐색을 적용하는 전제 조건은 데이터가 키 값으로 이미 정렬(sort)되어 있다는 것
- 이진 탐색을 한 단계씩 진행할 때마다 검색 범위가 반으로 좁혀진다
  - 시간 복잡도 O(logn)
- 단계
  ``` 
    1. L = 0, R = N - 1
    2. 만약 L > R이면 알고리듬 종료 (탐색 실패)
    3. m = (L + R) / 2
    4. 만약 nums[m] < value면, L = m + 1을 하고 2번으로 돌아감
    5. 만약 nums[m] > value면, R = m - 1을 하고 2번으로 돌아감
    6. nums[m] == value라면, 탐색 성공
  ```
- 재귀로 구현
  ``` java
      public static boolean binarySearch(int[] ary, int value, int l, int r) {
        if (l > r) {
          return false;
        }

        int mid = (l + r) / 2;

        if (ary[mid] < value) {
            binarySearch(ary, value, mid + 1, r);
        } else if (ary[mid] > value) {
            binarySearch(ary, value, l, mid - 1);
        } else {
            return true;
        }
  
    }
  ```
- 반복문으로 구현
  ``` java
      public static boolean binarySearch(int[] ary, int value, int l, int r) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (ary[mid] < value) {
                l = mid + 1;
            } else if (ary[mid] > value) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        
        return false;
    }
  ```
  
</div>
</details>
