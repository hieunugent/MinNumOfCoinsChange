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
- input: denomination[1, 2, 4] target money $6
- created an numsCoin array  with size 7
- index  : 0 1 2 3 4 5 6 
- init   : 0 0 0 0 0 0 0 
- denom 1: 0 1 2 3 4 5 6 
- denom 2: 0 1 1 2 2 3 3 only get minimum numbers coin amount
- denom 4: 0 1 1 2 1 2 2
- return numsCoin[6]
- the fomular used for update minimum numsCoin[i] = min(numsCoin[amount], 1+ numsCoin[demon - amount)



