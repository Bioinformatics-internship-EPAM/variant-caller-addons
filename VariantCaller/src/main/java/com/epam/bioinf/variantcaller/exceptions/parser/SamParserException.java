package com.epam.bioinf.variantcaller.exceptions.parser;

import com.epam.bioinf.variantcaller.exceptions.ParserException;

public class SamParserException extends ParserException {
  public SamParserException() {
  }

  public SamParserException(String s) {
    super(s);
  }

  public SamParserException(String s, Throwable throwable) {
    super(s, throwable);
  }

  public SamParserException(Throwable throwable) {
    super(throwable);
  }
}
