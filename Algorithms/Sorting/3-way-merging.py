def merge_three_lists(list1, list2, list3):
    # Initialize pointers for all three lists
    i, j, k = 0, 0, 0
    merged_list = []

    # Loop until all lists are exhausted
    while i < len(list1) or j < len(list2) or k < len(list3):
        # Find the minimum of the current elements in all three lists
        min_val = float('inf')
        if i < len(list1):
            min_val = list1[i]
        if j < len(list2) and list2[j] < min_val:
            min_val = list2[j]
        if k < len(list3) and list3[k] < min_val:
            min_val = list3[k]
        
        # Add the smallest element to the merged list and move the respective pointer
        if i < len(list1) and list1[i] == min_val:
            merged_list.append(list1[i])
            i += 1
        elif j < len(list2) and list2[j] == min_val:
            merged_list.append(list2[j])
            j += 1
        elif k < len(list3) and list3[k] == min_val:
            merged_list.append(list3[k])
            k += 1

    return merged_list

# Example usage
list1 = [1, 4, 7]
list2 = [2, 5, 8]
list3 = [3, 6, 9]
print(merge_three_lists(list1, list2, list3))
