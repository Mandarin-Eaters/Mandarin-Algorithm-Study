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

### seoltaehyeok

### seungyeonpark
