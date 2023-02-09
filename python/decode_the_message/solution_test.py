import unittest

from solution import Solution


class MyTestCase(unittest.TestCase):
    def test_something(self):
        test_cases = (
            {"case": "case_1", "params": ["the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"], "expected": "this is a secret"},
            {"case": "case_2", "params": ["eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"], "expected": "the five boxing wizards jump quickly"}
        )
        s = Solution()
        for test_case in test_cases:
            with self.subTest(test_case["case"]):
                params = test_case["params"]
                self.assertEqual(test_case["expected"], s.decodeMessage(params[0], params[1]))
