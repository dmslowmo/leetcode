from typing import List

from solution_parent import SolutionParent


class Solution(SolutionParent):
    def minCostToMoveChips(self, position: List[int]) -> int:
        odd_count = 0
        even_count = 0
        for i in position:
            if i % 2 == 0:
                even_count += 1
            else:
                odd_count += 1

        return min(even_count, odd_count)

