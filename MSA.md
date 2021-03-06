# MSA (MicroService Architecture)

- 작고 독립적인.
- 배포 가능한 각각의 기능을 수행하는 서비스로 구성된
- 프레임워크

<br>

MSA의 반댓말: Monolithic Architecture

오늘날 하나의 프로젝트에 수백명의 개발자가 투입되는데, 이러한 환경에 Monolithic Architecture은 한계점이 있었다.

- 부분 장애가 전체 서비스의 장애로 확대될 수 있는 점
- 부분적인 Scale-out(여러 서버로 나누어 일을 처리하는 방식)이 어렵다.
- 서비스의 변경이 어렵고, 수정 시 장애의 영향도 파악이 힘들다.
- 배포 시간이 오래 걸린다.
- 한 Framework와 언어에 종속적이다.

<br>

MSA는 어플리케이션의 출시처럼 하나의 목표를 향해 나아가지만 자기가 개발하는 파트만 책임지는 것.

그렇게 나누어진 파트는 다른 어플리케이션에서 재사용할 수 있어야 한다.

MSA의 장점:

- 각각의 서비스가 모듈화 되어있어 서비스 개발을 빠르게 하며, 유지보수가 쉽다.

- 팀 단위로 적절한 수준에서 기술 스택을 다르게 가져갈 수 있다.

- 독립적인 배포가 가능하다.

- 개별적인 scale-out이 가능하다.

MSA의 단점:

- 모놀리식에 비해 상대적으로 많이 복잡한 구조이다.

- 서비스의 연결을 위해서는 통신이 포함되기 때문에 트랜잭션을 유지하는게 힘들다.

- 통합 테스트가 힘들다.

- 실제 운영 환경에 배포하면, 다른 서비스들과의 연계가 잘 이루어지고 있는지 확인해야하기 때문에 배포가 쉽지 않다.

<br>

출처 : https://wooaoe.tistory.com/57
