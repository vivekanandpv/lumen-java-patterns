package com.vivekanandpv.behavioral.observer;

public interface Subject<T> {
    void notifyObservers();
    T getState();
    void setState(T state);
    void add(Observer<T> observer);
    void remove(Observer<T> observer);
}
