package xyz.parkh.ooppromo.repository;

public interface Repository<T> {
    void save(T t);

    T findById(Long id);
}
