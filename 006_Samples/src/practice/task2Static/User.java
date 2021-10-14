package practice.task2Static;

public class User {
    private static String login;
    private static String password;

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
        Query query = new Query();
        query.printToLog();

        Query query1 = new Query();
        query1.printToLog();
    }
}
