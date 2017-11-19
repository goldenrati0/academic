file = open('input.txt', 'r')

i = 0
nodes = {}
number_of_node = 0

for line in file:
	if i == 0:
		line = line.replace("\n", "")
		all_nodes = line.split(" ")
		number_of_node = len(all_nodes)
		for node in all_nodes:
			nodes.update({'{}'.format(node): []})
		i = 1
	else:
		edge = line.replace("\n", "")
		edge = edge.split(" ")
		nodes.get('{}'.format(edge[0])).append(edge[1])

row, column = number_of_node, number_of_node
adj_matrix = [[0 for j in range(column)] for i in range(row)]

print('Adjacency List\n==============')
for node in list(nodes.keys()):
	s = '[{}] -> '.format(node)
	for adj_nodes in nodes[node]:
		s = s + '[{}]-'.format(adj_nodes)
		adj_matrix[int(node)][int(adj_nodes)] = 1
	print(s[:-1])

print('\n\nAdjacency Matrix\n================')

row_str = '\t '
for n in range(number_of_node):
	row_str = row_str + '{}  '.format(n)
print(row_str)
matrix = ''
for row in range(len(adj_matrix)):
	s = '{}\t'.format(row)
	for column in range(len(adj_matrix[row])):
		s = s + '[{}]'.format(adj_matrix[row][column])
	s = s + '\n'
	matrix = matrix + s
print(matrix)