public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 79, 95, 70, 55, 21);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 60, 34, 34, 73);
        Gryffindor ronald = new Gryffindor("Рон Уизли", 16, 75, 65, 18, 3);

        Slytherin draco = new Slytherin("Драко Малфой", 64, 95, 98, 5, 86, 96, 64);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 43, 12, 29, 83, 76, 13, 36);
        Slytherin gregory = new Slytherin("Грегори Гойл", 96, 15, 35, 38, 7, 79, 67);

        Puffenduy zacharias = new Puffenduy("Захария Смит", 28, 14, 79, 19, 52);
        Puffenduy cedric = new Puffenduy("Седрик Диггори", 65, 98, 56, 89, 29);
        Puffenduy justin = new Puffenduy("Джастин Финч-Флетчли", 29, 79, 72, 30, 52);

        Kogtevran cho = new Kogtevran("Чжоу Чанг", 15, 8, 26, 83, 12, 86);
        Kogtevran padma = new Kogtevran("Падма Патил", 97, 66, 75, 17, 33, 54);
        Kogtevran marcus = new Kogtevran("Маркус Белби", 34, 93, 48, 18, 63, 39);

        PrintStudent(cho);
        CompareInFaculty(harry,ronald);
        CompareInFaculty(draco,gregory);
        CompareInFaculty(cedric,justin);
        CompareInFaculty(cho,marcus);
        CompareAllStudents(harry,draco);

    }

    public static void PrintStudent(Hogwarrts student) {
        System.out.println(student);
    }
    public static void CompareInFaculty(Gryffindor student1, Gryffindor student2 ){
        int sum1 = student1.getNobleness() + student1.getHonor() +student1.getBravery();
        int sum2 = student2.getNobleness() + student2.getHonor() + student2.getBravery();
        if (sum1>sum2){
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
    }

    public static void CompareInFaculty(Slytherin student1, Slytherin student2 ){
        int sum1 = student1.getCunning() + student1.getResolve() + student1.getAmbition() + student1.getResourcefulness() + student1.getLustForPower();
        int sum2 = student2.getCunning() + student2.getResolve() + student2.getAmbition() + student2.getResourcefulness() + student2.getLustForPower();
        if (sum1>sum2){
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        }
    }

    public static void CompareInFaculty(Puffenduy student1, Puffenduy student2 ){
        int sum1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
        if (sum1>sum2){
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        }
    }

    public static void CompareInFaculty(Kogtevran student1, Kogtevran student2 ){
        int sum1 = student1.getIntellect() + student1.getWisdom() + student1.getWit() + student1.getCreation();
        int sum2 = student2.getIntellect() + student2.getWisdom() + student2.getWit() + student2.getCreation();
        if (sum1>sum2){
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
    }
    public static void CompareAllStudents(Hogwarrts student1, Hogwarrts student2 ){
        int sum1 = student1.getMagic() + student1.getTransgression();
        int sum2 = student2.getMagic() + student2.getTransgression();
        if (sum1>sum2){
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        }
    }
}