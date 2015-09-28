package org.dimigo.collection; 
 

 import java.util.LinkedList; 
 import java.util.List; 
 
 public class MelonChart { 
 
 	public static void main(String[] args) { 
 		List<Music> list=new LinkedList(); 
 		list.add(new Music("�ٶ��̳� �� ��","����")); 
 		list.add(new Music("���뿬��","�ڰ�")); 
 		list.add(new Music("��������","iKon")); 
 		System.out.println("-- << ��� íƮ >> --"); 
         printList(list); 
         System.out.println("-- << 2�� �� �߰� >> --"); 
         list.add(new Music("����", "��������")); 
         printList(list); 
         System.out.println("-- << 3�� �� ���� >> --"); 
         list.get(2).setTitle("���һ�"); 
         list.get(2).setSinger("Ȳ����"); 
         printList(list); 
         System.out.println("-- << 4�� �� ���� >> --"); 
         list.remove(3); 
         printList(list); 
         System.out.println("-- << ��ü ����Ʈ ���� >> --"); 
         list.clear(); 
         printList(list); 
 	} 
 	public static void printList(List<Music> list){ 
 		int count=0; 
         for (Music music : list) 
         { 
            System.out.println(""+count+++". "+music.toString()); 
         } 
	} 
} 
