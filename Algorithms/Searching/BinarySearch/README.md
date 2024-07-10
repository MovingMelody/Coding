### Binary Search Algorithm

- Faster than Linear search since the array is sorted, and we can eliminate half of the array in each iteration.
- Time Complexity O(logN) N is No. of Elements
- Implemented Order-Agnostic Binary Search. Algorithm which works on both ascending ordered array and descending ordered array.

```go
isAsc := nums[0] < nums[length-1]

	for low <= high {
		mid := low + (high-low)/2
		if nums[mid] == target {
			return mid
		}

		if isAsc {
			if nums[mid] > target {
				high = mid - 1
			} else {
				low = mid + 1
			}
		} else {
			if nums[mid] > target {
				low = mid + 1
			} else {
				high = mid - 1
			}
		}
	}

```
