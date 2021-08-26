package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.FlatsDto;
import kg.one.flat.Models.Enums.FlatTypes;
import kg.one.flat.Models.Enums.RentType;
import kg.one.flat.Models.Enums.Search.AppartmentCount;
import kg.one.flat.Models.Enums.Search.BooleanCode;
import kg.one.flat.Models.Enums.Search.FloorCount;
import kg.one.flat.Models.Enums.Search.RoomCount;
import kg.one.flat.Models.Flats;
import kg.one.flat.Service.Impl.FlatsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/flats")
public class FlatsController extends BaseController<Flats, FlatsDto, FlatsServiceImpl> {
    protected FlatsController(FlatsServiceImpl service) {
        super(service);
    }

    @Autowired
    private FlatsServiceImpl flatsService;

    @GetMapping("/searchBy")
    public ResponseEntity<?> searchBy(
            @RequestParam RoomCount rooms
            ,@RequestParam FloorCount floor
            ,@RequestParam Double area
            ,@RequestParam AppartmentCount appartment_floor
            ,@RequestParam int district_id
            ,@RequestParam int city_id
            ,@RequestParam FlatTypes flatTypes
            ,@RequestParam RentType type
            ,@RequestParam BooleanCode wifi
            ,@RequestParam BooleanCode furniture
            ,@RequestParam BooleanCode image
            ,@RequestParam BooleanCode video
            ,@RequestParam BooleanCode broker
            ,@RequestParam BooleanCode balkon
    ){
        return flatsService.searchBy(rooms, floor, area, appartment_floor, district_id, city_id, flatTypes, type, wifi, furniture, image, video, broker, balkon);
    }
}