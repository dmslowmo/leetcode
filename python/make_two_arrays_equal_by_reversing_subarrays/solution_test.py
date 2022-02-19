import pytest

from solution import Solution


@pytest.fixture
def s():
    inst = Solution()
    return inst


testdata = [
    ([1, 2, 3, 4], [2, 4, 1, 3], True),
    ([7], [7], True),
    ([3, 7, 9], [3, 7, 11], False)
]


@pytest.mark.parametrize('target, arr, expected', testdata)
def test_happy_path(s, target, arr, expected):
    assert s.canBeEqual(target, arr) == expected
