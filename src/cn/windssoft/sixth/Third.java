package cn.windssoft.sixth;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/6/10.
 */
public class Third {
    String foundPerson(String[] people) {
        List candidates = Arrays.asList(new String[] {"Don", "John", "kent"});
        for (int i = 0; i < people.length; i++) {
            if (candidates.contains(people[i])) {
                return people[i];
            }
        }
        return "";
    }
}
