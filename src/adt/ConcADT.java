package adt;

public interface ConcADT<E> {
    void add(E item);

    E remove();

    E getData(int index);

}
