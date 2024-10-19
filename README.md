# java-calculator-precourse
입력한 문자열에서 숫자를 추출하여 더하는 계산기를 구현한다.

<br>

## 🔢 기능 명세

---

- [x] 시작 문자열 출력
- [x] 사용자 입력 받기
  - 음수 값이 들어 왔다면, IllegalArgumentException 발생 후, 애플리케이션 종료
- [x] 구분자로 숫자 분리 
  - [x] 기본 구분자(`,`, `:`)를 기준으로 숫자 분리 
  - [x] 커스텀 구분자를 기준으로 숫자 분리
    - 커스텀 구분자 : 문자열 앞부분의 `//`와 `\n` 사이에 위치하는 문자
  - [x] 구분자를 통해 숫자만 완전히 분리되었는 지 검증
    - [x] 검증에 실패했다면 IllegalArgumentException 발생 후, 애플리케이션 종료
      - 숫자 길이는 10자로 제한
      - 빈 문자열이라면, 0 반환
      - 커스텀 구분자 포맷이 구분자일 경우 예외 처리
      - 커스텀 구분자가 숫자일 경우 예외 처리
      - 커스텀 구분자가 빈 문자열일 경우 예외 처리
      - 커스텀 구분자가 1자의 문자가 아닐 경우 예외 처리
      - 잘못된 입력일 경우 예외 처리
      - 커스텀 구분자 정의 위치 예외 처리
- [x] 분리된 숫자들 합 계산
- [x] 결과 출력