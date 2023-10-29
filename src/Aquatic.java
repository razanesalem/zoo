public class Aquatic extends Animal {
   private String habitat;
   int poids;


    public Aquatic() {
       // System.out.println("animal aquatic");
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString()+  "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void getType(){
        System.out.println("aquatic");
    }

    public float getQuantiteConsoA(){
        return this.poids *50;

    }
}
