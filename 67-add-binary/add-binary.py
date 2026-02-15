class Solution:
    def addBinary(self, a: str, b: str) -> str:
        n = int(a,2)
        v = int(b,2)
        return bin(n+v)[2:]