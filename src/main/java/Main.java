public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Ivan";
        post.surname = "Ivanov";
        post.patronymic = "Ivanovich";
        post.passport = "1234 #567890";
        post.contactPhone = "+1(234)567-89-00";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }

}
