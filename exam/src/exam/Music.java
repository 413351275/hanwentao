package exam;


public class Music {
	private int MusicId;
	private String MusicName;
	private String MusicSinger;
	private String MusicCate;
	private String DateTime;

	public String getDateTime() {
		return DateTime;
	}

	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}

	public int getMusicId() {
		return MusicId;
	}

	public void setMusicId(int musicId) {
		MusicId = musicId;
	}

	public String getMusicName() {
		return MusicName;
	}

	public void setMusicName(String musicName) {
		MusicName = musicName;
	}

	public String getMusicSinger() {
		return MusicSinger;
	}

	public void setMusicSinger(String musicSinger) {
		MusicSinger = musicSinger;
	}

	public String getMusicCate() {
		return MusicCate;
	}

	public void setMusicCate(String musicCate) {
		MusicCate = musicCate;
	}

	public Music(int musicid, String musicName, String musicSinger, String musicCate) {
		this.MusicId = musicid;
		this.MusicName = musicName;
		this.MusicCate = musicCate;
		this.MusicSinger = musicSinger;
	}
	public String toString() {
		return "歌曲ID为："+MusicId+"歌曲名称为："+MusicName+"歌手为："+MusicSinger+"歌曲类别为："+MusicCate;
	}

}
