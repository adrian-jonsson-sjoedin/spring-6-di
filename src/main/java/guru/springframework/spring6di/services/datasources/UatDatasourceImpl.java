package guru.springframework.spring6di.services.datasources;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatDatasourceImpl implements Datasource{
    @Override
    public String getDatasource() {
        return "This is the UAT datasource";
    }
}
