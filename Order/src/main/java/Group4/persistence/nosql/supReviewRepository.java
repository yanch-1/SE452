package Group4.persistence.nosql;

import Group4.persistence.nosql.supReview;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public class supReviewRepository implements MongoRepository<supReview, String> {

    @Override
    public <S extends supReview> S save(S entity) {
        return null;
    }

    @Override
    public <S extends supReview> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<supReview> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<supReview> findAll() {
        return null;
    }

    @Override
    public Iterable<supReview> findAllById(Iterable<String> strings) {
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
    public void delete(supReview entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends supReview> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<supReview> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<supReview> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends supReview> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends supReview> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends supReview> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends supReview> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends supReview> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends supReview> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends supReview> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends supReview> S insert(S entity) {
        return null;
    }
}