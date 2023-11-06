## StringBuilder

- 인스턴스 생성
```java
StringBuilder sb = new StringBuilder();
```
  
- `append`
    - boolean, char, char[], double, float, int, long, Object, String을 매개변수로 받음
```java
for (int idx: index_list) {
      sb.append(my_string.charAt(idx));
  }
```

- `toString`
    - 인스턴스 문자열을 String 으로 반환
```java
  return sb.toString();
```