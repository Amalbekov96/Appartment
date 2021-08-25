package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Districts;
import kg.one.flat.Models.Dto.CitiesDto;
import kg.one.flat.Models.Dto.DistrictsDto;
import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Dto.FlatsSearchDto;
import kg.one.flat.Models.Enums.FlatTypes;
import kg.one.flat.Models.Enums.RentType;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.FlatsMapper;
import kg.one.flat.Repository.CitiesRepo;
import kg.one.flat.Repository.DistrictsRepo;
import kg.one.flat.Repository.FlatsRepo;
import kg.one.flat.Repository.SearchClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlatsServiceImpl extends BaseServiceImpl<Flats, FlatsDto, FlatsMapper, FlatsRepo>{
    public FlatsServiceImpl(FlatsRepo repo, FlatsMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private SearchClass searchClass;



    String[] names = {"rooms", "floor", "area", "appartment_floor", "districts_id", "cities_id" , "flat_types", "type", "wifi", "furniture", "image", "video", "broker", "type"};

    public ResponseEntity<?> searchBy(int rooms
                                        , Double floor
                                        , Double area
                                        , int appartment_floor
                                        , int district_id
                                        , int city_id
                                        , FlatTypes flatTypes
                                        , RentType type
                                        , Boolean wifi
                                        , Boolean furniture
                                        , Boolean image
                                        , Boolean video
                                        , Boolean broker){

        String sql = "SELECT * FROM flats WHERE ";

        List<Object> values = new ArrayList <Object>();
        values.add(rooms); values.add(floor); values.add(area); values.add(appartment_floor); values.add(district_id); values.add(city_id); values.add(flatTypes); values.add(type);
        values.add(wifi); values.add(furniture); values.add(image); values.add(video); values.add(broker);

        List<Integer> indexes = new ArrayList<>();

        if(rooms != 0){
            indexes.add(0);
        }
        if(floor != 0){
            indexes.add(1);
        }
        if(area != 0){
            indexes.add(2);
        }
        if(appartment_floor != 0){
            indexes.add(3);
        }

        indexes.add(4);
        indexes.add(5);
        indexes.add(6);
        indexes.add(7);
        indexes.add(8);
        indexes.add(9);
        indexes.add(10);
        indexes.add(11);
        indexes.add(12);

        boolean checker = false;
        for(Integer i : indexes){
            if(checker){
                if(i == 6){
                    sql += " AND " + names[i] + " = " + flatTypes.getSeria();
                } else if(i == 7) {
                    sql += " AND " + names[i] + " = " + type.getType();
                } else {
                    sql += " AND " + names[i] + " = " + values.get(i);
                }
            } else {
                sql += names[i] + " = " + values.get(i);
                checker = true;
            }
        }

        System.out.println(sql);

        return ResponseEntity.ok(searchClass.findAll(sql));
    }

}
