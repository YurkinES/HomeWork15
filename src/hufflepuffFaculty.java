public class hufflepuffFaculty extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public hufflepuffFaculty(String name, int magicPower, int transgressionsDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionsDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public int getUniceAbility() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " Трудолюбие: " + diligence + " Верность: " + loyalty + " Честность: " + honesty;
    }

    @Override
    public void printStudentCharacter() {
        super.printStudentCharacter();
        System.out.println(" Уникальные черты Пуффендуя: " + " Трудолюбие: " + diligence + " Верность: " +
                loyalty + " Честность: " + honesty);
    }
}
