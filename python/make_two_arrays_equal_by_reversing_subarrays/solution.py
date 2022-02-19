from typing import List

from solution_parent import SolutionParent

import numpy as np


class Solution(SolutionParent):
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        target.sort()
        arr.sort()
        return target == arr
