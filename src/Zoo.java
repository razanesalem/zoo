import java.util.Arrays;

public class Zoo {
    Animal[] animals; // tableau polymorphe
    String name;
    String city;
    int nbrCages = 2;
    int nbAnimal;

    static int nbanimaltot;


    public Zoo(String name, String city) {
        animals = new Animal[this.nbrCages];
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void addAnimal(Animal a) {
        this.nbAnimal = 0;
        if (this.nbAnimal < this.nbrCages) {
            this.animals[this.nbAnimal] = a;
            this.nbAnimal++;
            nbanimaltot++;
        } else {
            System.out.println("Zoo is full");
        }
    }
    public int chercherAnimal( Animal animal) {
        for (int i=0; i<this.nbrCages; i++) {
            if(this.animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        boolean success = false;

        for (int i = 0; i < this.nbAnimal; i++) {
            if (this.animals[i] != null && this.animals[i].equals(animal)) {
                this.animals[i] = null;
                success = true;
                break;
            }
        }

        if (success) {
            for (int i = 0; i < this.nbAnimal - 1; i++) {
                if (this.animals[i] == null) {
                    this.animals[i] = this.animals[i + 1];
                    this.animals[i + 1] = null;
                }
            }
            this.nbAnimal--;
        }

        return success;
    }

    public void Add1animal (Animal animal) {
        for (int i=0; i<this.nbrCages; i++) {
            if(animals[i] != null && animals[i].equals(animal)) {
                System.out.println("Animal existant");
            }else {
                this.addAnimal(animal);
            }
        }

    }

    public int getNBaquatics(){
        int nbaq=0;
        for (int i=0;i<this.nbAnimal;i++){
            if (this.animals[i] instanceof Aquatic)
                nbaq ++;
        }
            return nbaq;
    }

    public float getQuantiteTotale(){
        int nbqte=0;
        for (int i=0;i<nbAnimal;i++){
            if(this.animals[i] instanceof Terrestrial)
            {
                Terrestrial t = (Terrestrial) this.animals[i];
                nbqte += t.getQuantiteConsoT();
            }
            if(this.animals[i] instanceof Aquatic)
            {
                Aquatic a = (Aquatic) this.animals[i];
                nbqte += a.getQuantiteConsoA();
            }
        }
        return  nbqte;

    }
}