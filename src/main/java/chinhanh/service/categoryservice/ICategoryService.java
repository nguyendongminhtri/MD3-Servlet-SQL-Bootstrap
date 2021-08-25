package chinhanh.service.categoryservice;

import chinhanh.model.Category;
import chinhanh.service.IParentService;

import java.util.List;

public interface ICategoryService extends IParentService<Category> {
    List<Category> findAllBySongId(Long song_id);
}
