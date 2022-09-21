def solution(n):
    li = list(str(n))
    li.sort(reverse = True)
    answer = int("".join(li))
    return answer