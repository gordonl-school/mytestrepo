public class SomeClass {
    private int age;
    private String name;

    public SomeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String hello() {
        return "Hello " + name + ". You are " + age + " years old.";
    }

    public void partner1Method() {
        System.out.println("bing");
    }

    public void partner2() {
        System.out.println("hello");
    }
}
