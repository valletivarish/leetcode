class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = sortString(strs[i]);
            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(strs[i]);
            } else {
                ArrayList<String> array = new ArrayList<>();
                array.add(strs[i]);
                hashMap.put(key, array);

            }

        }
        return new ArrayList<>(hashMap.values());

    }

    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
