package Object9;

public class Main2 {
    public static void main(String[] args) {
        UserService haha = new UserService(){
            @Override
            public void eat() {

            }
        };
        //interface cannot be newed? It can be newed! But in a different way... --- anonymous class
    }
}
interface UserService{
    public void eat();
}
