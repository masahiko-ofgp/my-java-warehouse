public class MyClass {
    static class Person {
        String name;
        String email;

        Person(String newName, String newEmail) {
            this.name = newName;
            this.email = newEmail;
        }
        void printData() {
            System.out.println(
                    "Name: " + this.name + "\nEmail: " + this.email
                    );
        }
        String getName() {
            return this.name;
        }
        String getEmail() {
            return this.email;
        }
    }
    public static void main(String[] args) {
        Person tom = new Person("Tom", "tom@tom.com");
        tom.printData();
        System.out.println(tom.getName());
        System.out.println(tom.getEmail());
    }
}
