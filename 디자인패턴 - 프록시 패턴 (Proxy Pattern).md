# 디자인 패턴 - 프록시 패턴 (Proxy Pattern)

-   Proxy는 우리말로 대리자, 대변인이라는 뜻이다.
-   Proxy는 흐름제어만 할 뿐, <span style="color: #E74C3C">결과값을 조작하거나, 변경시키면 안된다.</span>

<br>

-   Proxy는 실제 서비스와 같은 이름의 메서드를 구현한다. 이 때 인터페이스를 사용한다.
-   Proxy는 실제 서비스에 대한 참조 변수를 갖는다.
-   Proxy는 실제 서비스의 같은 이름을 가진 메서드를 호출하고, 그 값을 클라이언트에 돌려준다.
-   Proxy는 실제 서비스의 메서드 호출 전후에도 별도의 로직을 수행할 수 있다.

<br>

### 예시

IService.java

```
public interface IService {
    String runSystem();
}
```

Service.java

```
public class Service implements IService {
    @Override
    public String runSystem() {
        return "시스템을 실행합니다."
    }
}
```

Proxy.java

```
public class Proxy implements IService {
    IService service1;

    @Override
    public String runSystem() {
        System.out.println("대신실행 하겠습니다.")
        service1 = new Service();
        return service1.runSystem();
    }
}
```

Main.java

```
public class Main {
    public static void main(String[] args) {
        IService proxy = new Proxy();
        System.out.println(proxy.runSystem());
    }
}
```

<br>

-   인터페이스를 두어서 구체 클래스에 영향을 받지 않게 하였음.
-   Proxy를 통해 우회하여 접근하였다.
    -   OCP, DIP 원칙이 녹아져있음을 알 수 있다.

Main.java 실행결과

![image](https://user-images.githubusercontent.com/55949647/200527068-2962984d-7b80-41d3-97dd-b1c60b5456f6.png)

<br>

-   출처: https://limkydev.tistory.com/79
