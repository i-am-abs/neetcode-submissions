class Solution {
    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder ans = new StringBuilder();
        if (strs.size() == 0) {
            return "";
        }
        for (int i = 0; i < strs.size(); i++) {
            ans.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        int pointer = 0;
        List<String> result = new ArrayList<>();
        while (pointer < n) {
            int delimiter = str.indexOf("#", pointer);
            int length = Integer.parseInt(str.substring(pointer, delimiter));
            pointer = delimiter + 1;
            String word = str.substring(pointer, pointer + length);
            result.add(word);
            pointer = pointer + length;
        }
        return result;
    }
}