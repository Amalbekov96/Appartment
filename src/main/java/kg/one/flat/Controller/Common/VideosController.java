package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.Dto.VideosDto;
import kg.one.flat.Models.Videos;
import kg.one.flat.Service.Impl.VideosServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/videos")
public class VideosController extends BaseController <Videos, VideosDto, VideosServiceImpl>{
    protected VideosController(VideosServiceImpl service) {
        super(service);
    }
}
