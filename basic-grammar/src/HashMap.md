## HashMap

### 문법

- HashMap
  - Map 인터페이스를 구현
  - Key와 Value를 가지며 파이썬의 딕셔너리와 유사
  - 일반적으로 Map 타입 참조변수에 선언하는 것을 권장

  ```java
  Map<Integer, Integer> map = new HashMap();
  ```

- `map.keySet()`
  - 키(key) 값을 Set으로 반환
  - 중복이 없는 값이고 순서는 보장되지 않음
  ```java
  List<Integer> list = new ArrayList<>(map.keySet());
  ```

- `map.getOrDefault(Key, Default Value)`
  - Map에서 Key 값으로 접근해서 Value 값 반환
  - 단 Map에 Key 값이 존재하지 않을 때는 Default Value에 설정된 값을 반환
- `map.put`
  - Map에 새로운 (Key, Value) 쌍 추가
  ```java
  for (int x: tangerine) {
      map.put(x, map.getOrDefault(x, 0)+1);
  }
  ```

- Key값 추출해서 리스트 생성 후, Value 값 기준으로 정렬하기
  - 내림차순 정렬
  ```java
  List<Integer> list = new ArrayList<>(map.keySet());
  list.sort((o1, o2) -> map.get(o2) - map.get(o1));
  ```