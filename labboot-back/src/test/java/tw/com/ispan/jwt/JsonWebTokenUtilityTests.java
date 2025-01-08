package tw.com.ispan.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JsonWebTokenUtilityTests {
    @Autowired
    private JsonWebTokenUtility jsonWebTokenUtility;

    @Test
    public void testToken() {
        String token = jsonWebTokenUtility.createToken("hahaha");
        System.out.println("token="+token);

        try {
            Thread.sleep(61000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String subject = jsonWebTokenUtility.validateToken(token);
        System.out.println("subject="+subject);
    }

}
