package com.account.utils;
import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * Created by superMrl on 2018/7/22.
 */
public class CommonUtils {

    public static <T> boolean isNull(T... objects) {
        for (T obj : objects)
            if (null == obj) {
                return true;
            }
        return false;
    }

    public static <T> boolean notNull(T... objects) {
        for (T obj : objects)
            if (null == obj) {
                return false;
            }
        return true;
    }

    public static boolean isBlank(String... objects) {

        for (String obj : objects) {
            if (StringUtils.isNotEmpty(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Collection collection) {
        if (isNull(collection)) {
            return true;
        }
        if (collection.size() <= 0) {
            return true;
        }
        return false;
    }

    public static boolean validateNumber(String value) {
        try {
            new BigDecimal(value);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 给map的key值累加和.
     *
     * @param id
     * @param step
     * @param map
     */
    public static void calIntegerMap(Integer id, int step, Map<Integer, Integer> map) {
        Integer num = map.get(id);
        if (num == null) {
            num = 0;
        }
        map.put(id, num + step);
    }

}
