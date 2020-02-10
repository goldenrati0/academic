import _io
from typing import List

from lexicalanalyser.parsers.base import BaseParser


class IdentifierParser(BaseParser):
    NAME = "ID"
    REGEX_STR = '[a-zA-Z]*[ ]?='

    def start_parsing(self):
        super().start_parsing()
        self.parsed_data = list(map(lambda d: d.split("=")[0].strip(), self.parsed_data))

    def get_parsed_data(self, file_reader: _io.TextIOWrapper) -> List:
        return sorted(
            list(
                set(
                    super(IdentifierParser, self).get_parsed_data(file_reader)
                )
            )
        )
