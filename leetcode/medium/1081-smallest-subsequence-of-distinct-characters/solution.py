class Solution:
    def smallestSubsequence(self, s: str) -> str:
        # Store last occurrence of each character
        last_index = {}
        for i, ch in enumerate(s):
            last_index[ch] = i

        stack = []
        visited = set()

        for i, ch in enumerate(s):

            # Skip if already included
            if ch in visited:
                continue

            # Remove larger characters if they appear later
            while stack and stack[-1] > ch and last_index[stack[-1]] > i:
                visited.remove(stack.pop())

            stack.append(ch)
            visited.add(ch)

        return "".join(stack)