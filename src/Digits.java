//Alexander Cox
//Tuesday, December 11, 2018

import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num)
    {
        int i = 1;
        int numDigs = 0;

        while (num % i != num)
        {
            numDigs++;
            i++;
        }

        for (i = 1; i < numDigs; i++)
        {
            digitList.add((0), ((num % (10 ^ i)) / (10 ^ (i - 1))));
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for (int i = 0; i < digitList.size() - 1; i++)
        {
            if (digitList.get(i) <= digitList.get(i + 1))
                return false;
        }
        return true;
    }

    public String getDigitList()
    {
        String str = "";

        for (int i : digitList)
        {
            str += i;
        }

        return str;
    }
}
