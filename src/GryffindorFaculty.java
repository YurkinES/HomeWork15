public class GryffindorFaculty extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;
    public GryffindorFaculty(String name, int magicPower, int transgressionsDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionsDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public int getUniceAbility() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Благородство: " + nobility + " Честь: " + honor + " Храбрость: " + bravery;
    }

    @Override
    public void printStudentCharacter() {
        super.printStudentCharacter();
        System.out.println(" Уникальные черты Гриффиндора: " + " Благородство: " + nobility + " Честь: " + honor
                + " Храбрость: " + bravery);

    }


}
