//Alexander Cox
//Tuesday, December 11, 2018

import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList = new ArrayList<>();

    public Digits(int num)
    {
        while (num > 0)
        {
            digitList.add((0), (num % 10));
            num = num / 10;
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size() - 1; i++)
        {
            if (digitList.get(i) >= digitList.get(i + 1))
                return false;
        }
        return true;
    }

    public String getDigitList()
    {
        String str = "[";

        for (int i : digitList)
        {
            str += i + ", ";
        }

        str = str.substring(0, str.length() - 2);
        str += "]";
        return str;
    }
}
