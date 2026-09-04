class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] letters=words[i].toCharArray();
            for(int j=0;j<letters.length;j++){
                if(letters[j]==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
        
    }
}