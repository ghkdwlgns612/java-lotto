# 로또

## 기능목록
- [X] 로또 구입 금액 입력
  - [X] 로또 개수를 구한다
- [X] 로또 번호들을 출력한다
  - [X] 로또 번호를 생성한다
- [X] 로또 당첨번호를 입력한다
  - [X] 보너스 볼을 입력한다
- [X] 로또 당첨 통계를 출력한다
  - [X] 당첨번호와 로또 번호를 비교한다

## 기능 요구 사항

* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

## 프로그래밍 요구 사항

* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
* 기본적으로 Google Java Style Guide을 원칙으로 한다.
  * 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
* indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  * 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
* 3항 연산자를 쓰지 않는다.
* else 예약어를 쓰지 않는다.
  * else 예약어를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
  * 힌트: if문에서 값을 반환하는 방식으로 구현하면 else 예약어를 사용하지 않아도 된다.
## 추가된 요구 사항
* 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
  * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
* 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
  * 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
* 배열 대신 컬렉션을 사용한다.
* Java Enum을 적용한다.
* 모든 원시 값과 문자열을 포장한다
* 줄여 쓰지 않는다(축약 금지).
* 일급 컬렉션을 쓴다.

# 문자열 덧셈 계산기

## 기능 목록
- [X] 문자열 입력 받기 InputView#getNumbers
- [X] 쉼표 또는 콜론을 구분자로 문자열 분리 StringParser#splitDefaultDelimiter
- [X] 커스텀 구분자로 문자열 분리 StringParser#splitCustomDelimiter
- [X] 숫자 이외의 값 또한 음수일 경우 예외처리 Number#validatePositiveNumber
- [X] 구분된 숫자 합 반환 Calculator#calculate

## 기능 요구 사항
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환
  * (e.g. "" => 0, "1,2" => 3, "1,2,3" => 6, "1,2:3" => 6)
* 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
  * 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.
## 프로그래밍 요구 사항
* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
* 기본적으로 Google Java Style Guide을 원칙으로 한다.
  * 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
* indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
  * 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    *힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메서드)를 분리하면 된다.
* 3항 연산자를 쓰지 않는다.
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
* else 예약어를 쓰지 않는다.
  * else 예약어를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
  * 힌트: if문에서 값을 반환하는 방식으로 구현하면 else 예약어를 사용하지 않아도 된다.
* 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
* 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.