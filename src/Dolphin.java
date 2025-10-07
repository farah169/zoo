public class Dolphin extends Aquatic {

    float swimmingSpeed;

    public Dolphin() {
        super();
        this.swimmingSpeed = 0.0f;
    }

    // Instruction 22: Parameterized constructor
    public Dolphin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    @Override
    public String toString() {
        return "Dolphin{family='" + getFamily() + "', name='" + getName() +
                "', age=" + getAge() + ", isMammal=" + isMammal() +
                ", habitat='" + habitat + "', swimmingSpeed=" +
                swimmingSpeed + " km/h}";
    }
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

}
