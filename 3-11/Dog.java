public class Dog implements Animal{
    String name;
    int age;
    
    public void makeSound(){
        System.out.println("ワンワン");
    }
    public void eat(){
        System.out.println(name + "が餌を食べています");
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
}
