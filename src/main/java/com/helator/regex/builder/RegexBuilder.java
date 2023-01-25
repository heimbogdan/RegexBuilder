package com.helator.regex.builder;

import com.helator.regex.builder.interfaces.ICommonTokens;
import com.helator.regex.builder.interfaces.IGroupMach;
import com.helator.regex.builder.interfaces.IQuantifierTokens;
import com.helator.regex.builder.interfaces.ITokens;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegexBuilder implements ITokens, ICommonTokens<RegexBuilder>, IQuantifierTokens<RegexBuilder>,
        IGroupMach<RegexBuilder> {

    private StringBuilder sb = new StringBuilder();

    public static RegexBuilder builder() {
        return new RegexBuilder();
    }

    public void reset() {
        sb.delete(0, sb.length());
    }

    public String toString() {
        return sb.toString();
    }

    public RegexBuilder append(Object obj) {
        sb.append(obj);
        return this;
    }

    @Override
    public RegexBuilder atStart() {
        sb.append(CARET);
        return this;
    }

    @Override
    public RegexBuilder atEnd() {
        sb.append(DOLAR);
        return this;
    }

    @Override
    public RegexBuilder anyChar() {
        sb.append(ANY);
        return this;
    }

    @Override
    public RegexBuilder anyChar(String chars) {
        return this.append(SQ_BR_1).append(chars).append(SQ_BR_2);
    }

    @Override
    public RegexBuilder exceptChars(String chars) {
        return this.append(SQ_BR_1).append(CARET).append(chars).append(SQ_BR_2);
    }

    @Override
    public RegexBuilder anyLowerLetter() {
        return anyChar(LOWER_LETTERS);
    }

    @Override
    public RegexBuilder exceptLowerLetters() {
        return exceptChars(LOWER_LETTERS);
    }

    @Override
    public RegexBuilder anyUpperLetter() {
        return anyChar(UPPER_LETTERS);
    }

    @Override
    public RegexBuilder exceptUpperLetters() {
        return exceptChars(UPPER_LETTERS);
    }

    @Override
    public RegexBuilder anyLetter() {
        return anyChar(ALL_LETTERS);
    }

    @Override
    public RegexBuilder exceptLetters() {
        return exceptChars(ALL_LETTERS);
    }

    @Override
    public RegexBuilder anySingleChar() {
        return this.append(ANY);
    }

    @Override
    public RegexBuilder anyWhitespace() {
        return this.append(ANY_WHITESPACE);
    }

    @Override
    public RegexBuilder anyNonWhitespace() {
        return this.append(ANY_NON_WHITESPACE);
    }

    @Override
    public RegexBuilder anyDigit() {
        return this.append(ANY_DIGIT);
    }

    @Override
    public RegexBuilder anyNonDigit() {
        return this.append(ANY_NON_DIGIT);
    }

    @Override
    public RegexBuilder anyWord() {
        return this.append(ANY_WORD);
    }

    @Override
    public RegexBuilder anyNonWord() {
        return this.append(ANY_NON_WORD);
    }

    @Override
    public RegexBuilder anyWordBoundary() {
        return this.append(ANY_WORD_BOUNDARY);
    }

    @Override
    public RegexBuilder anyNonWordBoundary() {
        return this.append(ANY_NON_WORD_BOUNDARY);
    }

    @Override
    public RegexBuilder zeroOrOne() {
        return this.append(Q);
    }

    @Override
    public RegexBuilder zeroOrOne(String pattern) {
        return this.append(pattern).append(Q);
    }

    @Override
    public RegexBuilder zeroOrMore() {
        return this.append(ASTERIX);
    }

    @Override
    public RegexBuilder zeroOrMore(String pattern) {
        return this.append(pattern).append(ASTERIX);
    }

    @Override
    public RegexBuilder oneOrMore() {
        return this.append(PLUS);
    }

    @Override
    public RegexBuilder oneOrMore(String pattern) {
        return this.append(pattern).append(PLUS);
    }

    @Override
    public RegexBuilder exactly(int times) {
        return this.append(C_BR_1).append(times).append(C_BR_2);
    }

    @Override
    public RegexBuilder exactlyOrMore(int times) {
        return this.append(C_BR_1).append(times).append(COMMA).append(C_BR_2);
    }

    @Override
    public RegexBuilder between(int min, int max) {
        return this.append(C_BR_1).append(min).append(COMMA).append(max).append(C_BR_2);
    }

    @Override
    public RegexBuilder lazy() {
        return this.append(ASTERIX).append(Q);
    }

    @Override
    public RegexBuilder possesive() {
        return this.append(ASTERIX).append(PLUS);
    }

    @Override
    public RegexBuilder newLine() {
        return this.append(NEW_LINE);
    }

    @Override
    public RegexBuilder carriageRetur() {
        return this.append(CARRIAGE_RETURN);
    }

    @Override
    public RegexBuilder tab() {
        return this.append(TAB);
    }

    @Override
    public RegexBuilder nullChar() {
        return this.append(NULL_CHAR);
    }

    @Override
    public RegexBuilder match(String pattern) {
        return this.matchStart().append(pattern).matchEnd();
    }

    @Override
    public RegexBuilder matchStart() {
        return this.captureStart().append(Q).append(COLON);
    }

    @Override
    public RegexBuilder matchEnd() {
        return this.captureEnd();
    }

    @Override
    public RegexBuilder capture(String pattern) {
        return this.captureStart().append(pattern).captureEnd();
    }

    @Override
    public RegexBuilder captureStart() {
        return this.append(BR_1);
    }

    @Override
    public RegexBuilder captureEnd() {
        return this.append(BR_2);
    }

    @Override
    public RegexBuilder namedGroup(String name, String pattern) {
        return this.namedGroupStart(name).append(pattern).namedGroupEnd();
    }

    @Override
    public RegexBuilder namedGroupStart(String name) {
        return this.captureStart().append(Q).append(LT).append(name).append(GT);
    }

    @Override
    public RegexBuilder namedGroupEnd() {
        return this.captureEnd();
    }
}
