package Group4.persistence.nosql;

import Group4.persistence.nosql.serverErrorLOg;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public class serverErrorLogRepository implements MongoRepository<serverErrorLOg, String> {

    @Override
    public <S extends serverErrorLOg> S save(S entity) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<serverErrorLOg> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<serverErrorLOg> findAll() {
        return null;
    }

    @Override
    public Iterable<serverErrorLOg> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(serverErrorLOg entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends serverErrorLOg> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<serverErrorLOg> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<serverErrorLOg> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends serverErrorLOg> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends serverErrorLOg> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends serverErrorLOg> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends serverErrorLOg> S insert(S entity) {
        return null;
    }
}
