package ProxyPattern;

public class Proxy implements IService {
    IService service1;

    @Override
    public String runSystem() {
        System.out.println("대신호출 하겠슴.");
        service1 = new Service();
        return service1.runSystem();

    }
    
}
