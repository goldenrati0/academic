from typing import List

from lexicalanalyser.parsers.base import BaseParser


class Parser:

    @staticmethod
    def parse(file_path: str, parsers: List[BaseParser]):
        for parser in parsers:
            with open(file_path, "r") as file_reader:
                parsed_data = parser.get_parsed_data(file_reader=file_reader)
                print(parser.NAME, '->', parsed_data)
