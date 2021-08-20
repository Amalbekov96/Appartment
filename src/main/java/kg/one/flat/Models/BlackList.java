package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
@Entity
@Data
public class BlackList extends BaseEntity{
    @ManyToOne
    private Users user;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
