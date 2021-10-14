package practice.task2;

public class User {
    private String login;
    private String password;

    void createQuery() {
        class Query {
            void printToLog() {
                System.out.println(
                        "Пользователь " + login +
                                " с паролем " + password +
                                " отправил запрос"
                );
            }
        }
        new Query().printToLog();
    }



    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
    }
}
