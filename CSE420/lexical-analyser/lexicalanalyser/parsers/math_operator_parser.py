import _io
from typing import List

from lexicalanalyser.parsers.base import BaseParser


class MathOperatorParser(BaseParser):
    NAME = "MathOperator"
    REGEX_STR = '\\+|-|\\*|/|\\^|='

    def parse(self, to_parse):
        return self._get_pattern().findall(to_parse)

    def start_parsing(self):
        while True:
            line = self._file_reader.readline()
            if not line:
                break

            parsed_data = self.parse(to_parse=line)
            self.parsed_data.extend(parsed_data)

    def get_parsed_data(self, file_reader: _io.TextIOWrapper) -> List:
        return list(
            set(
                super(MathOperatorParser, self).get_parsed_data(file_reader)
            )
        )
