package com.example.eadtest.respository;

import com.example.eadtest.entity.Products;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ProductRepository extends JpaRepository<Products, Integer> {


    @Override
    public List<Products> findAll() {
        return null;
    }

    @Override
    public List<Products> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Products> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Products> findAllById(Iterable<Integer> integers) {
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
    public void delete(Products entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Products> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Products> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Products> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Products> findById(Integer integer) {
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
    public <S extends Products> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Products> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Products> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Products getOne(Integer integer) {
        return null;
    }

    @Override
    public Products getById(Integer integer) {
        return null;
    }

    @Override
    public Products getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Products> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Products> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Products> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Products> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Products> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Products, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
