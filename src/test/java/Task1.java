public class Task1 {
    public static void main(String[] args) {
        String name = "Tinatin";
        int age = 25;
        String programmingLanguage = "Java";

        System.out.println(name);
        System.out.println(age);
        System.out.println(programmingLanguage);
    }
}
/* მეორე ვარიანტი
        System.out.println("Tinatin");
        System.out.println(25);
        System.out.println("Java");
*/

/* მესამე ვარიანტი - ცალ-ცალკე მეთოდებად გატანა:
        name();
        age();
        programmingLanguage();

    public static void name() {
        String name = "Tinatin";
        System.out.println(name);
    }
    public static void age() {
        int age = 25;
        System.out.println(age);
    }
    public static void programmingLanguage() {
        String programmingLanguage = "Java";
        System.out.println(programmingLanguage);
    }
*/