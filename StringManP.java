public class StringManP {
    private String text1, text2;
    public StringManP()
    {
        text1 = "";
        text2 = "";
    }
    public StringManP(String a, String b)
    {
        text1 = a;
        text2 = b;
    }
    public String combined()
    {
        return text1 + text2;
    }
    public int getCombinedLength()
    {
        return text1.length() + text2.length();
    }
    public String firstHalf()
    {
        return text1.substring(0, text1.length() / 2);
    }
    public int indexFirstLetter()
    {
        String indexOf = text2.substring(0, 1);
        return text1.indexOf(indexOf);
    }
    public String swapFirstAndSecondHalf()
    {
        String s = "";
        //EVAN
        if(text1.length() % 2 == 0)
        {
            String FHalf1 = text1.substring(0, text1.length() / 2);
            String SHalf1 = text1.substring(text1.length() / 2, text1.length());
            s = SHalf1 + FHalf1;
        }
        //ODD
        if(text1.length() % 2 == 1)
        {
            String FHalf2 = text2.substring(0, text2.length() / 2);
            String SHalf2 = text2.substring(text2.length() / 2, text2.length());
            s = SHalf2 + FHalf2;
        }
        return s;
    }
}