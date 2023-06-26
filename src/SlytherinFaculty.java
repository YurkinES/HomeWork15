public class SlytherinFaculty extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    public SlytherinFaculty(String name, int magicPower, int transgressionsDistance, int cunning, int determination,
                            int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionsDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public int getUniceAbility() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Хитрость: " + cunning + " Решительность: " + determination + " Амбициозность: " + ambition
                + " Находчивость: " + resourcefulness + " Жажда власти: " + thirstForPower;
    }

    @Override
    public void printStudentCharacter() {
        super.printStudentCharacter();
        System.out.println(" Уникальные черты Слизерина: " + " Хитрость: " + cunning + " Решительность: " + determination +
                " Амбициозность: " + ambition + " Находчивость: " + resourcefulness + " Жажда власти: " + thirstForPower);
    }
}
