# remove-duplicates-2pointer.md

## 3–4 quick points

1. **Assumption:** array is sorted (non-decreasing).
2. **Pointers:** `i` = slow (last accepted unique), `j` = fast (scans). Start: `i=0`, `j=1`.
3. **Rule:** if `nums[i] == nums[j]` → `j++` (skip). If `nums[i] != nums[j]` → `i++`, `nums[i]=nums[j]`, `j++` (accept & copy).
4. **Answer:** number of uniques = `i + 1` (handle empty array separately).

---

## Movement in boxes (visual, small)

**When they MATCH (`nums[i] == nums[j]`) — skip:**

```
[ 1 ] [ 1 ] [ 2 ] [ 2 ] [ 3 ]
  i ->  j ->
Action: duplicate found → advance j only (i stays)
```

**When they DON'T MATCH (`nums[i] != nums[j]`) — copy & advance i:**

```
Before copy:
[ 1 ] [ 1 ] [ 2 ] [ 2 ] [ 3 ]
  i ->     j ->

Action:
1) i++ (move to next box)
2) nums[i] = nums[j] (copy j's value into that box)
3) j++

After copy:
[ 1 ] [ 2 ] [ 2 ] [ 2 ] [ 3 ]
     ^
     i (now points to newly accepted unique)
```

---

## Tiny pseudocode

```text
if n == 0: return 0
i = 0
for j in range(1, n):
    if nums[i] != nums[j]:
        i += 1
        nums[i] = nums[j]
return i + 1
```

*Saved as this MD file — open the canvas (left panel) to download or copy.*
