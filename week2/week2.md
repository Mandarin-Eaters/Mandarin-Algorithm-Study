## 2주차 회고

### 2cleanwater

### seoltaehyeok

### seungyeonpark
*  2941번
    * 논리 연산자를 활용해 복잡한 분기문을 그나마 간단하게 줄일 수 있었다.
    * 24번 line에서 if~else if 구문 안 쓰고 그냥 if 문 두 개 나열했다가 `	런타임 에러 (StringIndexOutOfBounds)` 발생함.
    * 위의 if문에서 i의 값이 바뀌었는데 아래 if문에서 다시 i 변수를 이용해 문자를 읽어와서 발생한 문제였다.
* 1316번
    * 입력 조건 중 `단어는 알파벳 소문자로만 되어있다`라는 조건이 있다. 
        * 그래서 문자의 아스키 코드 값을 불리언 배열의 인덱스로 사용했다.
            ``` java
            checks[s.charAt(j) - 'a'] // 17번 line
            ``` 
        * 위 불리언 배열은 문자가 이전에 등장했는지 여부를 저장하는 배열이다. 이전에 등장했다면 true, 등장한 적이 없다면 false를 저장한다.
    * 문자에 이전에 등장한 경우, 직전 문자와 해당 문자가 동일하지 않다면 그룹 문자가 아니라고 판단했다.
        ``` java
        if (checks[s.charAt(j) - 'a']) {
            if (s.charAt(j) != s.charAt(j - 1)) {
                isGroup = false;
                break;
        } 
        ```
    