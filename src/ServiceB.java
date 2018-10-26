import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServiceB {
    private final List<Emission> emissions;
    private final List<Serie> series;

    public ServiceB() {
        series = new ArrayList<>();
        emissions = new ArrayList<>();

        emissions.add(new Emission("A",
                "Star Wars",
                LocalDateTime.of(2018, 11, 4, 18, 0),
                LocalDateTime.of(2018, 11, 4, 21, 0), null));

        emissions.add(new Emission("B",
                "Une émission",
                LocalDateTime.of(2018, 11, 5, 18, 30),
                LocalDateTime.of(2018, 11, 5, 19, 0), Optional.of(1)));

        emissions.add(new Emission("C",
                "Une émission",
                LocalDateTime.of(2018, 11, 5, 18, 30),
                LocalDateTime.of(2018, 11, 5, 19, 0), Optional.of(1)));

        series.add(new Serie(1, "The Big Bang Theory"));
    }
}
