package guru.springframework;

/**
 * Created by MJ on 2/1/24.
 */
public class Greeting {


    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(){
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name){
        return HELLO + " " + name;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
