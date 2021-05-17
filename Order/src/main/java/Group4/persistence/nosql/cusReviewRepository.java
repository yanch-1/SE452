package Group4.persistence.nosql;

import Group4.persistence.nosql.cusReview;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public class cusReviewRepository implements MongoRepository<cusReview, String> {

    @Override
    public <S extends cusReview> S save(S entity) {
        return null;
    }

    @Override
    public <S extends cusReview> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<cusReview> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<cusReview> findAll() {
        return null;
    }

    @Override
    public Iterable<cusReview> findAllById(Iterable<String> strings) {
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
    public void delete(cusReview entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends cusReview> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<cusReview> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<cusReview> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends cusReview> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends cusReview> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends cusReview> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends cusReview> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends cusReview> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends cusReview> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends cusReview> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends cusReview> S insert(S entity) {
        return null;
    }
}