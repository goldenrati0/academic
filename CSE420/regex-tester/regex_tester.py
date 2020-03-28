import re

number_of_regex = int(input())
regexes = []
for _ in range(number_of_regex):
    regexes.append(re.compile(input()))

number_of_inputs = int(input())
for _ in range(number_of_inputs):
    string = input()
    matched, index = False, 0
    for i, r in enumerate(regexes):
        if r.match(string):
            matched, index = True, i + 1
            break
    
    print(f"YES, {index}") if matched else print("NO, 0")
