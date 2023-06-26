public class HogwartsStudent {
    GryffindorFaculty[] gryffindorStudent = new GryffindorFaculty[3];
    hufflepuffFaculty[] hufflepuffStudent = new hufflepuffFaculty[3];
    RavenClawFaculty[] ravenClawStudent = new RavenClawFaculty[4];
    SlytherinFaculty[] slytherinStudent = new SlytherinFaculty[4];

    public void compareBasicAbilities(Hogwarts hogwartsStudent1, Hogwarts hogwartsStudent2){
        if(hogwartsStudent1.getBasicAbilities() > hogwartsStudent2.getBasicAbilities()){
            System.out.println("Студент " + hogwartsStudent1.getName() + " лучше студента " + hogwartsStudent2.getName());
        } else if (hogwartsStudent1.getBasicAbilities() < hogwartsStudent2.getBasicAbilities()) {
            System.out.println("Студент " + hogwartsStudent2.getName() + " лучше студента " + hogwartsStudent1.getName());
        } else if (hogwartsStudent1.getBasicAbilities() == hogwartsStudent2.getBasicAbilities()) {
            System.out.println("Студент " + hogwartsStudent2.getName() + " равен студенту " + hogwartsStudent1.getName());
        }
    }
    public void compareUniceAbilitiesGryffindor(GryffindorFaculty student, GryffindorFaculty student2 ){
        if(student.getUniceAbility() > student2.getUniceAbility()){
            System.out.println("Студент " + student.getName() + " лучше студента " + student2.getName());
        } else if (student.getUniceAbility() < student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " лучше студента " + student.getName());
        } else if (student.getUniceAbility() == student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " равен студенту " + student.getName());
        }
    }
    public void compareUniceAbilitiesHufflepuff(hufflepuffFaculty student, hufflepuffFaculty student2 ){
        if(student.getUniceAbility() > student2.getUniceAbility()){
            System.out.println("Студент " + student.getName() + " лучше студента " + student2.getName());
        } else if (student.getUniceAbility() < student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " лучше студента " + student.getName());
        } else if (student.getUniceAbility() == student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " равен студенту " + student.getName());
        }
    }
    public void compareUniceAbilitiesRavenClaw(RavenClawFaculty student, RavenClawFaculty student2 ){
        if(student.getUniceAbility() > student2.getUniceAbility()){
            System.out.println("Студент " + student.getName() + " лучше студента " + student2.getName());
        } else if (student.getUniceAbility() < student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " лучше студента " + student.getName());
        } else if (student.getUniceAbility() == student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " равен студенту " + student.getName());
        }
    }
    public void compareUniceAbilitiesSlytherin(SlytherinFaculty student, SlytherinFaculty student2 ){
        if(student.getUniceAbility() > student2.getUniceAbility()){
            System.out.println("Студент " + student.getName() + " лучше студента " + student2.getName());
        } else if (student.getUniceAbility() < student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " лучше студента " + student.getName());
        } else if (student.getUniceAbility() == student2.getUniceAbility()) {
            System.out.println("Студент " + student2.getName() + " равен студенту " + student.getName());
        }
    }
}
