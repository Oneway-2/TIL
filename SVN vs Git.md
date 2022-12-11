# SVN, Git 차이

## 일단 공통점은?

-   둘 다 형상관리 툴이다.

### 형상관리란?

-   영어로 Version Control Revision Control
-   소프트웨어의 버전관리를 뜻함.
-   소스코드의 변화를 관리하는 것.

### 그게 왜 필요한지?

-   소스를 버전 별로 관리할 수 있음
-   그래서 소스가 삭제되거나, 수정되었을 때 그리고 과거 버전으로 복구하고 싶을 때 유용함.
-   여럿이서 개발을 하는 경우, 누가 어느 부분을 수정했는지 관리가 됨.
-   그래서 코드 병합, 코드 리뷰를 할 때 용이함.

### 형상관리 툴의 종류

-   Client/Server 타입
    -   Subversion(SVN), CVS, Perforce, ClearCase, TFS
-   분산저장소 타입
    -   Git,. Mercurial, Bitkeeper, SVK, Darcs
-   Folder 공유 타입
    -   RCS, SCCS

</br>

## 차이점

1. SVN은 중앙서버를 이용해 소스코드를 보관, Git은 여러 분산 서버와 PC 로컬저장소를 통해 소스코드를 보관
    - SVN에선 Commit을 하면 바로 서버와 연동됨.
    - Git에선 Commit을 하더라도 push 하기 전까지는 서버에 영향을 미치지 않음
    - 그래서 commit을 할 때 더욱 신중해야 하는 것은 SVN이다.
    - 사본을 로컬에서 관리하는 Git은 SVN보다 소스코드에 더 빨리 접근할 수 있음.

</br>

2. SVN은 version history를 가지지 않으나, Git은 가짐.
    - 그래도 SVN에서도 몇 일 전까지의 history는 확인 가능.
    - 그러나 확인만 가능. 그것을 다시 복구하거나 하는 행위 불가능
    - Git은 원하는 순간에 history를 통해 이전 소스코드를 보거나, 이용할 수 있음

</br>

3. Git이 SVN보다 더 빠르고, 많은 기능을 가지는 것처럼 보임.
    - 그래서 Git이 SVN보다 좀 더 사용하기 힘듬.
    - 이용하기 위해 공부가 더 필요한 것은 Git 이다.

</br>

reference

https://hahahoho5915.tistory.com/40
