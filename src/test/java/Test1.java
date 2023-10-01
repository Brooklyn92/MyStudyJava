import io.qameta.allure.Link;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Link("https://mail.ru/")
    @Test
    public void  myFirstTest() {
        Assertions.assertTrue(true, "Тест прошёл успешно");
    }
}
