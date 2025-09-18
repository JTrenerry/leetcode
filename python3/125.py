
class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = s.replace(" ", "")
        regex = re.compile('[^a-z0-9]')
        s = regex.sub('', s)
        start = 0
        end = len(s) - 1
        while (start <= end):
            if (s[start] is not s[end]):
                return False
            start += 1
            end -= 1
        return True
