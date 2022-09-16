@DataMongoTest
class sideDishRepository{

    private final Integer SIDE_DISH_ID = 1;
    private final String SIDE_DISH_NAME = "Name";
    private final Double SIDE_DISH_COST = 12.12;

    private SideDish sDish;

    @Autowired
    private SideDishRepository sdRep;

    @BeforeEach
        void setUp(){

        sdRep.deleteAll();

        SideDish sideDish = new SideDish();

        sideDish.setSideDishId(SIDE_DISH_ID);
        sideDish.setName(SIDE_DISH_NAME);
        sideDish.setCost(SIDE_DISH_COST);

        sDish = sdRep.save(sideDish);

        SideDish sideDish2 = new SideDish();

        sideDish2.setSideDishId(SIDE_DISH_ID + 1);
        sideDish2.setName(SIDE_DISH_NAME);
        sideDish2.setCost(SIDE_DISH_COST);

        sDish = sdRep.save(sideDish2);

        assertThat(sideDish, samePropertyValueAs(rating, "id"));

    }

    @Test
    void whenIdIsValidReturnSideDish(){
        Integer expectedSideDish = 1;

        List<SideDish> foundSD;

        foundSD = sdRep.findById(1);

        assertEquals(expectedSideDish, foundSD.size());
        assertThat(sideDish, samePropertyValuesAs(foundSD.get(0)));
    }
}