package group.zero.duwi.dto.integration.property;

// 个人信息以及信息回复
public class ExtraInfo
{
	// 文本信息
	private String text;
	// 语音信息地址
	private String audioUrl;
	// 视频信息地址
	private String videoUrl;

	public ExtraInfo()
	{
		super();
	}

	public ExtraInfo(String text, String audioUrl, String videoUrl)
	{
		super();
		this.text = text;
		this.audioUrl = audioUrl;
		this.videoUrl = videoUrl;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public String getAudioUrl()
	{
		return audioUrl;
	}

	public void setAudioUrl(String audioUrl)
	{
		this.audioUrl = audioUrl;
	}

	public String getVideoUrl()
	{
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl)
	{
		this.videoUrl = videoUrl;
	}
}
