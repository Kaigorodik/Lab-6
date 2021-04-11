# Lab-6
1. Выполнение заданий для самостоятельной работы:

1.1. Напишите программу с классом, в котором есть два поля: символьное и текстовое. В классе должен быть перегруженный метод для присваивания значений полям. Если метод вызывается с символьным аргументом, то соответствующее значение присваивается символьному полю. Если метод вызывается с текстовым аргументом, то он определяет значение текстового поля. Методу аргументом также может передаваться символьный массив. Если массив состоит из одного элемента, то он определяет значение символьного поля. В противном случае (если в массиве больше одного элемента) из символов массива формируется текстовая строка и присваивается значением текстовому полю.

1.2. Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле с начальным нулевым значением. В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля, после чего значение поля увеличивается на единицу.

1.3. Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива, позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.

1.4. Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, переданного аргументом методу. По определению, двойной факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15. Предложите версию метода без рекурсии и с рекурсией.

1.5. Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел 1 2 + 22 + 32 + ... + п 2 . Число п передается аргументом методу. Предложите версию метода с рекурсией и без рекурсии. Для проверки результата можно использовать формулу 12 + 22 +3 2+…+n 2= (n+l) (2n + 1)/6.

1.6. Напишите программу со статическим методом, которому аргументом передается целочисленный массив и целое число. Результатом метод возвращает ссылку на новый массив, который получается из исходного массива (переданного первым аргументом методу), если в нем взять несколько начальных элементов. Количество элементов, которые нужно взять из исходного массива, определяются вторым аргументом метода. Если второй аргумент метода больше длины массива, переданного

первым аргументом, то методом создается копия исходного массива и возвращается ссылка на эту копию.

1.7. Напишите программу со статическим методом, аргументом которому передастся символьный массив, а результатом возвращается ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.

1.8. Напишите программу со статическим методом, аргументом которому передается целочисленный массив, а результатом возвращается среднее значение для элементов массива (сумма значений элементов, деленная на количество элементов в массиве).

1.9. Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив. В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним и так далее.

1.10. Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных аргументов. Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений среди аргументов, переданных методу.
