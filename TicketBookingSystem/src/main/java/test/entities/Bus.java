package test.entities;
import javax.persistence.*;

@Entity
@Table(name = "Bus", schema = "public")
public class Bus {
    @Id
    @GeneratedValue
    @Column(name = "Bus_Id", nullable = false)
    private Integer id;

    @Column(name = "Bus_Name", length = 30, nullable = false)
    private String busName;

    @Column(name = "Bus_numberOfEmptySeats", length = 30, nullable = false)
    private Integer numberOfEmptySeats;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Integer getNumberOfEmptySeats() {
        return numberOfEmptySeats;
    }

    public void setNumberOfEmptySeats(Integer numberOfEmptySeats) {
        this.numberOfEmptySeats = numberOfEmptySeats;
    }
}
