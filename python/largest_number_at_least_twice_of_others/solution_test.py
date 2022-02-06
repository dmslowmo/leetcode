import pytest

from solution import Solution


@pytest.fixture
def s():
    inst = Solution()
    return inst


testdata = [
    ([3, 6, 1, 0], 1),
    ([1, 2, 3, 4], -1),
    ([1], 0),
    ([1, 0], 0),
    ([0, 0, 0, 1], 3)
]


@pytest.mark.parametrize('nums, expected', testdata)
def test_happy_path(s, nums, expected):
    assert s.dominantIndex(nums) == expected
