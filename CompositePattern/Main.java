package CompositePattern;

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
