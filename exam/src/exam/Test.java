package exam;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args)throws Exception {
		int k, i, m, n, f;
		String str;
		String yonghuming;
		String mima;
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		User user1 = new User("a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa");
		User user2 = new User("b", "bb", "bbb", "bbbb", "bbbbb", "bbbbbb");
		User user3 = new User("c", "cc", "ccc", "cccc", "ccccc", "cccccc");
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		List list4 = new ArrayList();
		List yonghu = new ArrayList();
		yonghu.add(user1);
		yonghu.add(user2);
		yonghu.add(user3);
		List musicList = new ArrayList();
		Music music1 = new Music(1, "a", "aa", "aaa");
		Music music2 = new Music(2, "b", "bb", "bbb");
		Music music3 = new Music(3, "c", "cc", "ccc");
		Music music4 = new Music(4, "d", "dd", "ddd");
		Music music5 = new Music(5, "e", "ee", "eee");
		Music music6 = new Music(6, "f", "ff", "fff");
		Music music7 = new Music(7, "g", "gg", "ggg");
		Music music8 = new Music(8, "h", "hh", "hhh");
		Music music9 = new Music(9, "i", "ii", "iii");
		Music music10 = new Music(10, "j", "jj", "jjj");
		Music music11 = new Music(11, "k", "kk", "kkk");
		Music music12 = new Music(12, "l", "ll", "lll");
		Music music13 = new Music(13, "m", "mm", "mmm");
		Music music14 = new Music(14, "n", "nn", "nnn");
		Music music15 = new Music(15, "o", "oo", "ooo");
		Music music16 = new Music(16, "p", "pp", "ppp");
		Music music17 = new Music(17, "q", "qq", "qqq");
		Music music18 = new Music(18, "r", "rr", "rrr");
		Music music19 = new Music(19, "s", "ss", "sss");
		Music music20 = new Music(20, "t", "tt", "ttt");
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(music3);
		musicList.add(music4);
		musicList.add(music5);
		musicList.add(music6);
		musicList.add(music7);
		musicList.add(music8);
		musicList.add(music9);
		musicList.add(music10);
		musicList.add(music11);
		musicList.add(music12);
		musicList.add(music13);
		musicList.add(music14);
		musicList.add(music15);
		musicList.add(music16);
		musicList.add(music17);
		musicList.add(music18);
		musicList.add(music19);
		musicList.add(music20);
		Map<String, List> User = new HashMap<String, List>();
		Map<String, String> user = new HashMap<String, String>();
		User.put(user1.getUserId(), list1);
		User.put(user2.getUserId(), list2);
		User.put(user3.getUserId(), list3);
		
		while (true) {
			System.out.println("1-��½,2-ע�ᣬ3-�˳���¼");
			System.out.println("������Ҫִ�еĲ���ǰ�ı�ţ�");
			Scanner sc = new Scanner(System.in);
			k = sc.nextInt();
			if (k == 3) {
				System.out.println("�˳���¼��");
				continue;
			}
			if (k == 2) {
				System.out.println("�������û�id��");
				String key = sc.next();
				System.out.println("���������룺");
				String value = sc.next();
				User user4 = new User(key, "", value, "", "", "");
				user.put(key, value);
				User.put(key, list4);
				yonghu.add(user4);
			}
			if (k == 1) {
				Set<Entry<String, String>> entrySet = user.entrySet();
				System.out.println("�������û�id��");
				yonghuming = sc.next();
				System.out.println("���������룺");
				mima = sc.next();
				m = 1;
				for (Entry<String, String> entry : entrySet) {
					if (yonghuming.equals(entry.getKey()) && mima.equals(entry.getValue()))
						break;
					m++;
				}
				if (m >= 5)
					System.out.println("�˺��������");
				Set<Entry<String, List>> entryset = User.entrySet();
				for (Entry<String, List> entry : entryset) {
					if (yonghuming.equals(entry.getKey())) {
						System.out.println("��¼�ɹ�!");
						while (true) {
							System.out.println("1-�������ң�2-�û��赥����3-���Ų�����4-�û���Ϣ�޸�");
							System.out.println("��ѡ��ִ�в���ѡ�");
							k = sc.nextInt();
							if (k == 1) {
								System.out.println("1-ͨ�����Ʋ��ң�2-ͨ�����ֲ��ң�3-ͨ������������");
								System.out.println("��ѡ�����·����");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("���������ƣ�");
									str = sc.next();
									for (i = 0; i < musicList.size(); i++) {
										if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
											System.out.println("�ҵ������ˣ�������ϢΪ��" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("û�ҵ���");
									}
								} else if (k == 2) {
									System.out.println("������������֣�");
									str = sc.next();
									for (i = 0; i < 20; i++) {
										if (((Music) (musicList.get(i))).getMusicSinger().equals(str)) {
											System.out.println("�ҵ������ˣ�������ϢΪ��" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("û�ҵ���");
									}
								} else if (k == 3) {
									System.out.println("������������");
									str = sc.next();
									for (i = 0; i < musicList.size(); i++) {
										if (((Music) (musicList.get(i))).getMusicCate().equals(str)) {
											System.out.println("�ҵ������ˣ�������ϢΪ��" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("û�ҵ���");
									}
								}
							} else if (k == 2) {
								System.out.println("1-�����ղأ�2-ɾ���ղأ�3-�޸��ղ�");
								System.out.println("������Ҫִ�еĲ�����");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("1-���ø���������2-���ø���ID����");
									System.out.println("������������ʽ��");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("������������ƣ�");
										str = sc.next();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
												((Music) (musicList.get(i))).setDateTime(df.format(date));
												entry.getValue().add(musicList.get(i));
												System.out.println("����ɹ���");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
										if (i == musicList.size()) {
											System.out.println("�޴˸�����");
										}
									} else if (k == 2) {
										System.out.println("���������id��");
										n = sc.nextInt();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicId() == n) {
												((Music) (musicList.get(i))).setDateTime(df.format(date));
												entry.getValue().add(musicList.get(i));
												System.out.println("����ɹ���");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
										if (i == musicList.size()) {
											System.out.println("�޴˸�����");
										}
									}
								} else if (k == 2) {
									System.out.println("1-���ø���ɾ����2-���ø���IDɾ��");
									System.out.println("������ɾ����ʽ��");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("������������ƣ�");
										str = sc.next();
										for (i = 0; i < entry.getValue().size(); i++) {
											if (((Music) (entry.getValue().get(i))).getMusicCate().equals(str)) {
												entry.getValue().remove(i);
												System.out.println("����ɹ���");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
									} else if (k == 2) {
										System.out.println("���������id��");
										n = sc.nextInt();
										for (i = 0; i < entry.getValue().size(); i++) {
											if (((Music) (entry.getValue().get(i))).getMusicId() == n) {
												entry.getValue().remove(i);
												System.out.println("����ɹ���");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
									}
								} else if (k == 3) {
									System.out.println("1-���ø����޸ģ�2-���ø���ID�޸�");
									System.out.println("�������޸ķ�ʽ��");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("������Ҫ�޸ĵĸ�������");
										str = sc.next();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
												System.out.println("�������µĸ�������");
												str = sc.next();
												((Music) (musicList.get(i))).setMusicName(str);
												System.out.println("����ɹ���");
												User.put(yonghuming, musicList);
												break;
											}
										}
									} else if (k == 2) {
										System.out.println("������Ҫ�޸ĵĸ���id��");
										n = sc.nextInt();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicId() == n) {
												System.out.println("�������µĸ���id��");
												n = sc.nextInt();
												((Music) (musicList.get(i))).setMusicId(n);
												System.out.println("����ɹ���");
												User.put(yonghuming, list1);
												break;
											}
										}
									}
								}

							} else if (k == 3) {
								m = 0;
								while (true) {
									System.out.println("1-����,2-��������");
									System.out.println("�����������");
									n = sc.nextInt();
									if (n == 1) {
										f = m;
										for (; f < musicList.size();) {
											System.out.println("��ǰ���ڲ���:" + ((Music) (musicList.get(f))).getMusicName());
											System.out.println("3-��ͣ��-4��������,5-������һ��");
											System.out.println("�����������");
											k = sc.nextInt();
											if (k == 3) {
												m = f;
												f = musicList.size() + 1;
												System.out.println("��ͣ�ɹ�");
											} else if (k == 4) {
												break;
											} else if (k == 5)
												f++;
										}
									} else if (n == 2 || k == 4) {
										System.out.println("��������");
										break;
									}
								}
							} else if (k == 4) {
								for (i = 0; i < yonghu.size(); i++) {
									if (((User) (yonghu.get(i))).getUserId().equals(yonghuming))
										break;
								}
								System.out.println("1-�û�ID��2-�û�����3-�û����룬4-�û��ǳƣ�5-�û����գ�6-�û�����ǩ��");
								System.out.println("������Ҫ�޸ĵ���Ϣ");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("�������޸ĺ���û�ID");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserId(str);
								} else if (k == 2) {
									System.out.println("�������޸ĺ���û���");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserName(str);
								} else if (k == 3) {
									System.out.println("�������޸ĺ���û�����");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserCode(str);
								} else if (k == 4) {
									System.out.println("�������޸ĺ���û��ǳ�");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserNick(str);
								} else if (k == 5) {
									System.out.println("�������޸ĺ���û�����");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserBirth(str);
								} else if (k == 6) {
									System.out.println("�������޸ĺ���û�����ǩ��");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserSign(str);
								}
							}
						}
					}
				}
			}

		}
	}
}