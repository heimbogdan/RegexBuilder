package com.helator.regex.builder.interfaces;

public interface ICommonTokens<T> {

    T atStart();
    T atEnd();
    T anyChar();
    T anyChar(String chars);
    T exceptChars(String chars);
    T anyLowerLetter();
    T exceptLowerLetters();
    T anyUpperLetter();
    T exceptUpperLetters();
    T anyLetter();
    T exceptLetters();
    T anySingleChar();
    T anyWhitespace();
    T anyNonWhitespace();
    T anyDigit();
    T anyNonDigit();
    T anyWord();
    T anyNonWord();
    T anyWordBoundary();
    T anyNonWordBoundary();
    T newLine();
    T carriageRetur();
    T tab();
    T nullChar();
}
