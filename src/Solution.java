class Solution {
    public int reverse(int x) {
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder();

        if(str.charAt(0) == '-')
            sb.append('-');

        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        if(sb.charAt(sb.length() -1) == '-')
            sb.deleteCharAt(sb.length() - 1);
        try{
            return Integer.parseInt(sb.toString());

        } catch (NumberFormatException e) {
            return 0;
        }
        //return Integer.parseInt(sb.toString()) <= Integer.MAX_VALUE ? Integer.parseInt(sb.toString()) : 0;
    }
}