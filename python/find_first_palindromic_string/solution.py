from typing import List


def is_palindrome(word: str) -> bool:
    for i in range(0, int(len(word)/2)):
        if word[i] != word[-(i+1)]:
            return False
    return True


class Solution:
    def __init__(self):
        pass

    def firstPalindrome(self, words: List[str]) -> str:
        it = next((w for w in words if is_palindrome(w)), "")
        return it
