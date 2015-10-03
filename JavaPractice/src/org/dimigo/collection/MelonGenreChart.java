package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,List<Music>> map = new HashMap();
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("�� ù���" , "������"));
		ballad.add(new Music("�� �ٽ� ���" , "��â��"));
		ballad.add(new Music("�λ꿡 ����" , "������"));
		map.put("�߶��",ballad);
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("Ŀ��", "����ȯ,�迹��"));
		dance.add(new Music("�� �ߵɰž�" , "��"));
		map.put("��", dance);
		System.out.println("------<<��� �帣�� íƮ>>-------");
		printMap(map);
		System.out.println("------<<�߶�� 3���� ����>>--------");
		ballad.set(2, new Music("����� ������" , "������"));
		printMap(map);
		System.out.println("------<<�߶�� 1���� ����>>---------");
		ballad.remove(0);
		printMap(map);
		System.out.println("-------<<��ü ����Ʈ ����>>---------");
	}
	public static void printMap(Map<String , List<Music>> map){
		int count = 1 ; 
		for(String key : map.keySet()){
			List<Music> list=map.get(key);
			System.out.println("["+key+"]");
			for(Music music:list){
				System.out.println(count+++"."+music.toString());
			}
			count=1;
		}
	}
}
