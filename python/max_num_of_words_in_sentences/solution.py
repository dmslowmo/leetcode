from typing import List


class Solution:
    def __init__(self):
        pass

    def most_words_found(self, sentences: List[str]) -> int:
        sentences.sort(key=lambda x: len(x.split()))
        return len(sentences[-1].split())
