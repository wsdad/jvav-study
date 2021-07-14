package test1;

import java.security.SecureRandom;
import java.util.*;
import java.util.zip.DataFormatException;

public class PokerDemo {
    public static void main(String[] args) {
        //记录开始时间
        long time = System.currentTimeMillis();
        //新建牌号
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 54; i++) {
            array.add(i);
        }
        //打散牌
        Collections.shuffle(array);
        //新建玩家
        Set<Integer> player1 = new TreeSet<Integer>();
        Set<Integer> player2 = new TreeSet<Integer>();
        Set<Integer> player3 = new TreeSet<Integer>();
        Set<Integer> diPai = new TreeSet<Integer>();
        //分牌
        for (int i = 0; i < array.size(); i++) {
            Integer pai = array.get(i);
            if (i >= array.size() - 3) {
                diPai.add(pai);
            } else if (i % 3 == 0) {
                player1.add(pai);
            } else if (i % 3 == 1) {
                player2.add(pai);
            } else {
                player3.add(pai);
            }
        }
        HashMap<Integer, String> pokerPai = newPoker();
        //看牌
        lookPock("玩家1", player1, pokerPai);
        lookPock("玩家2", player2, pokerPai);
        lookPock("玩家3", player3, pokerPai);
        lookPock("底牌", diPai, pokerPai);
        //输出运行时间
        System.out.println("总共运行：" + (System.currentTimeMillis() - time) + "毫秒");
    }

    //看牌方法
    private static void lookPock(String player, Set<Integer> pais, HashMap<Integer, String> pokerPai) {
        System.out.print(player + "的牌是：");

        for (Integer pai : pais) {
            System.out.print(pokerPai.get(pai) + " ");
        }
        System.out.print("\n");
		//测试用注释
		//本机
    }

    //牌组的键值对
    private static HashMap<Integer, String> newPoker() {
        HashMap<Integer, String> pokerPai = new HashMap<Integer, String>();
        String[] colors = {"♦", "♠", "♥", "♣"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int num = 0;
        for (String number : numbers) {
            for (String color : colors) {
                pokerPai.put(num++, color + number);
            }
        }
        pokerPai.put(num++, "大王");
        pokerPai.put(num, "小王");
        return pokerPai;
    }
}
