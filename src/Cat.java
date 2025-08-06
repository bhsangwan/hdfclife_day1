public class Cat extends Animal{

    public Cat(){
        super();
    }

    public Cat(String name){
        super(name);
    }

    public void jump(){
        System.out.println(getName()+ " is jumping..!");
    }

    public void makeNoise(){
        System.out.println(getName()+" says - Meaun Meaun..!");
    }
}
