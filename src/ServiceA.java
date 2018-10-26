import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceA {
    private List<Emission> emissions;
    private List<Serie> series;

    public ServiceA() {
        emissions = new ArrayList<>();

        emissions.add(new Emission("1",
                "Star Wars",
                LocalDateTime.of(2018, 11, 4, 18, 0),
                LocalDateTime.of(2018, 11, 4, 21, 0), null));

        emissions.add(new Emission("1",
                "Une émission",
                LocalDateTime.of(2018, 11, 5, 18, 30),
                LocalDateTime.of(2018, 11, 5, 19, 0), Optional.of(1)));

        series = new ArrayList<>();

        series.add(new Serie(1, "The Big Bang Theory"));

    }

    public List recupererEmissions() {
        return emissions;
    }

    public List recupererSeries() {
        return series;
    }
}
