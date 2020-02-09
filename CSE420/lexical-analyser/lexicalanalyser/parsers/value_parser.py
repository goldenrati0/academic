from lexicalanalyser.parsers.base import BaseParser


class NumericalValueParser(BaseParser):
    NAME = "Value"
    REGEX_STR = '[\\d\\.\\d]+'
