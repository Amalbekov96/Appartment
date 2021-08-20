package kg.one.flat.Models.Dto;

import lombok.Data;

import javax.persistence.MappedSuperclass;
@Data
@MappedSuperclass
public abstract class BaseDto {
    private Long id;
}
