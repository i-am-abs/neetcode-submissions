class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer_map = {}
        result_list = []
        for i in range(len(nums)):
            if (target - nums[i]) in answer_map:
                result_list.append(answer_map[target - nums[i]])
                result_list.append(i)
                
            answer_map[nums[i]] = i
        return result_list