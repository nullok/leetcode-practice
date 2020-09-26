package com.caigouzi.dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：lihan
 * @description： 841. 钥匙和房间
 * @date ：2020/8/31 9:44
 */
public class Num841 {
    LinkedList<Integer> maps = new LinkedList<>();
    List<List<Integer>> ROOM;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.size() == 0) return false;
        ROOM = rooms;
        maps.add(0);
        dfs(ROOM.get(0));
        return maps.size() == rooms.size();
    }

    public void dfs(List<Integer> list) {
        for (Integer num : list) {
            if (maps.contains(num)) {
                continue;
            } else {
                maps.add(num);
                dfs(ROOM.get(num));
            }
        }
    }

    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        if (rooms == null || rooms.size() == 0) return false;
        ROOM = rooms;
        int[] map = new int[rooms.size()];
        map[0] = 1;
        dfs(ROOM.get(0),map);
        for (Integer n : map) {
            if (n == 0) {
                return false;
            }
        }
        return true;
    }

    public void dfs(List<Integer> list, int[] map) {
        for (Integer index : list) {
            if (map[index] == 1) {
                continue;
            } else {
                map[index] = 1;
                dfs(ROOM.get(index), map);
            }
        }
    }
}
