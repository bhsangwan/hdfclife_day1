public class Dog extends Animal{

    public Dog(){}

    public Dog(String name){
        super(name);
    }
    public void makeNoise(){
        System.out.println("Bhow Bhow");
    }
    public void roam(){
        System.out.println(getName()+" is roaming in steets");
    }
    public void eat(){
        System.out.println(getName()+" eating breads");
    }
    public void play(){
        System.out.println(getName()+" is playing..!");
    }
}
