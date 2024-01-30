  #              Домашнее задание к Уроку 1


## 1. Описание основных недостатков реализованного варианта

В основной класс были добавлены методы определяющие новое поведение объекта.
Данные методы требуют переопределения в классах наследниках для активации

Declare the counter variable "**count**" and initialize it with the value of "**0**".
As an example the following array is used for the task ```[“Hello”, “2”, “world”, “:-)”]```.

## 2. Способы решения возникших проблем

1. Declare index variable "**i**" and initialize it with the value of "**0**";
2. Loop through the "***stringArray***" array and move all 3 or fewer letter elements to the left;
   - if "*i*" is less than the length of the array then keep checking the elements of the array;
   - swap the values between "*stringArray[ i ]*" and "*stringArray[ count ]*" and increment the value of the counter "*count*" if the size of "*stringArray[ i ]*" is less then 4;
   - increment the value of index "*i*";
   - if "*i*" is equal to the length of the array proceed to the next step **3**, else return to point ***2*** step **2**
