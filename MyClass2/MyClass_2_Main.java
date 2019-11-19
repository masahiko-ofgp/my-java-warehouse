public class MyClass_2_Main {
    public static void main(String[] args) {
        Person foo = new Person();
        System.out.println(foo.getName());
        System.out.println(foo.getEmail());

        Person tom = new Person("Tom", "tom@tom.com");
        System.out.println(tom.getName());
        System.out.println(tom.getEmail());
    }
}
