from typing import List

from solution_parent import SolutionParent


class Solution(SolutionParent):
    def findFinalValue(self, nums: List[int], original: int) -> int:
        nums.sort()
        for num in nums:
            if num == original:
                original *= 2
        return original
