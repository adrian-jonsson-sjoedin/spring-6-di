package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("qa")
@Service
public class QaDatasourceImpl implements Datasource {
    @Override
    public String getDatasource() {
        return "This is the QA datasource";
    }
}
