## 기타

### import static

- 일반적인 `import`
```java
public class Test {

    public static void main(String[] args) {
        System.out.println(Math.pow(4, 2));
    }
}
```

- static을 사용한 경우
  - Math 클래스명을 생략하고 메서드명만으로 호출할 수 있음
  - 단, **_권장 되지는 않음_**
```java
import static java.lang.Math.*;

public class Test {

    public static void main(String[] args) {
        System.out.println(pow(4, 2));
    }
}

```