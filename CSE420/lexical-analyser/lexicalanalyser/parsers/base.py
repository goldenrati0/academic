import _io
import re
from abc import ABC
from typing import List


class BaseParser(ABC):
    NAME: str = "Base"
    REGEX_STR: str = ""

    def __init__(self):
        self.parsed_data: List = []

    def _get_pattern(self) -> re.Pattern:
        return re.compile(self.REGEX_STR)

    def parse(self, to_parse):
        pass

    def start_parsing(self):
        pass

    def get_parsed_data(self, file_reader: _io.TextIOWrapper) -> List:
        self._file_reader = file_reader
        self.start_parsing()
        return self.parsed_data
