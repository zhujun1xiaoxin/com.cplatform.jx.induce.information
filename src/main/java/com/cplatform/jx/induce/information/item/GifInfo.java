package com.cplatform.jx.induce.information.item;

public class GifInfo {

	/**X 坐标*/
	private int x;
	/**Y 坐标*/
	private int y;
	/**显示区域宽度*/
	private int showWidth;
	/**显示区域高度*/
	private int showHight;
	/**文件名称*/
	private String fileName;
	/**播放时长*/
	private int playTime;
	/**播放次数*/
	private int playNum;
	/**背景颜色 */
	private int backColor;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getShowWidth() {
		return showWidth;
	}
	public void setShowWidth(int showWidth) {
		this.showWidth = showWidth;
	}
	public int getShowHight() {
		return showHight;
	}
	public void setShowHight(int showHight) {
		this.showHight = showHight;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public int getPlayNum() {
		return playNum;
	}
	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}
	public int getBackColor() {
		return backColor;
	}
	public void setBackColor(int backColor) {
		this.backColor = backColor;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer(100);
		buf.append(this.x).append(",");
		buf.append(this.y).append(",");
		buf.append(this.showWidth).append(",");
		buf.append(this.showHight).append(",");
		buf.append(this.fileName).append(",");
		buf.append(this.playTime).append(",");
		buf.append(this.playNum).append(",");
		buf.append(this.backColor);
		return buf.toString();

	}
}
