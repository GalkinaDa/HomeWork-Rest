import ru.netology.services.RestService;

public class Main {

    public static void main(String[] args) {
        RestService service = new RestService();

        int income = 10000;
        int expense = 3000;
        int threshold = 20000;

        int rest = service.calculate(income, expense, threshold);
        System.out.println(rest);
    }

}
