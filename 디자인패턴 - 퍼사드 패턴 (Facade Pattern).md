# 디자인 패턴 - 퍼사드 패턴 (Facade Pattern)

-   Facade 라는 영어단어는 '(건물의) 정면' 이라는 뜻이다.
-   어떤 소프트웨어의 다른 커다란 코드 부분에 대하여 간략화된 인터페이스를 제공하는 디자인패턴.
-   간단하게 말하면 복잡한 소프트웨어를 사용할 수 있도록 간단한 인터페이스를 제공하는 것임.

<br>

### 실생활 예시

-   집에서 영화를 보려면 해야할 일
    1. TV리모콘 준비
        1. 일어서서 리모콘 찾기
        2. 제자리로 돌아와서 앉기
    2. TV 키기
        1. 리모콘으로 TV 켜기
        2. 다 보고난 뒤 TV 끄기
    3. 영화 결제하기
        1. 볼만한 영화 탐색
        2. 영화 선택
        3. 결제 프로세스
    4. 음료 준비하기
        1. 일어서서 냉장고로 가기
        2. 컵을 꺼내서 음료 담기
        3. 제자리로 와서 앉아서 마시기
    5. 팝콘 준비하기
        1. 팝콘 가져오기
        2. 팝콘 개봉하기
    6. 시청

<br>

관련한 내용들을 Class로 작성할 수 있을 것. (일부 생략)

<br>

-   리모콘 클래스

```
public class Remote_Control {
    public void Turn_On() {
        System.out.println("TV 키기");
    }
    public void Turn_Off() {
        System.out.println("TV 끄기");
    }
}
```

-   영화 클래스

```
public class Movie {
    private String name = "";

    public Movie(String name) {
        this.name = name;
    }

    public void Search_Movie() {
        System.out.println(name + " 영화를 찾다");
    }

    public void Charge_Movie() {
        System.out.println("영화 결제");
    }

    public void Play_Movie() {
        System.out.println("영화 재생");
    }
}
```

-   음료 클래스

```
public class Beverage {
    private String name = "";

    public Beverage(String name) {
        this.name = name;
    }

    public void Prepare() {
        System.out.println(name + "음료 준비 완료");
    }
}
```

-   되게 복잡하나, 우리가 하고싶은건 결국 영화를 보는 것

```
public class Facade {
    private String beverage_name = "";
    private String movie_name = "";

    public Facade(String beverage_name, String movie_name) {
        this.beverage_name = beverage_name;
        this.movie_name = movie_name;
    }

    public void View_Movie() {
        Beverage beverage = new Beverage(beverage_name);
        Remote_Control remote = new Remote_Control();
        Movie movie = new Movie(movie_name);

        beverage.Prepare();
        remote.Turn_On();
        movie.Search.Movie();
        movie.Charge_Movie();
        movie.Play_Movie();
    }
}
```

-   Facade 클래스 내에 영화를 보기 위한 프로세스를 다 담았음.
-   클라이언트는 어벤져스를 보면서 콜라를 먹기 위한 행동으로 다음의 간단한 코드만 이용하면 된다.

```
public class Facade {
    public void view() {
        Facade facade = new Facade("Coke", "Avengers");
        facade.View_Movie();
    }
}
```

정보 출처 : https://lktprogrammer.tistory.com/42
