package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"prod", "default"})
@Service
public class ProdDatasourceImpl implements Datasource {

    @Override
    public String getDatasource() {
        return "This is the prod data source";
    }
}
