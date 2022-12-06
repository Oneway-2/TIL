# JPA FetchType

서로의 Entity가 N:1 매핑이 되어있는 상태에서 fetch 설정을 할 수 있음

-   @??ToOne 상황에서는 EAGER 이 디폴트 값
-   @??ToMany 상황에서는 LAZY 가 디폴트 값

## FetchType.LAZY

-   지연로딩
-   JPA는 필요한 값만 딱 가져오기 위해 필요한 쿼리만 보냄.

## FetchType.EAGER

-   즉시로딩
-   JPA는 필요하지 않든 어쨌든 일단 연관된 테이블의 모든 값에 대한 쿼리를 보내서 가져와놓고 생각함.
-   n+1 문제를 발생시킬 수 있으므로 EAGER은 가급적이면 쓰지 않는게 좋다.

## 정리

-   비지니스 로직에서 Over fetching과 같은 현상, 그리고 불필요한 쿼리 요청은 로직의 효율성을 떨어뜨린다.
-   EAGER(즉시로딩)을 사용하면 Over fetching 현상을 발생시킬 수 있음.
-   또한 연관된 테이블의 갯수만큼 계속 select 요청을 보내는 n+1 문제를 야기시키기도 함.
-   <span style="font-weight:bold">따라서 FetchType은 LAZY를 쓰는 것을 권장한다.</span>

</br>

Reference:

https://ict-nroo.tistory.com/132

https://developer-hm.tistory.com/37
