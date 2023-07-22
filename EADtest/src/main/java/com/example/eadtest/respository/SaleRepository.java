package com.example.eadtest.respository;

import com.example.eadtest.entity.Sales;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class SaleRepository extends JpaRepository <Sales, Integer> {
    @Override
    public List<Sales> findAll() {
        return null;
    }

    @Override
    public List<Sales> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Sales> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Sales> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Sales entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Sales> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Sales> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Sales> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Sales> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Sales> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Sales> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Sales> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Sales getOne(Integer integer) {
        return null;
    }

    @Override
    public Sales getById(Integer integer) {
        return null;
    }

    @Override
    public Sales getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Sales> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Sales> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Sales> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Sales> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Sales> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Sales> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Sales, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
