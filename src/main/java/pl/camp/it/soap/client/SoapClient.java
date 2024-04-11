package pl.camp.it.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import pl.camp.it.soap.client.countries.Country;
import pl.camp.it.soap.client.countries.GetCountryRequest;
import pl.camp.it.soap.client.countries.GetCountryResponse;

public class SoapClient extends WebServiceGatewaySupport {

    public Country getCountry(String name) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(name);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate().marshalSendAndReceive(request);
        return response.getCountry();
    }
}
