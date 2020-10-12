public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Michal", "Zone", false);
        Person person2 = new Person("Tomasz", "Ika", false);
        Person person3 = new Person("Agata", "Notec", true);
        Person person4 = new Person("Kasia", "Figura", false);
        //Tasks tasks1 = new Tasks("Skarpetki","Znaleźć, wyprać, schować", 0, "")

        Tasks tasks1 = new Tasks("Porządek ze skarpetkami", "Znaleźć, wyprać, schować", 0, person3);
        Tasks tasks2 = new Tasks("Strona www dla ING", "Wizualizacja / statyczna strona ", 1, person4);
        Tasks tasks3 = new Tasks("Dyska", "Zaprosić Anię ", 1, person2);
        Tasks tasks4 = new Tasks("Zakupy", "coś na przekąskę", -1, person2);

        AppTask appTask = new AppTask();
        System.out.println("--------- Czy zadanie ma wysoki priorytet? -------");
        System.out.println("Zadanie '" + tasks1.getCaption() + ": " + appTask.highPriority(tasks1));
        System.out.println("Zadanie '" + tasks2.getCaption() + ": " + appTask.highPriority(tasks2));
        System.out.println("Zadanie '" + tasks3.getCaption() + ": " + appTask.highPriority(tasks3));
        System.out.println("Zadanie '" + tasks4.getCaption() + ": " + appTask.highPriority(tasks4));

        System.out.println("--------- Czy zadanie ma normalny priorytet? -------");
        System.out.println("Zadanie '" + tasks1.getCaption() + ": " + appTask.mediumPriority(tasks1));
        System.out.println("Zadanie '" + tasks2.getCaption() + ": " + appTask.mediumPriority(tasks2));
        System.out.println("Zadanie '" + tasks3.getCaption() + ": " + appTask.mediumPriority(tasks3));
        System.out.println("Zadanie '" + tasks4.getCaption() + ": " + appTask.mediumPriority(tasks4));

        System.out.println("--------- Czy zadanie ma niski priorytet? -------");
        System.out.println("Zadanie '" + tasks1.getCaption() + ": " + appTask.lowPriority(tasks1));
        System.out.println("Zadanie '" + tasks2.getCaption() + ": " + appTask.lowPriority(tasks2));
        System.out.println("Zadanie '" + tasks3.getCaption() + ": " + appTask.lowPriority(tasks3));
        System.out.println("Zadanie '" + tasks4.getCaption() + ": " + appTask.lowPriority(tasks4));









    }
}
