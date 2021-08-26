package kg.one.flat.Repository;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.FlatsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchClass {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private FlatsMapper flatsMapper;


    public List<Flats> findAll(String sql) {

        List<Flats> flatsList = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper(Flats.class));

        return flatsList;
    }
}
