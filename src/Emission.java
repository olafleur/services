import java.time.LocalDateTime;
import java.util.Optional;

public class Emission {
    private final String channelNo;
    private final String nomEmission;
    private final LocalDateTime heureDebut;
    private final LocalDateTime heureFin;
    private final Optional<Integer> serie;

    public Emission(String channelNo,
                    String nomEmission,
                    LocalDateTime heureDebut,
                    LocalDateTime heureFin,
                    Optional<Integer> serie) {
        this.channelNo = channelNo;
        this.nomEmission = nomEmission;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.serie = serie;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public String getNomEmission() {
        return nomEmission;
    }

    public LocalDateTime getHeureDebut() {
        return heureDebut;
    }

    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    public Optional<Integer> getSerie() {
        return serie;
    }
}
