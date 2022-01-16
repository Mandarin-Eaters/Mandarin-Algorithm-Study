## 1주차 회고

### 2cleanwater
- Scanner보다 빠르다고 알려진 BufferedReader를 이용하는 문제였다.
입출력이 Buffer를 거쳐서 한번에 출력되기 때문에 더 효율적인 입출력이 가능하다는 이론이였는데
실제 코드에서 처음 이용해보니 신경써야 할 부분이 정말 많았다.
데이터를 라인 단위로 받아와서 split이나 StringTokenizer를 통해 나눠줘야했고
String 값을 리턴받기 때문에 다른 타입을 사용하려면 형변환을 시켜줘야했다.
또 Input, Output에 오류 날 상황을 대비해 throws IOException로 예외처리를 해줘야했다.
- Array와 String 처리에 익숙해지기 위해 당분간 Buffer를 이용해 코딩을 할 예정이지만 
버퍼의 크기 차이가 크기 때문에 추후에는 상황에 맞게 이용하는 습관을 길러야 할 것이다.

### seoltaehyeok <!-- 제 글이 길면 toggle처리해도 됩니다. -->
#### _`Scanner`를 사용하지 않고, `BufferedReader`를 사용하는 이유_

`Scanner.nextInt()`로 값을 받는다고 할 때
1. `InputStream`을 통해 입력을 받는다.
2. 문자로 온전하게 받기 위해 중개자 역할인 `InputStreamReader`를 통해 `char`타입 데이터로 처리
3. 입력받은 문자는 입력 메소드( `next()`, `nextInt()` )등의 타입에 맞게 정규식을 검사 (정규식 처리에 소모하는 시간이 많다.)
4. 정규식 문자열을 `Pattern.compile()` 이라는 메소드를 통해 `Pattern`타입으로 변환
5. 반환된 `Pattern`타입을 `String`으로 변환
6. `String`은 입력 메소드의 타입에 맞게 반환

`Scanner`는`InputStreamReader`를 통해 '문자' 형태로 사용한다. 

반면, `BuffereadReader`는 문자 그대로 `Buffer`를 사용한다.

`Buffer`는 입력받은 문자를 쌓아둔 뒤, 한 번에 '문자열'처럼 처리한다. 

또한, `Scanner`처럼 정규식을 필요로 하지 않는다.

따라서 ___해당문제는 `Buffer`를 사용하여 보다 빠르게 연산을 처리할 수 있었다.___

추가적으로 `Scanner`는 강력한 정규식으로 인해 속도는 다소 느리더라도 타입 변환의 안정성이 매우 뛰어나다.

### seungyeonpark
* BufferedReader
    * 일정한 크기의 데이터를 한 번에 읽어와 버퍼에 보관
    * 속도 향상, 시간 부하 적음
    * 공백 처리 필요
        * 라인(줄바꿈) 단위로 받음
    * cating 필요
        * String 타입 반환
    * IOException 던짐
* Scanner
    * 공백 처리 필요 없음
        * 공백과 줄바꿈 모두 경계로 인식
    * casting 필요 없음
        * 데이터 타입이 입력 받는 시점에서 결정됨
    * IOException 안 던짐

###	Seonhwa
