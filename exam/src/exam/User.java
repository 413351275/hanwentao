package exam;

public class User {
	private String UserId;
	private String UserName;
	private String UserCode;
	private String UserNick;
	private String UserBirth;
	private String UserSign;
	public User(String UserId,String UserName,String UserCode,String UserNick,String UserBirth,String UserSign) {
		this.UserId=UserId;
		this.UserName=UserName;
		this.UserCode=UserCode;
		this.UserNick=UserNick;
		this.UserBirth=UserBirth;
		this.UserSign=UserSign;

	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserCode() {
		return UserCode;
	}

	public void setUserCode(String userCode) {
		UserCode = userCode;
	}

	public String getUserNick() {
		return UserNick;
	}

	public void setUserNick(String userNick) {
		UserNick = userNick;
	}

	public String getUserBirth() {
		return UserBirth;
	}

	public void setUserBirth(String userBirth) {
		UserBirth = userBirth;
	}

	public String getUserSign() {
		return UserSign;
	}

	public void setUserSign(String userSign) {
		UserSign = userSign;
	}

}
