# 디자인 패턴 - 컴포지트 패턴 (Composite Pattern)

-   Composite 란 영어사전상 "복합체" 라는 뜻.
-   소프트웨어적으로는 하나 이상의 유사한 객체를 구성으로 설계된 객체로서, 모두 유사한 기능을 나타내는 것을 뜻한다.
-   즉, 객체 그룹을 조작하는 것처럼 단일 객체를 조작할 수 있음.

<br>

-   컴포지트 패턴은 클라이언트가 복합 객체나 단일 객체를 동일하게 취급하는 것을 목적으로 함.
-   이 때, 컴포지트의 의도는 "트리 구조"로 작성하여, 전체-부분(whole-part) 관계를 표현하는 것이다.
-   즉, <span style="font-weight:bold">전체-부분 관계를 효율적으로 정의할 때 컴포지트 패턴은 유용하다.</span>

<br>

-   Composite 패턴에는 3가지로 구조가 나뉘어져있다.
    1. <span style="font-weight:bold">Component</span>
        - 구체적인 부분
        - Leaf 클래스와 Composite 클래스의 공통 인터페이스임
    2. <span style="font-weight:bold">Leaf</span>
        - 구체적인 부분 클래스
        - Composite 객체의 부품
    3. <span style="font-weight:bold">Composite</span>
        - 전체 클래스.
        - 여러개의 Component를 갖도록 정의한다.
        - 그래서 여러개의 Leaf, 여러개의 Composite를 부분으로 가질수도 있다.

<br>

### 예시

-   강아지와 고양이는 동물이다.
-   강아지그룹, 고양이그룹에 각각 2마리, 3마리 넣는다.
-   두 그룹을 동물원에 넣는다.
-   동물원 내의 동물들을 모두 speak 하게 만들면?

Component: IAnimal.java

```
// Component 역할
interface IAnimal {
    public void speak();
}
```

Leaf: Cat.java

```
public class Cat implements IAnimal{
    @Override
    public void speak() {
        System.out.println("야옹");
    }
}
```

Leaf: Dog.java

```
public class Dog implements IAnimal{
    @Override
    public void speak() {
        System.out.println("멍멍");
    }
}
```

Composite: AnimalGroup.java

```
// Composite 역할
public class AnimalGroup implements IAnimal {

    private List<IAnimal> animalGroup = new ArrayList<IAnimal>();

    public void speak() {
        for (IAnimal animal : animalGroup) {
            animal.speak();
        }
    }

    public void add(IAnimal animal) {
        animalGroup.add(animal);
    }

    public void remove(IAnimal animal) {
        animalGroup.remove(animal);
    }
}
```

Client: Main.java

```
public class Main {
    public static void main(String[] args) {

        // 강아지그룹, 고양이그룹 생성
        AnimalGroup dog_group = new AnimalGroup();
        AnimalGroup cat_group = new AnimalGroup();

        // 강아지 2마리, 고양이 3마리 만들어서 각 그룹에 넣기
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        dog_group.add(dog1);
        dog_group.add(dog2);

        cat_group.add(cat1);
        cat_group.add(cat2);
        cat_group.add(cat3);

        // 강아지그룹과 고양이그룹을 동물원이라는 그룹안에 넣겠음
        AnimalGroup zoo = new AnimalGroup();
        zoo.add(dog_group);
        zoo.add(cat_group);

        // 동물원의 모든 동물들을 speak 해보겠음
        zoo.speak();
    }
}
```

결과는 다음과 같이 나온다.

```
멍멍
멍멍
야옹
야옹
야옹
```

-   출처 : https://www.youtube.com/watch?v=XXvrHAsfTso
-   출처 : https://mygumi.tistory.com/343
-   출처 : https://gmlwjd9405.github.io/2018/08/10/composite-pattern.html
