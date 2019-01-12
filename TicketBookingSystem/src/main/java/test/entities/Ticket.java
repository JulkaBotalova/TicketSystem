package test.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Ticket", schema = "public")
public class Ticket {
    @Id
    @GeneratedValue
    @Column(name = "Ticket_Id", nullable = false)
    private Integer id;

    @Column(name = "Ticket_FIO", length = 100, nullable = false)
    private String fio;

    @Column(name = "Ticket_Number", nullable = false)
    private Integer ticketNumber;

    @Column(name = "Ticket_Date", nullable = false)
    private Date ticketDate;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "Ticket_Direction_ID", nullable = false)
    private Direction direction;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
