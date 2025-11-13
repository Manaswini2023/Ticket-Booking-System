package ticket.booking.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Train {

    private String trainId;

    private String trainNumber;

    private List<List<Integer>> seats;

    private Map<String, String> stationTimes;

    private List<String> stations;

    public String getTrainInfo() {
        return String.format("Train ID: %s Train No: %s", trainId, trainNumber);
    }
}
