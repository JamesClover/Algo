class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        
        if len(word1) != len(word2):
            return False

        word1Count = Counter(word1)
        word2Count = Counter(word2)

        if set(word1Count.keys()) != set(word2Count.keys()):
            return False

        word1Sort = sorted(word1Count.values())
        word2Sort = sorted(word2Count.values())

        return word1Sort == word2Sort

        