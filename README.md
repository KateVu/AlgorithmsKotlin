# AlgorithmsKotlin
Address some common algorithms with Kotlin

## List of algorithms
### Find the Symmetric Difference
- Requirements: 
    - The mathematical term symmetric difference (△ or ⊕) of two sets is the set of elements which are in either of the two sets but not in both. 
For example, for sets A = {1, 2, 3} and B = {2, 3, 4}, A △ B = {1, 4}.
    - Symmetric difference is a binary operation, which means it operates on only two elements. 
So to evaluate an expression involving symmetric differences among three elements (A △ B △ C), you must complete one operation at a time. Thus, for sets A and B above, and C = {2, 3}, A △ B △ C = (A △ B) △ C = {1, 4} △ {2, 3} = {1, 2, 3, 4}.
    - Function that takes two or more list and returns an list of their symmetric difference. The returned list must contain only unique values (no duplicates).
    
- Solution:
    - Function that take undefinded number by using vararg
    - To get only unique values used distinct()
- File: SymmetricDiff.kt

### Inventory Update
- Requirements: 
    - Compare and update the inventory stored in a 2D array against a second 2D array of a fresh delivery. 
    - Update the current existing inventory item quantities (in arr1). 
    - If an item cannot be found, add the new item and quantity into the inventory array. 
    - The returned inventory array should be in alphabetical order by item.
- Solution: 
    - Use ArrayList<Array<Any>> for params of the function
    - Iterating newInv, if item found -> add amount, if not -> add item
- File: InventoryUpdate.kt

### No Repeats Please
- Requirements:
    - Return the number of total permutations of the provided string that don't have repeated consecutive letters. 
    - Assume that all characters in the provided string are each unique (no need to handle duplicated in result)
    - For example, aab should return 2 because it has 6 total permutations (aab, aab, aba, aba, baa, baa), but only 2 of them (aba and aba) don't have the same letter (in this case a) repeating.
- Solution: 
    - split string into list of Char
    - Using Heap's algorithms to generate list of permutations 
    - Using regex to filter permuations that don't have repeated consecutive letters
- File: PermAlone.kt

### Pairwise
- Requirements:
    - Given an array arr, find element pairs whose sum equal the second argument arg and return the sum of their indices.
    - You may use multiple pairs that have the same numeric elements but different indices. 
    - Each pair should use the lowest possible available indices. Once an element has been used it cannot be reused to pair with another element. 
    - For instance, pairwise([1, 1, 2], 3) creates a pair [2, 1] using the 1 at index 0 rather than the 1 at index 1, because 0+2 < 1+2.
- Solution: 
    - Use a list to keep the index of used value
    - iterate the list (i)
        - if the value = arg -> add the value and move on 
        - if i is not the last: iterate from (i + 1) to last item and check
- File: Pairwise.kt
    
### Bubble Sort
- Requirements:
    - Sort list without using built-in .sort
    - The bubble sort method starts at the beginning of an unsorted array and 'bubbles up' unsorted values towards the end, iterating through the array until it is completely sorted
- File: BubbleSort.kt

### Selection Sort
- Requirements: 
    - Selection sort works by selecting the minimum value in a list and swapping it with the first value in the list. 
    - It then starts at the second position, selects the smallest value in the remaining list, and swaps it with the second element. 
    - It continues iterating through the list and swapping elements until it reaches the end of the list
- File: SelectionSort.kt

### Insertion Sort
- Requirements: 
    - Building up a sorted array at the beginning of the list. 
    - It begins the sorted array with the first element. 
    - hen it inspects the next element and swaps it backwards into the sorted array until it is in sorted position. 
    - It continues iterating through the list and swapping new items backwards into the sorted portion until it reaches the end.
- File: InsertionSort.kt

### Quick Sort
- Requirements: 
    - A pivot value is chosen in the original array.
    - The array is then partitioned into two subarrays of values less than and greater than the pivot value.
    - We then combine the result of recursively calling the quick sort algorithm on both sub-arrays.
    - This continues until the base case of an empty or single-item array is reached, which we return.
    - The unwinding of the recursive calls return us the sorted array
- File: QuickSort.kt

### Merge Sort
- Requirements: 
    - Recursively split the input array in half until a sub-array with only one element is produced.
    - Merge each sorted sub-array together to produce the final sorted array.
- File: MergeSort.kt
