# 세마포어 vs 뮤텍스

-   세마포어(Semaphore)

    -   멀티프로그래밍 환경에서 공유 자원에 대한 접근을 제한하는 방법
    -   여러개의 프로세스가 접근 가능한 공유자원을 관리하는 방식.
    -   뮤텍스가 될 수 있다.

-   뮤텍스(Mutex)
    -   임계 구역을 가진 스레드들의 실행시간이 서로 겹치지 않고 각각 단독으로 실행되게 하는 기술
    -   상호 배제(Mutual Exclusion)의 약자이다.
    -   한 번에 한 개의 프로세스만 접근 가능하도록 관리하는 방식이며, 뮤텍스는 세마포어가 될 수 없다.
