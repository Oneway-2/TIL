# Garbage Collector

- 힙 영역에서 사용되지 않는 객체들을 제거하는 작업을 의미합니다.
- 이 객체를 제거하는 작업이 필요한 이유는 자바는 개발자가 메모리를 직접 해제해줄 수 없는 언어이기 때문입니다.

<br>

- GC의 대상이 되는 것
  - 객체가 NULL인 경우
  - 블럭 실행 종료 후, 블럭 안에서 생성된 객체
  - 부모 객체가 NULL인 경우, 포함하는 자식 객체

<br>

- GC의 과정
  - Marking
    - 프로세스는 마킹을 호출합니다. 이것은 GC가 메모리가 사용되는지 아닌지를 찾아냅니다.
  - Normal Deletion
    - 참조되지 않는 객체를 제거하고, 메모리를 반환합니다.
  - Compacting
    - 퍼포먼스를 향상시키기 위해, 참조되지 않는 객체를 제거하고 또한 남은 참조되어지는 객체들을 묶습니다.
    - 이들을 묶음으로서 공간이 생기므로 새롱누 메모리 할당 시에 더 쉽고 빠르게 진행할 수 있습니다.
