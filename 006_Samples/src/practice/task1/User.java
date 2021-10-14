package practice.task1;

public class User {
    private String login;
    private String password;

    void createQuery() {
        new Query().printToLog();
    }

    class Query {
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
        Query query = user.new Query();
        query.printToLog();

        Query query1 = new User().new Query();
        query1.printToLog();
    }
}
