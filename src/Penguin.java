public class Penguin extends Aquatic {

    float swimmingDepth;

    public Penguin() {
        super();
        this.swimmingDepth = 0.0f;
    }

    // Instruction 22: Parameterized constructor
    public Penguin(String family, String name, int age, boolean isMammal,
                   String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return "Penguin{family='" + getFamily() + "', name='" + getName() +
                "', age=" + getAge() + ", isMammal=" + isMammal() +
                ", habitat='" + habitat + "', swimmingDepth=" +
                swimmingDepth + " meters}";
    }
}
