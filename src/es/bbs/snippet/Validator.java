package es.bbs.snippet;

public interface Validator<T> {

    ValidatorResult validate(T t);
}
