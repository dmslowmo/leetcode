import pytest as pytest

import solution


@pytest.fixture
def s():
    inst = solution.Solution()
    return inst


testdata = [
    ([5, 3, 6, 1, 12], 3, 24),
    ([2, 7, 9], 4, 4)
]


@pytest.mark.parametrize('nums, original, expected', testdata)
def test_happy_path(s, nums, original, expected):
    assert s.findFinalValue(nums, original) == expected
