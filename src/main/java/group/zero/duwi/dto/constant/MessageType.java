package group.zero.duwi.dto.constant;

// objectType类型
public interface MessageType
{
	// 请求登录的类�?
	public static interface Login
	{
		// 用户登录,不返回任何信�?
		public final static int NULL = 0;
		// 用户登录,只返回账户信�?
		public final static int ACCOUNT = 0;
		// 用户登录,只返回评价信�?
		public final static int APPRAISAL = 0;
		// 用户登录,只返回偏�?
		public final static int FAVOR = 0;
		// 用户登录,只返回信�?
		public final static int CREDIT = 0;
		// 用户登录,只返回账�?,偏好,信用和评价信�?
		public final static int APPRAISAL_ACCOUNT_FAVOR_CREDIT = 0;
		// 用户登录,只返回账户创建的活动信息
		public final static int CREATE_ACTIVITIES = 0;
		// 用户登录,只返回账户参与的活动信息
		public final static int JOIN_ACTIVITIES = 0;
		// 用户登录,只返回账户所有活动信�?
		public final static int ALL_ACTIVITIES = 0;
		// 用户登录,返回账户全部信息
		public final static int ALL = 0;
		// 用户登出
		public final static int LOGOUT = 1;
		// 用户重登�?
		public final static int RELOGIN = 1;
	}
	// 请求活动的类�?*关于活动这一块的请求操作类型，是否按角色分类�?下更好：
	// 1.游客：search
	// 2.创建�?:Publish, Edit, Republish, Cancel ...
	// 3.参与者：Join In, Drop Out, Appraisal ...
	public static interface Activity
	{
		// 活动查找
		public final static int SEARCH = 2;
		// 用户创建活动(以及提示)
		public final static int PUBLISH = 3;
		public final static int PUBLISH_TIP = 4;
		// 创建人编辑活�?(以及提示)
		public final static int EDIT = 15;
		public final static int EDIT_TIP = 16;
		// 创建人重启活�?(以及提示)
		public final static int REPUBLISH = 5;
		public final static int REPUBLISH_TIP = 6;
		// 创建人删除活�?(以及提示)*改成创建人取消活动比较好，活动删除由后台统一操作
		public final static int REMOVE = 7;
		public final static int REMOVE_TIP = 8;
		// 创建人开始活�?(以及提示)
		public final static int START = 9;
		public final static int START_TIP = 10;
		// 创建人结束活�?(以及提示)
		public final static int END = 11;
		public final static int END_TIP = 12;
		// 创建人关闭活�?(以及提示)*是否和前面的Remove 重复，创建人的操作本来就复杂了，应该要精�?�?�?
		public final static int CLOSE = 13;
		public final static int CLOSE_TIP = 14;
		// 创建人的详细信息
		public final static int CREATOR_ACCOUNT = 21;
		// 活动参与
		public static interface Join
		{
			// 参与人加入活�?(以及提示)
			public final static int IN = 17;
			public final static int IN_TIP = 18;
			// 参与人�??出活�?(以及提示)
			public final static int OUT = 19;
			public final static int OUT_TIP = 20;
			// 参与人的详细信息
			public final static int INNER_ACCOUNTS = 22;
			// �?出人的详细信�?
			public final static int OUTTER_ACCOUNTS = 23;
		}
		// 活动评价
		public static interface Appraisal
		{
			// 参与人给与活动评�?(以及提示)
			public final static int JOINER_TO_CREATOR = 23;
			public final static int JOINER_TO_CREATOR_TIP = 23;
			// 活动创建人给参与人评�?(以及提示)
			public final static int CREATOR_TO_JOINER = 23;
			public final static int CREATOR_TO_JOINER_TIP = 23;
			// 查看该活动中和自己有关的评论
			public final static int VIEW_APPRAISAL_SELF = 23;
			// 查看该活动中全部评论
			public final static int VIEW_APPRAISAL_ALL = 23;
		}
	}
	// 请求账户的类�?
	public static interface Account
	{
		// 用户帐号Id查询
		public final static int QUERY = 24;
		// 用户注册
		public final static int CREATE = 24;
		// 用户编辑个人信息
		public final static int EDIT = 24;
		// 用户删除
		public final static int REMOVE = 24;
	}
	// 请求偏好的类�?
	public static interface Favor
	{
		// 查看自己的偏�?
		public final static int SELECT = 25;
		// 用户更新个人偏好
		public final static int UPDATE = 26;
	}
	// 请求信誉的类�?
	public static interface Credit
	{
		// 查询用户信誉
		public final static int SELECT = 24;
		// 更新用户信誉 *这个应该是后台统�?处理，比如当用户的评价积累到�?定程度，后台设定的触发器会自动更新用户的信誉等级，�?�不应该放在客户端的接口里面
		public final static int UPDATE = 24;
	}
}
