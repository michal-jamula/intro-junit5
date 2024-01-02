package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;
    @BeforeAll
    public static void beforeClass() {
        System.out.println("-----Before - this is only called once-----");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each method : ");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("Michal"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each method :");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("-----After - this is only called once-----");
    }
}