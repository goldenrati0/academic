# Lexical Analyser
This python program takes a Java code snippet and parses
- Identifiers
- Keywords
- Logical Operators
- Mathematical Operators
- Numerical Values
- Other Symbols

## Runtime
This program is tested on **Python 3.8.1**
Walrus operator (:=) has been used in this program so any earlier version of Python can not run this properly.

## How to run
If you have Python3.8 interpreter installed then execute
```bash
python run_parser.py
````
Inside `run_parser.py` file, you will notice there is a file path for input.txt.
From input.txt, program will parse the code and run lexical analyser.
Replace the file path with any valid file path and the program should work.

### Run in docker
If you have Docker and docker-compose installed, you can run the program inside Docker.
Just execute
```bash
docker-compose up
```
Note: Execute WITHOUT -d param while running docker-compose. Otherwise you will not be able to see the STDOUT.
