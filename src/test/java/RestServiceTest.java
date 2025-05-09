import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestService;

public class RestServiceTest {

    @Test
    void shouldCalculateRestsOfYear() {
        RestService service = new RestService();

        int income = 10000;
        int expense = 3000;
        int threshold = 20000;
        int expected = 3;

        long actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

