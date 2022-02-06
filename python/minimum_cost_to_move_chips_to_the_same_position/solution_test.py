import pytest

from solution import Solution


@pytest.fixture()
def s():
    inst = Solution()
    return inst


testdata = [
    ([1, 2, 3], 1),
    ([2, 2, 2, 3, 3], 2),
    ([1, 1000000000], 1)
]


@pytest.mark.parametrize('positions, expected', testdata)
def test_happy_path(s, positions, expected):
    assert s.minCostToMoveChips(positions) == expected
