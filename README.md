# sequence
API Rest que devuelve el número Fibonacci que corresponde al índice dado

PROCESO DE PENSAMIENTO:

Cuando se decide utilizar un enfoque iterativo para calcular el número de Fibonacci por índice, el proceso de pensamiento típico implica considerar las siguientes consideraciones:

1. Identificar la necesidad de un enfoque iterativo: El enfoque iterativo se elige generalmente cuando el valor de n es grande y un enfoque recursivo puede resultar en tiempos de ejecución excesivos o desbordamientos de pila. Es importante considerar la eficiencia y los recursos disponibles al tomar esta decisión.

2. Comprender la secuencia de Fibonacci: Es necesario comprender cómo se construye la secuencia de Fibonacci para diseñar una solución iterativa adecuada. La secuencia de Fibonacci comienza con los valores iniciales de 0 y 1, y cada número subsiguiente es la suma de los dos números anteriores.

3. Establecer variables iniciales: En el enfoque iterativo, se utilizan variables para realizar un seguimiento de los números anteriores necesarios para calcular el siguiente número en la secuencia. Por lo general, se establecen variables para almacenar los valores anteriores, como a y b.

4. Utilizar un bucle para calcular el número de Fibonacci: Se utiliza un bucle (como un bucle for o while) para iterar desde el índice 2 hasta el índice deseado n. Dentro del bucle, se actualizan las variables para calcular el siguiente número de Fibonacci en cada iteración.

5. Retornar el número de Fibonacci: Una vez que se completa el bucle, se tiene el número de Fibonacci correspondiente al índice n, que se devuelve como resultado de la función o se utiliza según sea necesario.

En general, el enfoque iterativo permite calcular eficientemente números de Fibonacci para valores grandes de n. Al seguir este proceso de pensamiento, se puede implementar correctamente un método iterativo para calcular el número de Fibonacci por índice.
