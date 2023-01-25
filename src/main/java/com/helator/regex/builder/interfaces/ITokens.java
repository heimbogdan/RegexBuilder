package com.helator.regex.builder.interfaces;

public interface ITokens {

    static final Character Q = '?';
    static final Character ASTERIX = '*';
    static final Character PLUS = '+';
    static final Character COLON = ':';
    static final Character LT = '<';
    static final Character GT = '>';
    static final Character ANY = '.';
    static final Character BR_1 = '(';
    static final Character BR_2 = ')';
    static final Character SQ_BR_1 = '[';
    static final Character SQ_BR_2 = ']';
    static final Character C_BR_1 = '{';
    static final Character C_BR_2 = '}';
    static final Character CARET = '^';
    static final Character COMMA = ',';
    static final Character DOLAR = '$';

    static final String LOWER_LETTERS = "a-z";
    static final String UPPER_LETTERS = "A-Z";
    static final String ALL_LETTERS = "a-zA-Z";

    static final String ANY_WHITESPACE = "\\s";
    static final String ANY_NON_WHITESPACE = "\\S";
    static final String ANY_DIGIT = "\\d";
    static final String ANY_NON_DIGIT = "\\D";
    static final String ANY_WORD = "\\w";
    static final String ANY_NON_WORD = "\\W";
    static final String ANY_WORD_BOUNDARY = "\\b";
    static final String ANY_NON_WORD_BOUNDARY = "\\B";
    static final String NEW_LINE = "\\n";
    static final String CARRIAGE_RETURN = "\\r";
    static final String TAB = "\\t";
    static final String NULL_CHAR = "\\0";
}
