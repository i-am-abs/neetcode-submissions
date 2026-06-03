class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (!map.containsKey(getKey(strs[i]))) {
                map.put(getKey(strs[i]), new ArrayList<>());
            }
            map.get(getKey(strs[i])).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    private static String getKey(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
