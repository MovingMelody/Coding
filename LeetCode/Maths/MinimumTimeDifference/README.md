# [539. Minimum Time Difference](https://leetcode.com/problems/minimum-time-difference/description/?envType=daily-question&envId=2024-09-16)

Given a list of 24-hour clock time points in **"HH:MM"** format, return the minimum <b>minutes</b> difference between any two time-points in the list.

**Example 1:**

```
Input: timePoints = ["23:59","00:00"]
Output: 1
```

**Example 2:**

```
Input: timePoints = ["00:00","23:59","00:00"]
Output: 0
```

**Constraints:**

- `2 <= timePoints.length <= 2 * 10^4`
- `timePoints[i]` is in the format **"HH:MM"** .
