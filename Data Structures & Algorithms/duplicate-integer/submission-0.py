class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        temp = {}
        for num in nums:
            temp[num] = 0
        for num in nums:
            temp[num] += 1
        
        for key, value in temp.items():
            if value > 1:
                return True
        return False
        