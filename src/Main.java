public class Main {
    public static void main(String[] args) {
        HogwartsStudent hogwartsStudent = new HogwartsStudent();
        hogwartsStudent.gryffindorStudent[0] = new GryffindorFaculty("Harry Potter", 76, 48,
                55,56,87);
        hogwartsStudent.gryffindorStudent[1] = new GryffindorFaculty("Hermione Granger",64, 56,
                68,72, 60);
        hogwartsStudent.gryffindorStudent[2] = new GryffindorFaculty("Ron Weasley",50,38,
                48, 47, 73);
        hogwartsStudent.ravenClawStudent[0] = new RavenClawFaculty("Zhou Chang", 48,51,
                58,44,45,69);
        hogwartsStudent.ravenClawStudent[1] = new RavenClawFaculty("Padma Patil", 88, 77,
                67,78,81,90);
        hogwartsStudent.ravenClawStudent[2] = new RavenClawFaculty("Marcus Belby", 65,61,
                55,62,63,76);
        hogwartsStudent.slytherinStudent[0] = new SlytherinFaculty("Draco Malfoy", 68,56,78,
                87,98,50, 93);
        hogwartsStudent.slytherinStudent[1] = new SlytherinFaculty("Graham Montague", 51,37,
                45,37,45,34,66);
        hogwartsStudent.slytherinStudent[2] = new SlytherinFaculty("Gregory Goyle",53,44,
                54,51,47,59,67);
        hogwartsStudent.hufflepuffStudent[0] = new hufflepuffFaculty("Zachariah Smith", 43,41,
                67,66,74);
        hogwartsStudent.hufflepuffStudent[1] = new hufflepuffFaculty("Cedric Diggory", 45,55,
                57,38,33);
        hogwartsStudent.hufflepuffStudent[2] = new hufflepuffFaculty("Justin Finch-Fletchley", 59,61,
                66,79,81);
        hogwartsStudent.gryffindorStudent[0].printStudentCharacter();
        hogwartsStudent.compareBasicAbilities(hogwartsStudent.gryffindorStudent[1], hogwartsStudent.ravenClawStudent[2]);
        hogwartsStudent.compareUniceAbilitiesGryffindor(hogwartsStudent.gryffindorStudent[0], hogwartsStudent.gryffindorStudent[2]);


    }
}