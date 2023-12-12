# 사다리게임 3단계 - 사다리(게임 실행)
## 기능 요구 사항
- [] 사다리 실행 결과를 출력해야 한다.
- [] 개인별 이름을 입력하면 개인별 결과를 출력하고, "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.

### ResultView 상세기능
- [] 개인별 이름을 입력하면 개인별 결과를 출력한다.
- [] "all"을 입력하면 전체 참여자의 실행 결과를 출력한다.
- [] 빈칸을 입력하면 오류를 발생시킨다.
- [] 참여자 이름이 아니면 오류를 발생시킨다.

### InputView 상세기능
- [x] 결과 값을 스트링형태로 받는다.
- [x] 받은 결과값을 split해서 return해준다.
- [] 결과를 보고싶은 사람을 스트링형태로 받는다.

### Point 상세 기능
- [x] true, false를 담고있는 Enum Class로 바꾼다.
- [x] Point 값을 갖고오는 valueOf 함수를 만든다.

### LineCreator
- [x] 1줄의 랜덤 Line을 만들어준다.

### PointCreator
- [x] 1칸의 랜덤 Point를 만들어준다.

### RandomLinesFactory
- [x] LineCreator와 PointCreator를 이용하여 Lines를 만들어준다.

### Position
- [] 각 참가자마다 현재 위치를 기록해준다.

### Direction(Enum)
- [] 왼쪽, 오른쪽, 직진 방향을 알려준다.
