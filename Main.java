import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Dog name, age, and breed");
        String name = in.next();
        int age = in.nextInt();
        String breed = in.next();
        Dog a = new Dog(name,age,breed);
        String cont= "yes";
        while(cont.equals("yes")) {
            System.out.print("Hunger: "+a.getHungry()+" ");
            System.out.print("Energy: "+a.getEnergy());
            System.out.println(" Happiness: "+ a.getHappiness());
            if (a.feed_dog()) {
                System.out.println("Your dog is hungry, how much do you want to feed it? Max 5 at a time.");
                int food = in.nextInt();
                a.feed(food);
            }else{
                a.starve();
            }

            if(a.getEnergy()>=5){
                System.out.println("Your dog wants to play, will you take it to the park?(yes/no)");
                cont = in.next();
                if(cont.equals("yes")){
                    a.park();
                }else{
                    a.sad();
                }
                System.out.println("You come back and head to bed. ");

            }
            else{
                System.out.println("your dog is tired and will go to sleep.");
                a.sleep();
            }
            System.out.println("Continue to play the next day?");
            cont=in.next();
            if(cont.equals("no")){
                System.exit(0);
            }


            if(a.getHappiness()<=0||a.getEnergy()<=0||a.getHungry()<=0){
                System.out.println("You treated your dog bad and " +a.getName()+ " left you");
                System.exit(0);
            }
            System.out.println("---------------------------------");
            TimeUnit.SECONDS.sleep(2);




        }
    }
}