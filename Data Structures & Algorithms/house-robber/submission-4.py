class Solution:
    def rob(self, cost: List[int]) -> int:
        dp = [-1] * len(cost)

        def dfs(i):
            if i >= len(cost):
                return 0
            if dp[i] != -1:
                return dp[i]

            dp[i] =max(dfs(i + 1), cost[i] + dfs(i+ 2))

            return dp[i]; 

        return max(dfs(0), dfs(1))
        
        
        # cost.append(0)
        # for i in range(len(cost) - 3, -1, -1):
        #     cost[i] += min(cost[i + 1] , cost[i + 2])
        
        # return min(cost[0], cost[1])