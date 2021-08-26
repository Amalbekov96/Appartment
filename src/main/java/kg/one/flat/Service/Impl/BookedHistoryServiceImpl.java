package kg.one.flat.Service.Impl;

import kg.one.flat.Exceptions.AlreadyBooked;
import kg.one.flat.Exceptions.EntityNotFound;
import kg.one.flat.Models.BookedHisotory;
import kg.one.flat.Models.Dto.BookedHistoryDto;
import kg.one.flat.Models.Dto.PricesDto;
import kg.one.flat.Models.Enums.BookedHisotoryStatus;
import kg.one.flat.Models.Enums.RentType;
import kg.one.flat.Models.Mapper.BookedHistoryMapper;
import kg.one.flat.Models.Mapper.FlatsMapper;
import kg.one.flat.Models.Mapper.UsersMapper;
import kg.one.flat.Repository.BookedHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class BookedHistoryServiceImpl extends BaseServiceImpl<BookedHisotory, BookedHistoryDto, BookedHistoryMapper, BookedHistoryRepo>{
    public BookedHistoryServiceImpl(BookedHistoryRepo repo, BookedHistoryMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private BookedHistoryRepo bookedHistoryRepo;
    @Autowired
    private BookedHistoryMapper bookedHistoryMapper;
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private FlatsServiceImpl flatsService;
    @Autowired
    private FlatsMapper flatsMapper;
    @Autowired
    PricesServiceImpl pricesService;

    @Override
    public ResponseEntity<?> create(BookedHistoryDto bookedHistoryDto) {

        BookedHistoryDto bhDto = bookedHistoryMapper.toDto(bookedHistoryRepo.findByFlats(flatsMapper.toEntity(bookedHistoryDto.getFlats())));

        if(bhDto != null) {

            if (bhDto.getStatus().equals(BookedHisotoryStatus.BOOKED) && bhDto.getUsers().getId() == bookedHistoryDto.getUsers().getId()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("You have already booked this flat!");
            } else if(bhDto.getStatus().equals(BookedHisotoryStatus.BOOKED)){
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This flat is already booked!");
            }

            BookedHistoryDto oldBhDto = bookedHistoryMapper.toDto(bookedHistoryRepo.findByUsersAndAddTimeIsAfter(usersMapper.toEntity(bookedHistoryDto.getUsers()), LocalDateTime.now().minusMinutes(1)));

            if (oldBhDto != null) {
                oldBhDto.setStatus(BookedHisotoryStatus.CANCELLED);
                bookedHistoryRepo.save(bookedHistoryMapper.toEntity(oldBhDto));

                bookedHistoryDto.setStatus(BookedHisotoryStatus.BOOKED);

                if (bookedHistoryDto.getFlats().getType().equals(RentType.DAILY)) {
                    int days = (int) ChronoUnit.DAYS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(days);
                    double totalPrice = days * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));

                } else {
                    int months = (int) ChronoUnit.MONTHS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(months);
                    double totalPrice = months * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));
                }
            } else {
                if (bookedHistoryDto.getFlats().getType().equals(RentType.DAILY)) {
                    int days = (int) ChronoUnit.DAYS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(days);
                    double totalPrice = days * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));

                } else {
                    int months = (int) ChronoUnit.MONTHS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(months);
                    double totalPrice = months * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));
                }

            }

        } else {
            BookedHistoryDto oldBhDto = bookedHistoryMapper.toDto(bookedHistoryRepo.findByUsersAndAddTimeIsAfter(usersMapper.toEntity(bookedHistoryDto.getUsers()), LocalDateTime.now().minusMinutes(1)));

            if (oldBhDto != null) {
                oldBhDto.setStatus(BookedHisotoryStatus.CANCELLED);
                bookedHistoryRepo.save(bookedHistoryMapper.toEntity(oldBhDto));

                bookedHistoryDto.setStatus(BookedHisotoryStatus.BOOKED);

                if (bookedHistoryDto.getFlats().getType().equals(RentType.DAILY)) {
                    int days = (int) ChronoUnit.DAYS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(days);
                    double totalPrice = days * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));

                } else {
                    int months = (int) ChronoUnit.MONTHS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(months);
                    double totalPrice = months * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));
                }
            } else {

                if (bookedHistoryDto.getFlats().getType().equals(RentType.DAILY)) {
                    int days = (int) ChronoUnit.DAYS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(days);
                    double totalPrice = days * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));

                } else {
                    int months = (int) ChronoUnit.MONTHS.between(bookedHistoryDto.getStartDate(), bookedHistoryDto.getEndDate());
                    PricesDto price = pricesService.findByFlat(bookedHistoryDto.getFlats());
                    System.out.println(months);
                    double totalPrice = months * price.getPrice();
                    bookedHistoryDto.setTotalPrice(totalPrice);

                    return ResponseEntity.status(HttpStatus.OK).body(bookedHistoryMapper.toDto(bookedHistoryRepo.save(bookedHistoryMapper.toEntity(bookedHistoryDto))));
                }
            }
        }
    }
}
