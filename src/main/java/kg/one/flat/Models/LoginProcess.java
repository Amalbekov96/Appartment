package kg.one.flat.Models;

import kg.one.flat.Models.Dto.UsersDto;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Data
@Entity
public class LoginProcess extends BaseEntity{
    @ManyToOne
    private Users user;
    private int count;
    private String reason;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
