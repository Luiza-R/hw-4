package geekbrains;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Cправочник: ");
        Phonebook phonebook = new Phonebook();

        phonebook.add("Кондратьева", "7(495)953-48-79");
        phonebook.add("Антонова", "7(495)329-56-29");
        phonebook.add("Гаврилова", "7(495)824-11-71");
        phonebook.add("Рыбакова", "7(495)327-33-99");
        phonebook.add("Рыбакова", "7(495)476-25-99");

        System.out.println("Журавлева");
        System.out.println(phonebook.get("Журавлева"));
        System.out.println("Антонова");
        System.out.println(phonebook.get("Антонова"));
        System.out.println("Рыбакова");
        System.out.println(phonebook.get("Рыбакова"));
    }
}
