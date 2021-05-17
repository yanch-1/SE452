package Group4.persistence.nosql;

import Group4.persistence.nosql.itemReview;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public class itemReviewRepository implements MongoRepository<itemReview, String> {

    @Override
    public <S extends itemReview> S save(S entity) {
        return null;
    }

    @Override
    public <S extends itemReview> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<itemReview> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<itemReview> findAll() {
        return null;
    }

    @Override
    public Iterable<itemReview> findAllById(Iterable<String> strings) {
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
    public void delete(itemReview entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends itemReview> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<itemReview> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<itemReview> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends itemReview> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends itemReview> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends itemReview> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends itemReview> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends itemReview> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends itemReview> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends itemReview> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends itemReview> S insert(S entity) {
        return null;
    }
}
