from lexicalanalyser.parsers.base import BaseParser


class KeywordParser(BaseParser):
    NAME = "Keyword"
    REGEX_STR = '^(byte|short|int|long|float|double|char|bool|String|if|else|else ' \
                'if|switch|while|for){1}'
