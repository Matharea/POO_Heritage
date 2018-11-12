public class Boat extends Vehicle{

    public Boat(String name, int kilometer){
        super(name, kilometer);
    }

    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}
