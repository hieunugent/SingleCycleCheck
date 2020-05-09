# SingleCycleCheck 
- as an input array where each value in array represents a jump of its value in the array. 
- for instance integer 3 will make jump of 3 forward, -1 will make jump of 1 backward
- as the last index if is 1 will jump back to index 0, that call wrap around
- as the index 0 if is -1 it will jump back to the index last.
- write a function that return a boolean representing weather the jumps in the array form a single cycle .
- A Single Cycle  is can start at any index in  the array and following jump every element in the array is visited exactly once before landing back on the starting index
# solution 
 - since start at any where in the array is the same so , choose start at index 0 and end at 0 for on single cycle 
 - have one variable to keep track that maximum step alow to move in once cycle => length of array so if no more step alow to move and it not comeback to the original start return false
 - the logic behind: 
    - if during loop it come back to starting index return false, 
    - if during the loop it repeat any index it will not be able to comeback the starting point after run out step
 - at the end of loop check the current index of it come back to starting return true.
 - during the process we need some helper function
    - wrap around function, that make sure only move in the range of array
    - since need to move in the index and the step from value of current index, so we need an function getNextindex from value of current value.
   
