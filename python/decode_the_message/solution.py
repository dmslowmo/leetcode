"""
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

"""


class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        a = ord('a')
        # build the cipher dictionary
        cipher = {" ": " "}
        i = 0
        for ch in key:
            if ch == ' ' or ch in cipher:
                continue
            cipher[ch] = chr(a + i)
            i += 1

        ans = [cipher[j] for j in message]
        return "".join(ans)
