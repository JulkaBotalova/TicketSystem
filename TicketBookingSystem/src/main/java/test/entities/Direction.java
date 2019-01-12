package test.entities;

import javax.persistence.*;

@Entity
@Table(name = "Direction", schema = "public")
public class Direction {
    @Id
    @GeneratedValue
    @Column(name = "Direction_Id", nullable = false)
    private Integer id;

    @Column(name = "Direction_Name", length = 30, nullable = false)
    private String directionName;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Direction_Bus_ID", nullable = false)
    private Bus bus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}