package practice.task2Static;

public class User {
    private static String login;
    private static String password;

    public static void setLogin(String login) {
        User.login = login;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    void createQuery() {
        new Query().printToLog();
    }

    static class Query {
        void printToLog() {
            System.out.println(
                    "Пользователь " + login +
                    " с паролем " + password +
                    " отправил запрос"
            );
        }
    }

    public static void main(String[] args) {
        User user = new User();
        User.setLogin("User");
        User.setPassword("Password");

        Query query = new Query();
        query.printToLog();
    }
}
