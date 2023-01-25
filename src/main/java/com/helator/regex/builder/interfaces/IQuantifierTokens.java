package com.helator.regex.builder.interfaces;

public interface IQuantifierTokens<T> {

    T zeroOrOne();
    T zeroOrOne(String pattern);
    T zeroOrMore();
    T zeroOrMore(String pattern);
    T oneOrMore();
    T oneOrMore(String pattern);
    T exactly(int times);
    T exactlyOrMore(int times);
    T between(int min, int max);
    T lazy();
    T possesive();
}
