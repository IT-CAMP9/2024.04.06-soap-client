package pl.camp.it.soap.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.camp.it.soap.client.countries.Country;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        SoapClient client = context.getBean(SoapClient.class);
        Country country = client.getCountry("Hiszpania");

        System.out.println(country.getName());
        System.out.println(country.getPopulation());
        System.out.println(country.getCapital());
        System.out.println(country.getCurrency());
    }
}
