public class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
    class Main {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Dogs dogs = new Dogs();
            animal.makeSound();
            dogs.makeSound();
        }
    }


