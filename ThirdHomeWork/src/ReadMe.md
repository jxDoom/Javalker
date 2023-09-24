### Алгоритм сортировки слиянием на Java
Данный алгоритм разбивает список на две части, каждую из них он разбивает ещё на две и так далее, пока не останутся единичные элементы. Массив из одного элемента считается упорядоченным. Соседние элементы сравниваются и соединяются вместе. Так происходит до тех пор, пока все элементы не будут отсортированы.

___Примечание___ По возможности используйте готовые алгоритмы для коллекций и методы из java.util.Arrays.

Сортировка осуществляется путём сравнения наименьших элементов каждого подмассива. Первые элементы каждого подмассива сравниваются первыми. Наименьший элемент перемещается в результирующий массив. Счётчики результирующего массива и подмассива, откуда был взят элемент, увеличиваются на один.

**Сложность алгоритма**: O(n log n)