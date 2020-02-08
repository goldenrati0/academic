from lexicalanalyser.parsers import start_parsing

if __name__ == '__main__':
    start_parsing('/Users/newscred/workspace/python/lexical-analyser/data/input.txt', 'id',
                  'keyword', 'value', 'math-operator', 'logical-operator', 'other')
