from lexicalanalyser.lexical_parser import Parser
from lexicalanalyser.parsers.identifier_parser import IdentifierParser
from lexicalanalyser.parsers.keyword_parser import KeywordParser
from lexicalanalyser.parsers.value_parser import NumericalValueParser
from lexicalanalyser.parsers.math_operator_parser import MathOperatorParser
from lexicalanalyser.parsers.logical_operator_parse import LogicalOperatorParser
from lexicalanalyser.parsers.symbol_parser import SymbolParser

PARSER_MAP = {
    "keyword": KeywordParser,
    "id": IdentifierParser,
    "value": NumericalValueParser,
    "math-operator": MathOperatorParser,
    "logical-operator": LogicalOperatorParser,
    "other": SymbolParser
}


def _create_parser(to_parse):
    parsers = []
    for parse in to_parse:
        if parse in PARSER_MAP:
            parsers.append(PARSER_MAP[parse]())
    return parsers


def parser_factory(file_path, *args):
    parsers = _create_parser(list(set(args)))
    Parser.parse(file_path, parsers)


def start_parsing(file_path: str, *args):
    parser_factory(file_path, *args)
