package kg.one.flat.Controller.Common;

import kg.one.flat.Controller.BaseController;
import kg.one.flat.Models.BlackList;
import kg.one.flat.Models.Dto.BlackListDto;
import kg.one.flat.Service.Impl.BlackListServiceImpl;

public class BlackListController extends BaseController<BlackList, BlackListDto, BlackListServiceImpl> {
    protected BlackListController(BlackListServiceImpl service) {
        super(service);
    }
}
