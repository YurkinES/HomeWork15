public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionsDistance;

    public Hogwarts(String name, int magicPower, int transgressionsDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionsDistance = transgressionsDistance;
    }
    public int getBasicAbilities(){
        return magicPower + transgressionsDistance;
    }
    public abstract int getUniceAbility();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionsDistance() {
        return transgressionsDistance;
    }

    public void setTransgressionsDistance(int transgressionsDistance) {
        this.transgressionsDistance = transgressionsDistance;
    }

    @Override
    public String toString() {
        return "Студент " + name + " Магическая сила: " + magicPower + " Расстояне трансгрессии: " +
                transgressionsDistance;
    }
    public void printStudentCharacter(){
        System.out.print("Студент " + name + " Магическая сила: " + magicPower + " Расстояне трансгрессии: "
                + transgressionsDistance);
    }

}
