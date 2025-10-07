public non-sealed class Aquatic extends Animal{

    protected String habitat;

    public Aquatic(){
        super();
        this.habitat = "penguin";
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return "Aquatic{family='" + getFamily() + "', name='" + getName() +
                "', age=" + getAge() + ", isMammal=" + isMammal() +
                ", habitat='" + habitat + "'}";
    }
    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }

}
