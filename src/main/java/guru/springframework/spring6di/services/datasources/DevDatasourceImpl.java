package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class DevDatasourceImpl implements Datasource {
    @Override
    public String getDatasource() {
        return "this is the dev datasource";
    }
}
