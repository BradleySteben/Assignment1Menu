@Service
public class SideDishServiceImpl implements SideDishService {

    final private SideDishRepository sdRep;
    final private SideDishResponseMapper sdRepM;
    final private SideDishRequestMapper sdReqM;

    public SideDishServiceImpl(
            SideDishRepository sideDishRepository,
            SideDishResponseMapper sideDishResponseMapper,
            SideDishRequestMapper sideDishRequestMapper){
        this.sdRep = sideDishRepository;
        this.sdRepM = sideDishResponseMapper;
        this.sdReqM = sideDishRequestMapper;
    }

    @Override
    public List<SideDishResponseModel> findAllSideDishes() {

        List<SideDish> sideDishList = (List<SideDish>)sdRep.findAll();
        List<SideDishResponseModel> sideDishList =
                sdRepM.entityListToResponseModel(gameList);

        return sideDishList;
    }

    @Override
    public SideDishResponseModel findSideDishById(Integer sideDishId) {
        SideDish sideDish = sdRep.findNameBySideDishId(gameId);
        sdRepM sideDishModel = sdRepM.entityToResponseModel(sideDish);

        return sideDishModel;
    }
}