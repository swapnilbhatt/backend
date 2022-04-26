package org.example.core;

public interface ICard {
    @Override
    String toString();

    String getSuite();

    int getValue();
}
