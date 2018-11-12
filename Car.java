public class Car extends Vehicle{

    public Car(String name, int kilometer){
        super(name, kilometer);
    }

    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}
