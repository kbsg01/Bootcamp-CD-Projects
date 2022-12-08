public class ManipuladorCadenas {
    public String trimAndConcat(String stg1, String stg2) {
        String result = stg1.trim() + stg2.trim();
        return result;
    }

    public Integer getIndexOrNull(String stg, char ch) {
        if(stg.indexOf(ch) >= 0){
            return stg.indexOf(ch);
        }else{
            return null;
        }
    }
    public Integer getIndexOrNull(String s, String ss) {
        if(s.indexOf(ss) >= 0){
            return s.indexOf(ss);
        }else{
            return null;
        }
    }

    public String concatSubString(String srt1, int a, int b, String srt2){
        return srt1.substring(a, b).concat(srt2);
    }
}
