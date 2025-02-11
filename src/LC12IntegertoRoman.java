
public class LC12IntegertoRoman {
    public static String intToRoman(int num) {
        if(num<1 || num>3999)
            return "";
        int digit = 1000;
        java.util.List<Integer> digits = new java.util.ArrayList<Integer>();
        while(digit>0)
        {
            digits.add(num/digit);
            num %= digit;
            digit /= 10;
        }
        StringBuilder res = new StringBuilder();
        res.append(convert(digits.get(0),'M',' ', ' '));
        res.append(convert(digits.get(1),'C','D', 'M'));
        res.append(convert(digits.get(2),'X','L', 'C'));
        res.append(convert(digits.get(3),'I','V', 'X'));
        return res.toString();
    }
    public static String convert(int digit, char one, char five, char ten)
    {
        StringBuilder res = new StringBuilder();
        switch(digit)
        {
            case 9:
                res.append(one);
                res.append(ten);
                break;
            case 8:
            case 7:
            case 6:
            case 5:
                res.append(five);
                for(int i=5;i<digit; i++)
                    res.append(one);
                break;
            case 4:
                res.append(one);
                res.append(five);
                break;
            case 3:
            case 2:
            case 1:
                for(int i=0; i<digit; i++)
                    res.append(one);
                break;
            default:
                break;
        }
        return res.toString();
    }
}
