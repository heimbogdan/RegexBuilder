package com.helator.regex.builder.interfaces;

public interface IGroupMach<T> {

    T match(String pattern);
    T matchStart();
    T matchEnd();

    T capture(String pattern);
    T captureStart();
    T captureEnd();

    T namedGroup(String name, String pattern);
    T namedGroupStart(String name);
    T namedGroupEnd();
}
