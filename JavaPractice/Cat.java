public class Cat {

    String name;
    int age;
    Cat(){
        this.name="Unknown";
        this.age=0;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
     public static void main(String[] args){
        Cat cat = new Cat();
        System.out.println("Name of the cat is:"+cat.getName());
        System.out.println("Age of the cat is:"+cat.getAge());

    }

}
