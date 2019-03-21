package day04;

import java.lang.reflect.Method;

public interface InterfaceTest<T> {
    T method(T t);
}

abstract class GenericTest<T> {
    abstract void method(T t);
}

class SubGenericTest extends GenericTest{

    @Override
    void method(Object o) {

    }
}
