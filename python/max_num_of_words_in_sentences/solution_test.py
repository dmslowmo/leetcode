import pytest as pytest

import solution


@pytest.fixture
def s():
    inst = solution.Solution()
    return inst


testdata = [
    (["alice and bob love leetcode", "i think so too", "this is great thanks very much"], 6),
    (["please wait", "continue to fight", "continue to win"], 3)
]


@pytest.mark.parametrize('sentences, expected', testdata)
def test_happy_path(s, sentences, expected):
    assert s.most_words_found(sentences) == expected
