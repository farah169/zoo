import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        int nbrCages = 20;
        String zooName = " zoo";

        ZooManagement zooManagement = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("entrer le nom du zoo : ");
            String s = scanner.nextLine();
            if (!s.isEmpty()) {
                zooName = s;
                break;
            } else {
                System.out.println("zooName doit etre une chaine non vide ");
            }
        }
        while (true){
            System.out.println("entrer le nombre de cages : ");
            int i = scanner.nextInt();
            if (i > 0){
                nbrCages = i;
                break;
            }
            else {
                System.out.println("le nombre de cages doit etre superieur a 0 ");
            }
        }
        Animal lion = new Animal();
        lion.setFamily("king");
        lion.setName("simba");
        lion.setAge(5);
        lion.setMammal(true);

        Zoo myzoo2 = new Zoo();
        myzoo2.setName("mehdizoo");
        myzoo2.setCity("tunis");
        //myzoo2.nbrCages = 25;
        myzoo2.setAnimals(new Animal[5]);

        Zoo myzoo = new Zoo("myZoo", "tunis" );
        Animal tiger = new Animal("siberian", "tiger",4, true);
        Animal elephant = new Animal("african", "elephant", 4, false);
        Animal eagle = new Animal("bald", "eagle", 2, true);

        //myzoo.displayZoo();
        System.out.println(myzoo);
        System.out.println(myzoo.toString());
        System.out.println(tiger);
        System.out.println(tiger.toString());

        for (int i = 0; i < 25; i++) {
            Animal a = new Animal();
            boolean result = myzoo.addAnimal(a);
            if (!result) {
                System.out.println("Impossible d'ajouter l'animal " + i);
            }
        }
        myzoo2.afficherAnimaux();
        Animal girafe = new Animal("savannah", "giraffe", 6, true);
        myzoo2.addAnimal(girafe);

        int index = myzoo2.searchAnimal(girafe);
        System.out.println("Giraffe trouvée à l’indice : " + index);
        Animal giraffe2 = new Animal("savannah", "giraffe", 6, true);

        int index2 = myzoo2.searchAnimal(giraffe2);
        System.out.println("Giraffe2 trouvée à l’indice : " + index2);

        myzoo2.removeAnimal(girafe);
        System.out.printf(zooName + " comporte " + nbrCages + " cages ");

        Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        Aquatic aquatic2 = new Aquatic("Fish", "Nemo", 3, false, "ocean");
        Terrestrial terrestrial2 = new Terrestrial("snake", "youssef", 5, false,0);
        Dolphin dolphin2 = new Dolphin("Cetacea", "Flipper", 8, true, "sea", 60.5f);
        Penguin penguin2 = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctic", 250.0f);

        System.out.println(aquatic2);
        System.out.println(terrestrial2);
        System.out.println(dolphin2);
        System.out.println(penguin2);
        System.out.println();

        System.out.print("Aquatic: ");
        aquatic2.swim();
        System.out.print("Dolphin: ");
        dolphin2.swim();


        Dolphin dolphin3 = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 40.5f);
        Dolphin dolphin4= new Dolphin("Delphinidae", "Dolly", 8, true, "Sea", 35.0f);
        Dolphin dolphin5 = new Dolphin("Delphinidae", "Marina", 3, true, "Ocean", 38.2f);

        Penguin penguin3 = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctica", 150.0f);
        Penguin penguin4 = new Penguin("Spheniscidae", "Happy Feet", 2, false, "Antarctica", 200.5f);
        Penguin penguin5 = new Penguin("Spheniscidae", "Skipper", 6, false, "Antarctica", 180.0f);

        myzoo.addAquaticAnimal(dolphin3);
        myzoo.addAquaticAnimal(dolphin4);
        myzoo.addAquaticAnimal(dolphin5);
        myzoo.addAquaticAnimal(penguin3);
        myzoo.addAquaticAnimal(penguin4);
        myzoo.addAquaticAnimal(penguin5);

        myzoo.displayZoo();

        Aquatic[] aquatics = myzoo.getAquaticAnimals();
        for (int i = 0; i < myzoo.getAquaticCount(); i++) {
            System.out.print(aquatics[i].getName() + ": ");
            aquatics[i].swim();
        }

        float maxDepth = myzoo.maxPenguinSwimmingDepth();
        myzoo.displayNumberOfAquaticsByType();

        Penguin penguin6 = new Penguin("Spheniscidae", "Pingu", 4, false, "Antarctica", 150.0f);
        Penguin penguin7 = new Penguin("Spheniscidae", "Different", 4, false, "Antarctica", 150.0f);

        System.out.println("penguin1.equals(penguin4): " + penguin1.equals(penguin4));





    }
}
