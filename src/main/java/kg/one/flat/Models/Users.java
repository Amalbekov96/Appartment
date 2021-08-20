package kg.one.flat.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
public class Users extends BaseEntity {
    private String phone;
    private LocalDateTime blockedDate;
    private Boolean isBroker;
}
