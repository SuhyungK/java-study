## String

- 인스턴스 생성
  - char[], String, StringBuffer 매개변수로 생성
```java
String str1 = "이름";
String str2 = new String("이름")
```  
   

- `split`
  - 지정된 분리자(regex)로 문자를 분할하여 String 배열 형태로 반환
```java
String[] arr = "apple,banana,kiwi,phodo";
// arr = [apple, banana, kiwi, phodo]
```

- `toCharArray()`
  - String클래스를 char[] 배열로 변환
```java
for (char c: str.toCharArray()) {
    answer += c - '0'
}
```