package chinhanh.service;

import java.util.List;

public interface IParentService<T> {
    List<T> findAll();
    T findById(Long id);
    void save(T t);
    void deleteById(Long id);
    void edit(Long id, T t);
}
