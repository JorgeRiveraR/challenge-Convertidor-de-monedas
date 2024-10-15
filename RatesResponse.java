import java.util.List;

public RatesResponse responseJson;
List<Currency> currencies = responseJson.getRates();

public class RatesResponse {
    private List<Currency> rates;

    public List<Currency> getRates() {
        return rates;
    }
}
