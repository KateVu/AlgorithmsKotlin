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

