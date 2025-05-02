package guru.springframework.spring6di.controller.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat","ES"})
@SpringBootTest // this will try to load all beans in my project so I need to specify which i18NService I want to load as well
class FauxControllerTest {
    @Autowired
    FauxController fauxController;

    @Test
    void getDatasource() {
        System.out.println(fauxController.getDatasource());
    }
}