public class Dog {
    private String name;
    private int age;
    private int hungry=0;
    private int energy=0;
    private int happiness=0;
    public int getHungry(){
        return hungry;
    }
    public String getName(){
        return name;
    }
    public int getEnergy() {
        return energy;
    }
    public int getHappiness(){
        return happiness;
    }
    private String breed;
    public Dog(String name, int age, String breed){
        this.name=name;
        this.age=age;
        this.breed=breed;
        hungry=10;
        energy=10;
        happiness=10;
    }
    public boolean feed_dog(){
        if(hungry<=5){
            return true;
        }
        else{
            return false;
        }
    }

    public void feed(int food){
        hungry+=food;
    }

    public void starve(){
        hungry-=1;
    }

    public void park(){
        energy-=5;
    }

    public void sleep(){
        energy+=5;
    }
    public void sad(){
        happiness-=2;
    }
}
