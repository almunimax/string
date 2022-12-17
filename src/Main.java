public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");

        String firstName = "ivan";
        String middleName = "Ivanovich";
        String lastName = "ivanov";
        String fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Задание 2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName.toUpperCase());

        System.out.println("Задание 3");

        String fullNameRus = "Иванов Семён Семёнович";
        String  nameTrue = fullNameRus.replace("ё","е");

        System.out.println(nameTrue);






    }
}