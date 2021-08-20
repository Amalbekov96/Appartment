package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.ImagesDto;
import kg.one.flat.Models.Images;
import kg.one.flat.Service.Impl.ImagesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/images")
public class ImagesController extends BaseController<Images, ImagesDto, ImagesServiceImpl> {
    protected ImagesController(ImagesServiceImpl service) {
        super(service);
    }
}
