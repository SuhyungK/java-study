package 귤고르기;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int x: tangerine) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }


        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));

        for (Integer key: list) {
            k -= map.get(key);
            answer++;
            if (k <= 0) {
                return answer;
            }
        }

        return answer;
    }
}


public class Lv2_귤고르기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
}
