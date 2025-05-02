package guru.springframework.spring6di.controller.datasource;
import guru.springframework.spring6di.services.datasources.Datasource;
import org.springframework.stereotype.Controller;

//
//import guru.springframework.spring6di.services.datasources.Datasource;
//import org.springframework.stereotype.Controller;
//
//
//@Controller
//public class FauxController {
//
//    private final Datasource datasource;
//
//    public FauxController(Datasource datasource) {
//        this.datasource = datasource;
//    }
//
//    public String getDatasource() {
//        return datasource.getDatasource();
//    }
//}
@Controller
public class FauxController {

    private final Datasource datasource;

    public FauxController(Datasource datasource) {
        this.datasource = datasource;
    }

    public String getDatasource(){
        return datasource.getDatasource();
    }
}