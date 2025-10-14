public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    public static final int NBRCAGES =25;
    private int nbrAnimals;
    private Aquatic [] aquaticAnimals;
    private int aquaticCount;

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getAquaticCount() {
        return aquaticCount;
    }

    public void setAquaticCount(int aquaticCount) {
        this.aquaticCount = aquaticCount;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo() {
        animals = new Animal[NBRCAGES];
    }

    public Zoo( String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;

    }

    public Zoo(Animal[] animals, String name, String city, int nbrAnimals) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrAnimals = nbrAnimals;
    }

    public void displayZoo(){
        System.out.println("zoo name : " + this.name);
        System.out.println("zoo city : " + this.city);
        System.out.println("nbrCages : " + this.NBRCAGES);
    }
    @Override
    public String toString() {

        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + NBRCAGES + "}";
    }

    boolean addAnimal(Animal animal){

        // Vérifier si le zoo est plein
        /*if (nbrAnimals >= NBRCAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter " +animal.name);
            return false;
        }*/
        if (isZooFull()) {
            System.out.println("Zoo plein. Impossible d’ajouter l’animal.");
            return false;
        }

        // Vérifier si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal " + animal.getName() + " existe déjà dans le zoo");
            return false;
        }

        // Ajouter l'animal
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;

    }

    public void afficherAnimaux() {
        if (nbrAnimals == 0) {
            System.out.println("Le zoo ne contient aucun animal.");
        } else {
            System.out.println("Animaux présents dans le zoo " + name + " :");
            for (int i = 0; i < nbrAnimals; i++) {
                System.out.println("- " + animals[i]);
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null &&
                    animals[i].getName() != null &&
                    animal.getName() != null &&
                    animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal (Animal animal){
        int index = searchAnimal(animal);
        if (index != -1){
            animals[index] = null;
            nbrAnimals--;
            System.out.println("animal supprimé");
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBRCAGES;
    }

    public void addAquaticAnimal(Aquatic aquatic) {

        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println(" added: " + aquatic.getName());
        } else {
            System.out.println(" it is full!");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;

        for (int i = 0; i < aquaticCount; i++) {
            // Utilisation de instanceof pour vérifier le type
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i]; // Cast
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
        System.out.println("Total Aquatics: " + aquaticCount);
    }
}
