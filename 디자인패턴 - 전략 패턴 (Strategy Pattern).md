# 디자인패턴 - 전략 패턴 (Strategy Pattern)

-   객체들이 할 수 있는 행위에 대해 전략 클래스를 생성
-   유사한 행위들을 캡슐화 하는 인터페이스를 정의
-   객체의 행위를 동적으로 바꾸고 싶은 경우, 직접 행위를 수정하지 않는다.
-   전략 클래스를 바꿔주기만 함으로서 행위를 유연하게 확장한다.

<br>

### 예시:

-   Car와 Train은 움직인다는 공통점이 있음. -> Moveable 라는 인터페이스 지정

```
public interface Moveable {
    public void move();
}
```

-   Car와 Train 클래스에 move 구현

```
public class Car implements Moveable {
    public void move() {
        System.out.println("도로로 움직입니다.");
    }
}
```

```
public class Train implements Moveable {
    public void move() {
        System.out.println("선로로 움직입니다.");
    }
}
```

-   Client에 해당 내용을 구현

```
public class Client {
    public static void main(String args[]) {
        Movable train = new Train();
        Movable car = new Car();

        train.move();
        car.move();
    }
}
```

<br>

-   이 때, 시간이 흘러 날아다니는 차가 개발되었다고 가정하자.
-   그래서 Car의 move() 메서드를 다음과 같이 바꾸었다.

```
public class Car implements Movable {
    public void move() {
        System.out.println("하늘로 날아서 움직입니다.");
    }
}
```

-   하지만 이렇게 하면 SOLID의 원칙 중 OCP(Open Closed Principle)을 위배한다.
    -   요구사항의 변경이나 추가사항이 발생하더라도 기존 구성요소는 수정이 일어나지 말아야 한다는 의미.
-   따라서 전략 패턴을 활용하기 위해 다음처럼 구현한다.

<br>

-   MovableStrategy 인터페이스를 생성,

```
public interface MovableStrategy {
    public void move();
}
```

-   그것을 통해 이동수단에 대한 전략들을 구현한다. (이동방법이 확장될 경우를 고려하는 것)

```
public class RailLoadStrategy implements MovableStrategy {
    public void move() {
        System.out.println("선로로 움직입니다.")
    }
}
```

```
public class LoadStrategy implements MovableStrategy {
    public void move() {
        System.out.println("도로로 움직입니다.");
    }
}
```

```
public class FlyStrategy implements MovableStrategy {
    public void move() {
        System.out.println("하늘을 날아서 움직입니다.");
    }
}
```

-   차와 기차는 move() 메서드를 통해 움직일텐데, 그것을 직접 메서드로 구현하지 않는다.
-   어떻게 움직일지 전략을 설정하고, 그 전략의 움직임 방식을 사용하여 움직이도록 한다.
-   그 전략을 설정하는 메서드인 setMovableStrategy() 를 구현한다.

```
public class Moving {
    private MovableStrategy movableStrategy;

    public void move() {
        movableStrategy.move();
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}
```

```
public class Car extends Moving {

}
```

```
public class Train extends Moving {

}
```

-   그것을 Client로 구현하면 다음과 같다.

```
public class Client {
    public class void main(String args[]) {
        Moving train = new Train();
        Moving car = new Car();

        train.setMovableStrategy(new RailLoadStrategy());
        car.setMovableStrategy(new LoadStrategy());

        train.move();
        car.move();

        // 여기까지 기차는 선로로 움직이는 것으로, 차는 도로로 움직이는 것으로 설정되었음.
        // 근데 이후에 하늘을 나는 차가 개발됐다고 가정.

        car.setMovableStrategy(new FlyStrategy());
        car.move();
    }
}
```

<br>

-   이로서, 원래 move() 메서드 코드를 건들이지 않고 행위가 수정되었음.

####

참고 출처: https://victorydntmd.tistory.com/292
