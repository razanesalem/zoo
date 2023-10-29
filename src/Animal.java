public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
        System.out.println("animal ");

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
    public boolean comparerAnimal(Animal a1, Animal a2) {
        if (a1.age==a2.age && a1.family.equals(a2.family)) {
            return true;
        }else
            return false;
    }

    //to do2 : corriger la def de equals
    @Override
    public boolean equals (Object a) {
        if (this.age==a.age && this.family.equals(a.family)) {
            return true;
        }else
            return false;
    }

    public void getType(){
        System.out.println("Animal" );
    }


    //// ????????? to do1
    public float getQuantiteConso(){
        return super.age *20;

    }

}
