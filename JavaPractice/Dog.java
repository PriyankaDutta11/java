public class Dog {
    String name;
    String color;

    Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    public static void main(String[] args){
        Dog myDog=new Dog("Bailey","Black");
        System.out.println("Dog's name:"+ myDog.name);
        System.out.println("Dog's color:"+ myDog.color);

    }
}
