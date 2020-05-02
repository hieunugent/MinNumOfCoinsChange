# MinNumberOfCoinsForChange
- write a function that take denominations array and a target number, which will return smallest number of coin that need to make a change
- the denomiantions array is non empty and non negative
- return -1 if there is non return able
- we can use as many as coin that have the amount in denomination array
# Pseudocode
- build an array that collect the minimum of coin to make change from 1 to n 
- no need coin to make change for 0
- after build the array return the minimum number of array or as each time process the amount only save the min value so far
then return the last index

