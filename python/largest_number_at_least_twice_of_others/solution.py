from typing import List

from solution_parent import SolutionParent


class Solution(SolutionParent):
    def dominantIndex(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0
        top = [-1, -1]
        for i, val in enumerate(nums):
            if top[0] == -1:
                top[0] = i
                continue
            if val > nums[top[0]]:
                top[0] = i
        for i, val in enumerate(nums):
            if top[1] == -1:
                if val == nums[top[0]]:
                    continue
                top[1] = i
                continue
            if val == nums[top[0]]:
                continue
            if val > nums[top[1]]:
                top[1] = i

        return top[0] if nums[top[0]] >= nums[top[1]] * 2 else -1
