from lexicalanalyser.parsers.base import BaseParser


class KeywordParser(BaseParser):
    NAME = "Keyword"
    REGEX_STR = '^(byte|short|int|long|float|double|char|bool|String|if|else|else ' \
                'if|switch|while|for){1}'

    def parse(self, to_parse):
        return self._get_pattern().findall(to_parse)

    def start_parsing(self):
        while True:
            line = self._file_reader.readline()
            if not line:
                break

            parsed_data = self.parse(to_parse=line)
            self.parsed_data.extend(parsed_data)
