package kg.one.flat.Service.Impl;

import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Enums.FlatTypes;
import kg.one.flat.Models.Enums.RentType;
import kg.one.flat.Models.Enums.Search.AppartmentCount;
import kg.one.flat.Models.Enums.Search.BooleanCode;
import kg.one.flat.Models.Enums.Search.FloorCount;
import kg.one.flat.Models.Enums.Search.RoomCount;
import kg.one.flat.Models.Flats;
import kg.one.flat.Models.Mapper.FlatsMapper;
import kg.one.flat.Repository.FlatsRepo;
import kg.one.flat.Repository.SearchClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlatsServiceImpl extends BaseServiceImpl<Flats, FlatsDto, FlatsMapper, FlatsRepo>{
    public FlatsServiceImpl(FlatsRepo repo, FlatsMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private SearchClass searchClass;
    @Autowired
    private FlatsMapper flatsMapper;
    @Autowired
    private FlatsRepo flatsRepo;

    String[] names = {"rooms", "floor", "area", "appartment_floor", "districts_id", "cities_id" , "flat_types", "type", "wifi", "furniture", "image", "video", "broker", "balkon"};

    public ResponseEntity<?> searchBy(RoomCount rooms
                                        , FloorCount floor
                                        , Double area
                                        , AppartmentCount appartment_floor
                                        , int district_id
                                        , int city_id
                                        , FlatTypes flatTypes
                                        , RentType type
                                        , BooleanCode wifi
                                        , BooleanCode furniture
                                        , BooleanCode image
                                        , BooleanCode video
                                        , BooleanCode broker
                                        , BooleanCode balkon
                                        ){

        String sql = "SELECT * FROM flats";

        boolean checker = false;


        if(rooms != RoomCount.NONE){
            sql += " WHERE " +  names[0] + " = " + rooms.getCode() + " \n";
            checker = true;
        }

        if(floor != FloorCount.NONE){
            if(checker){
                sql += " AND " + names[1] + " = " + floor.getCode()+ " \n";
            } else {
                sql += " WHERE " +  names[1] + " = " + floor.getCode() + " \n";
                checker = true;
            }
        }
        if(area != 0){
            if(checker){
                sql += " AND " + names[2] + " = " + area + " \n";
            } else {
                sql += " WHERE " +  names[2] + " = " + area + " \n";
                checker = true;
            }
        }

        if(appartment_floor!= AppartmentCount.NONE){
            if(checker){
                sql += " AND " + names[3] + " = " + appartment_floor.getCode() + " \n";
            } else {
                sql += " WHERE " +  names[3] + " = " + appartment_floor.getCode() + " \n";
                checker = true;
            }
        }

        if(district_id != 0){
            if(checker){
                sql += " AND " + names[4] + " = " + district_id + " \n";
            } else {
                sql += " WHERE " +  names[4] + " = " + district_id + " \n";
                checker = true;
            }
        }
        if(city_id != 0){
            if(checker){
                sql += " AND " + names[5] + " = " + city_id + " \n";
            } else {
                sql += " WHERE " +  names[5] + " = " + city_id + " \n";
                checker = true;
            }
        }

        if(flatTypes != FlatTypes.NONE){
            if(checker){
                sql += " AND " + names[6] + " = " + flatTypes.getSeria() + " \n";
            } else {
                sql += " WHERE " +  names[6] + " = " + flatTypes.getSeria() + " \n";
                checker = true;
            }
        }
        if(type != RentType.NONE){
            if(checker){
                sql += " AND " + names[7] + " = " + type.getType() + " \n";
            } else {
                sql += " WHERE " +  names[7] + " = " + type.getType() + " \n";
                checker = true;
            }
        }
        if(wifi != BooleanCode.NONE){
            if(wifi.getCode() == 1){
                if(checker){
                    sql += " AND " + names[8] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[8] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[8] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[8] + " = " + false + " \n";
                    checker = true;
                }
            }
        }

        if(furniture != BooleanCode.NONE){
            if(furniture.getCode() == 1){
                if(checker){
                    sql += " AND " + names[9] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[9] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[9] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[9] + " = " + false + " \n";
                    checker = true;
                }
            }
        }


        if(image != BooleanCode.NONE){
            if(image.getCode() == 1){
                if(checker){
                    sql += " AND " + names[10] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[10] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[10] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[10] + " = " + false + " \n";
                    checker = true;
                }
            }
        }
        if(video != BooleanCode.NONE){
            if(video.getCode() == 1){
                if(checker){
                    sql += " AND " + names[11] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[11] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[11] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[11] + " = " + false + " \n";
                    checker = true;
                }
            }
        }

        if(broker != BooleanCode.NONE){
            if(broker.getCode() == 1){
                if(checker){
                    sql += " AND " + names[12] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[12] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[12] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[12] + " = " + false + " \n";
                    checker = true;
                }
            }
        }

        if(balkon != BooleanCode.NONE){
            if(balkon.getCode() == 1){
                if(checker){
                    sql += " AND " + names[13] + " = " + true + " \n";
                } else {
                    sql += " WHERE " +  names[13] + " = " + true + " \n";
                    checker = true;
                }
            } else {
                if(checker){
                    sql += " AND " + names[13] + " = " + false + " \n";
                } else {
                    sql += " WHERE " +  names[13] + " = " + false + " \n";
                    checker = true;
                }
            }
        }

        System.out.println(sql);
        List<Flats> flatsList = searchClass.findAll(sql);
        List<Long> Ids = new ArrayList<>();
        for(Flats f : flatsList){
            Ids.add(f.getId());
        }
        List<FlatsDto> flatsDtoList = flatsMapper.toListDto(flatsRepo.findAllById(Ids));
        return ResponseEntity.ok(flatsDtoList);
    }

}
