public class Main {
    public static void main(String[] args) {
        // Создаем объект Post
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        // Заполняем данные о дате рождения
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        // Выводим информацию о заполненных данных анкеты
        System.out.println("Имя: " + post.name);
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Подписка на новости: " + post.subscription);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}
