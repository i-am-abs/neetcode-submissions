class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer_map = {}
        for i in range(len(nums)):
            if (target - nums[i]) in answer_map:
                return [answer_map[target - nums[i]], i]
            answer_map[nums[i]] = i
        return []