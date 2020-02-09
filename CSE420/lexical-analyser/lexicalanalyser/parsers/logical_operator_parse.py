import _io
from typing import List

from lexicalanalyser.parsers.base import BaseParser


class LogicalOperatorParser(BaseParser):
    NAME = "LogicalOperator"
    REGEX_STR = '>|<|=='

    def get_parsed_data(self, file_reader: _io.TextIOWrapper) -> List:
        return list(
            set(
                super(LogicalOperatorParser, self).get_parsed_data(file_reader)
            )
        )
