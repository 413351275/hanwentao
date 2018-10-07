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
			System.out.println("1-登陆,2-注册，3-退出登录");
			System.out.println("请输入要执行的操作前的编号：");
			Scanner sc = new Scanner(System.in);
			k = sc.nextInt();
			if (k == 3) {
				System.out.println("退出登录！");
				continue;
			}
			if (k == 2) {
				System.out.println("请输入用户id：");
				String key = sc.next();
				System.out.println("请输入密码：");
				String value = sc.next();
				User user4 = new User(key, "", value, "", "", "");
				user.put(key, value);
				User.put(key, list4);
				yonghu.add(user4);
			}
			if (k == 1) {
				Set<Entry<String, String>> entrySet = user.entrySet();
				System.out.println("请输入用户id：");
				yonghuming = sc.next();
				System.out.println("请输入密码：");
				mima = sc.next();
				m = 1;
				for (Entry<String, String> entry : entrySet) {
					if (yonghuming.equals(entry.getKey()) && mima.equals(entry.getValue()))
						break;
					m++;
				}
				if (m >= 5)
					System.out.println("账号密码错误");
				Set<Entry<String, List>> entryset = User.entrySet();
				for (Entry<String, List> entry : entryset) {
					if (yonghuming.equals(entry.getKey())) {
						System.out.println("登录成功!");
						while (true) {
							System.out.println("1-歌曲查找，2-用户歌单管理，3-播放操作，4-用户信息修改");
							System.out.println("请选择执行操作选项：");
							k = sc.nextInt();
							if (k == 1) {
								System.out.println("1-通过名称查找，2-通过歌手查找，3-通过歌曲类别查找");
								System.out.println("请选择查找路径：");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("请输入名称：");
									str = sc.next();
									for (i = 0; i < musicList.size(); i++) {
										if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
											System.out.println("找到歌曲了！歌曲信息为：" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("没找到！");
									}
								} else if (k == 2) {
									System.out.println("请输入歌手名字：");
									str = sc.next();
									for (i = 0; i < 20; i++) {
										if (((Music) (musicList.get(i))).getMusicSinger().equals(str)) {
											System.out.println("找到歌曲了！歌曲信息为：" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("没找到！");
									}
								} else if (k == 3) {
									System.out.println("请输入歌曲类别：");
									str = sc.next();
									for (i = 0; i < musicList.size(); i++) {
										if (((Music) (musicList.get(i))).getMusicCate().equals(str)) {
											System.out.println("找到歌曲了！歌曲信息为：" + musicList.get(i));
											break;
										}
									}
									if (i == musicList.size()) {
										System.out.println("没找到！");
									}
								}
							} else if (k == 2) {
								System.out.println("1-新增收藏，2-删除收藏，3-修改收藏");
								System.out.println("请输入要执行的操作：");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("1-利用歌名新增，2-利用歌曲ID新增");
									System.out.println("请输入新增方式：");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("请输入歌曲名称：");
										str = sc.next();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
												((Music) (musicList.get(i))).setDateTime(df.format(date));
												entry.getValue().add(musicList.get(i));
												System.out.println("存入成功！");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
										if (i == musicList.size()) {
											System.out.println("无此歌曲！");
										}
									} else if (k == 2) {
										System.out.println("请输入歌曲id：");
										n = sc.nextInt();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicId() == n) {
												((Music) (musicList.get(i))).setDateTime(df.format(date));
												entry.getValue().add(musicList.get(i));
												System.out.println("存入成功！");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
										if (i == musicList.size()) {
											System.out.println("无此歌曲！");
										}
									}
								} else if (k == 2) {
									System.out.println("1-利用歌名删除，2-利用歌曲ID删除");
									System.out.println("请输入删除方式：");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("请输入歌曲名称：");
										str = sc.next();
										for (i = 0; i < entry.getValue().size(); i++) {
											if (((Music) (entry.getValue().get(i))).getMusicCate().equals(str)) {
												entry.getValue().remove(i);
												System.out.println("存入成功！");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
									} else if (k == 2) {
										System.out.println("请输入歌曲id：");
										n = sc.nextInt();
										for (i = 0; i < entry.getValue().size(); i++) {
											if (((Music) (entry.getValue().get(i))).getMusicId() == n) {
												entry.getValue().remove(i);
												System.out.println("存入成功！");
												User.put(yonghuming, entry.getValue());
												break;
											}
										}
									}
								} else if (k == 3) {
									System.out.println("1-利用歌名修改，2-利用歌曲ID修改");
									System.out.println("请输入修改方式：");
									k = sc.nextInt();
									if (k == 1) {
										System.out.println("请输入要修改的歌曲名：");
										str = sc.next();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicName().equals(str)) {
												System.out.println("请输入新的歌曲名：");
												str = sc.next();
												((Music) (musicList.get(i))).setMusicName(str);
												System.out.println("存入成功！");
												User.put(yonghuming, musicList);
												break;
											}
										}
									} else if (k == 2) {
										System.out.println("请输入要修改的歌曲id：");
										n = sc.nextInt();
										for (i = 0; i < musicList.size(); i++) {
											if (((Music) (musicList.get(i))).getMusicId() == n) {
												System.out.println("请输入新的歌曲id：");
												n = sc.nextInt();
												((Music) (musicList.get(i))).setMusicId(n);
												System.out.println("存入成功！");
												User.put(yonghuming, list1);
												break;
											}
										}
									}
								}

							} else if (k == 3) {
								m = 0;
								while (true) {
									System.out.println("1-播放,2-结束播放");
									System.out.println("请输入操作：");
									n = sc.nextInt();
									if (n == 1) {
										f = m;
										for (; f < musicList.size();) {
											System.out.println("当前正在播放:" + ((Music) (musicList.get(f))).getMusicName());
											System.out.println("3-暂停，-4结束播放,5-播放下一首");
											System.out.println("请输入操作：");
											k = sc.nextInt();
											if (k == 3) {
												m = f;
												f = musicList.size() + 1;
												System.out.println("暂停成功");
											} else if (k == 4) {
												break;
											} else if (k == 5)
												f++;
										}
									} else if (n == 2 || k == 4) {
										System.out.println("结束播放");
										break;
									}
								}
							} else if (k == 4) {
								for (i = 0; i < yonghu.size(); i++) {
									if (((User) (yonghu.get(i))).getUserId().equals(yonghuming))
										break;
								}
								System.out.println("1-用户ID，2-用户名，3-用户密码，4-用户昵称，5-用户生日，6-用户个性签名");
								System.out.println("请输入要修改的信息");
								k = sc.nextInt();
								if (k == 1) {
									System.out.println("请输入修改后的用户ID");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserId(str);
								} else if (k == 2) {
									System.out.println("请输入修改后的用户名");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserName(str);
								} else if (k == 3) {
									System.out.println("请输入修改后的用户密码");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserCode(str);
								} else if (k == 4) {
									System.out.println("请输入修改后的用户昵称");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserNick(str);
								} else if (k == 5) {
									System.out.println("请输入修改后的用户生日");
									str = sc.next();
									((exam.User) yonghu.get(i)).setUserBirth(str);
								} else if (k == 6) {
									System.out.println("请输入修改后的用户个性签名");
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