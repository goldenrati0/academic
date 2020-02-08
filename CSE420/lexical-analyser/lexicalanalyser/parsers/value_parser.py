from lexicalanalyser.parsers.base import BaseParser


class NumericalValueParser(BaseParser):
    NAME = "Value"
    REGEX_STR = '[\\d\\.\\d]+'

    def parse(self, to_parse):
        return self._get_pattern().findall(to_parse)

    def start_parsing(self):
        while True:
            line = self._file_reader.readline()
            if not line:
                break

            parsed_data = self.parse(to_parse=line)
            self.parsed_data.extend(parsed_data)
