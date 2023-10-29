public class Terrestrial extends Animal{
    int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {
       // System.out.println("animal terrestre");
    }


    @Override
    public String toString() {
        return "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                "} " + super.toString();
    }

    public float getQuantiteConsoT(){
        return this.nbrLegs *20;

    }

}
