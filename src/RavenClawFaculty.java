public class RavenClawFaculty extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public RavenClawFaculty(String name, int magicPower, int transgressionsDistance, int mind, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionsDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }

    @Override
    public int getUniceAbility() {
        return mind + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Ум: " + mind + " Мудрость: " + wisdom + " Остроумие: " + wit + " Творчество: " + creativity;
    }

    @Override
    public void printStudentCharacter() {
        super.printStudentCharacter();
        System.out.println(" Уникальные черты Когтеврана: " + " Ум: " + mind + " Мудрость: " + wisdom + " Остроумие: "
                + wit + " Творчество: " + creativity);
    }
}
