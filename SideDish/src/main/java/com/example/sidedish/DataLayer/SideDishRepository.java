import org.springframework.data.repository.CrudRepository;

public interface SideDishRepository extends CrudRepository<SideDish,Integer>{
    SideDish findNameBySideDishId(Integer sideDishId);
    boolean existsNameBySideDishId(Integer sideDishId);
}