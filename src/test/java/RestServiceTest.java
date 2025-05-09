import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/rest.csv")
    public void shouldCalculateRestsOfYear(int expected, int income, int expense, int threshold) {
        RestService service = new RestService();

                int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

